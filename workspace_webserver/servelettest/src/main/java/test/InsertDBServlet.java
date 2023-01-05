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

@WebServlet("/signup")
public class InsertDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8;");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String mail = req.getParameter("mail");
		String address = req.getParameter("address");
		
		if(id.equals("") || pw.equals("") || name.equals("") || phone.equals("") || mail.equals("") || address.equals("")) {
			out.write("<script>alert('필요 정보 모두 입력하시오.');location.href='/servelettest/insert_db.html';</script>");
			out.close();
		}
		
		MemberDTO dto = new MemberDAO().getMember(id, pw);
		if (dto != null) {
			out.write("<script>alert('아이디 중복입니다. 다른 아이디 입력해 주세요.');location.href='/servelettest/insert_db.html';</script>");
			out.close();
		}
		
		int count = new MemberDAO().insertMember(new MemberDTO(id, pw, name, mail, phone, address));
		out.println("<h1> " + count + "개의 데이터가 새로 입력됐어요.</h1>");
	}

}
