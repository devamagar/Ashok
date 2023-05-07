package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/test")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Demo() {
System.out.println("in demo constructor");
    }
public void init() {
	System.out.println("Init method");
}

  public void destroy() {
	System.out.println("In destroy method");
}  

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("in service method");
	//PrintWriter printWriter=response.getWriter();
	//printWriter.print("<h1>hii good morning all</h1>");
String username= request.getParameter("userName");
String password=request.getParameter("password");
System.out.println("userName "+username);
System.out.println("password"+password);
	
	}

}
