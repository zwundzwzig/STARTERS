package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;
import DTO.MemberDTO;

@WebServlet("/logindb")
public class LoginDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8;");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		if(id == null || pw == null) {
			out.println("필요 정보 모두 입력하시오.");
			out.close();
		}
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMember(id, pw);
		
		String result = "";
		if(dto != null && dto.getPw()!= null) {
			result = "<h1>" + id + "회원님 로그인 완료</h1>";
		}
		else if(dto != null && dto.getPw() == null) {
			result = "<h1>" + id + "님 비밀번호를 확인해주세요."
					+ "<br /><a href='login_db.html'>다시 로그인 하러 가기</a></h1>";
		}
		else if(dto == null) {
			result = "<h1>ddd<a href='insert_db.html>회원가입하러 가기</a></h1>";
		}
		
		out.println(result);
	}

}
