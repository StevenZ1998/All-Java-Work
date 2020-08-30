package com.skillstorm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleMethods extends HttpServlet{
	
	/*
	 * LifeCycle
	 * init() : Called once
	 * service() : N number of times
	 * 			doGet()...
	 * 			doPost()...
	 * 			doPut...
	 * 			doDelete...
	 * destroy() : Once
	 */

	private static final long serialVersionUID = -3336480752665960690L;

	@Override
	public void init() throws ServletException {
		System.out.println("In init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In doGet");
	}
	
	@Override
	public void destroy() {
		System.out.println("In Destroy");
	}
	
}
