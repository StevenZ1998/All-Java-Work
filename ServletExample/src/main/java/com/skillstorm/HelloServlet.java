package com.skillstorm;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1. Extend  HttpServlet
// 2. Override http methods: doGet(), doPost(), doPut()...
// 3. Declare URL in WEB-INF/web.xml
public class HelloServlet extends HttpServlet {
	
	/*
	 * get - read
	 * post - create
	 * put - updates
	 * delete - delete
	 */

	private static final long serialVersionUID = -7473827327499412558L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In DoGet.");
		System.out.println("URL : " + req.getRequestURL() );
		System.out.println("URI : " + req.getRequestURI() );
		System.out.println("Request Method : " + req.getMethod() );
		System.out.println("Init Parameter : " + this.getInitParameter("initParam"));
		System.out.println(getServletContext().getInitParameter("contextParam"));
		
		/*
		 *  Write directly to http response body.
		PrintWriter out = resp.getWriter();
		out.println("Hello");
		*/
		
		resp.sendRedirect("hello.html");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Write directly to http response body
		
		String aName = req.getParameter("animalname");
		String aColor = req.getParameter("animalcolor");
		
		PrintWriter out = resp.getWriter();
		out.println("You are in doPost.\n Animal Name : " + aName + ".\n Animal Color : " + aColor + ".");
	}
	
}
