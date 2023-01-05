package DAO;

import DTO.MemberDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	Connection con = null;
	PreparedStatement pt = null;
	int count = 0;

	public int insertMember(MemberDTO dto) {
		MemberDTO selecteddto = getMember(dto.getId(), dto.getPw());
		if (selecteddto != null) {
			System.out.println("아이디 중복입니다. 다른 아이디를 입력하세요");
			return 0;
		}

		try {
//			Class.forName(ConnectionInform.DRIVER_CLASS);
//			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);

			Context initContext = new InitialContext(); 
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/mydb"); 
			con = dataSource.getConnection();
			
			String sql = "insert into member values(?,?,?,?,?,?, now())";
			pt = con.prepareStatement(sql);
			pt.setString(1, dto.getId());
			pt.setString(2, dto.getPw());
			pt.setString(3, dto.getName());
			pt.setString(4, dto.getPhone());
			pt.setString(5, dto.getEmail());
			pt.setString(6, dto.getAddress());
			count = pt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
		return count;
	}

	int getTotalMember() {
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			String sql = "select count(*) from member";// 1행 1열(null / 숫자)
			pt = con.prepareStatement(sql);
			ResultSet rs = pt.executeQuery();
			rs.next();
			if (rs.getString("count(*)") == null) {
				count = 0;
			} else {
				count = rs.getInt("count(*)");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
		return count;
	}// getTotal

	ArrayList<MemberDTO> getMemberList(int page, int memberPerPage) {
		ArrayList<MemberDTO> list = new ArrayList();
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1.db 연결
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			String sql = "SELECT id, insert(pw, 2, char_length(pw)-1, repEAT(\"*\",char_length(pw)-1 ) ) as pw, "
					+ " name, indate FROM MEMBER ORDER BY INDATE LIMIT ?, ?";// 1행 1열(null / 숫자)
			pt = con.prepareStatement(sql);
			pt.setInt(1, (page - 1) * memberPerPage);// page=1,2, 3 0,3, 6인덱스
			pt.setInt(2, memberPerPage);
			ResultSet rs = pt.executeQuery();
			while (rs.next()) {
				MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("name"), rs.getString("indate"));
				dto.setPw(rs.getString("pw"));
				list.add(dto);
			}
			// dto 전달 내용을 member 테이블 입력
			// 회원가입일 now() 설정
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
		return list;
	}// getMemberList

	public MemberDTO getMember(String id, String pw) {
		MemberDTO dto = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1.db 연결
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			String sql = "select * from member where id=?";
			// rs.next() true
			pt = con.prepareStatement(sql);
			pt.setString(1, id);
			ResultSet rs = pt.executeQuery();
			if (rs.next()) { // id 존재시,
				String dbpw = rs.getString("pw");
				if (pw.equals(dbpw)) { // 암호 일치시,
					dto = new MemberDTO(rs.getString("id"), rs.getString("pw"), rs.getString("name"),
							rs.getString("email"), rs.getString("phone"), rs.getString("address"),
							rs.getString("indate"));
				} else {
					dto = new MemberDTO();
					dto.setId(rs.getString("id"));
					System.out.println("암호 맞지 않습니다. 4번 입력하세요");
				}
			} else {
				System.out.println("1번 회원가입부터 하세요");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}// getMember

	void updateMember(HashMap<String, String> updateMap) {

		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1.db 연결
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			StringBuffer sql = new StringBuffer();// 16문자버퍼+....
			sql.append("update member set ");
			Set<String> keys = updateMap.keySet();
			for (String k : keys) {
				if (!k.equals("id")) {
					sql.append(k + "= '" + updateMap.get(k) + "' , ");
				}
			}
			sql.deleteCharAt(sql.lastIndexOf(","));
			sql.append(" where id=?");

			System.out.println(sql);// 확인
			pt = con.prepareStatement(sql.toString());
			pt.setString(1, updateMap.get("id"));
			pt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
	}// updateMember

	void deleteMember(String id) {

		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1.db 연결
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			con.setAutoCommit(false);// 수동 트랜잭션 설정 변경/
			String sql1 = "insert into deletedmember select * from member where id=?";
			String sql2 = "delete from member where id=?";
			/////////////////////////////////////////
			pt = con.prepareStatement(sql1);
			pt.setString(1, id);
			int insertcount = pt.executeUpdate();
			//////////////////////////////////////////
			// 웹서버가 회원탈퇴요청 처리중- lock
			// 또다른 회원정보수정 처리중- lock
			pt = con.prepareStatement(sql2);
			pt.setString(1, id);
			int deletecount = pt.executeUpdate();// 예외발생
			////////////////////////////////////////
			con.commit();
			System.out.println("회원 탈퇴 처리 완료");
		} catch (Exception e) {
			System.out.println("회원 탈퇴 처리 중 문제 발생 - 취소");
			try {
				con.rollback();
			} catch (Exception e2) {
			}
			// e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
	}// deleteMember

}
