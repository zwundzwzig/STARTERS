package ExamTest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	Connection con = null;
	PreparedStatement pt = null;
	int count = 0;

	public void insertBook(BookDTO dto) {

		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);

			String sql = "INSERT INTO book values(?,?,?,?,?,?)";
			pt = con.prepareStatement(sql);
			pt.setString(1, dto.getBookNo());
			pt.setString(2, dto.getBookTitle());
			pt.setString(3, dto.getBookAuthor());
			pt.setString(4, dto.getBookYear() + "-01-01");
			pt.setInt(5, dto.getBookPrice());
			pt.setString(6, dto.getBookPublisher());
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
	};

	public void selectBook() {
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			String sql = "SELECT * FROM book";
			pt = con.prepareStatement(sql);
			ResultSet rs = pt.executeQuery();
			rs.next();
			System.out.println(rs);

			ArrayList<BookDTO> list = new ArrayList<>();
			list.add(new BookDTO("B001", "자바프로그래밍", "홍길동", 2021, 30000, "서울출판사"));
			list.add(new BookDTO("B002", "데이터베이스", "홍길동", 2020, 25000, "대한출판사"));
			list.add(new BookDTO("B003", "HTML/CSS", "성춘향", 2022, 18000, "민국출판사"));
			list.add(new BookDTO("B004", "HTML/CSS", "성춘향", 2022, 18000, "민국출판사"));
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
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
	};
}
