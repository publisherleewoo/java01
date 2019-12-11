package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
//@WebServlet("/ServletInitParam")
public class ServletInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ServletInitParam() {
    	
        super();
        System.out.println("컨스트럭터");
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String path = getInitParameter("path");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println("아이디 : " + id + "<br />");
		writer.println("pw : " + pw + "<br />");
		writer.println("path : " + path);
		writer.println("</body></html>");
		
		writer.close();
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
