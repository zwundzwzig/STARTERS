package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginprocess")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] title = request.getParameterValues("title");
		
		response.setContentType("text/html; charset=utf-8;");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<h1>" + id + " 회원님 환영합니다." + "</h1>");
		out.println("<h1>" + pw + " 회원님 환영합니다." + "</h1>");
		for(String t : title) {
			out.println("<h1>" + t + " 회원님 환영합니다." + "</h1>");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getMethod());
		response.setCharacterEncoding("utf-8");
		doGet(request, response);
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		String[] title = request.getParameterValues("title");
//		
//		response.setContentType("text/html; charset=utf-8;");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out = response.getWriter();
//		out.println("<h1>" + id + " 회원님 환영합니다." + "</h1>");
//		out.println("<h1>" + pw + " 회원님 환영합니다." + "</h1>");
//		for(String t : title) {
//			out.println("<h1>" + t + " 회원님 환영합니다." + "</h1>");
//		}
	}

}
