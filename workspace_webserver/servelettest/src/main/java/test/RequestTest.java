package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request")
public class RequestTest extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getContextPath();
		System.out.println(request.getMethod());
		System.out.println(request.getRequestURI());
		System.out.println(request.getServletPath());
		System.out.println(request.getRemoteAddr());
//		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=utf-8;");
		response.getWriter().println("<h1>Hello Ouput</h1>");
		response.getWriter().println("<h1>안녕 클라이언트</h1>");
		response.getWriter().println("<script src='" + request.getContextPath() + "/jquery-3.6.1.min.js></script>");
	}

}
