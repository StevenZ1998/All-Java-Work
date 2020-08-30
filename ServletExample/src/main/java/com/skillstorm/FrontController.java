package com.skillstorm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	
	private static final long serialVersionUID = 2195603057176390410L;
	
	AnotherController ac = new AnotherController();
	
	private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String uri = req.getRequestURI();
		
		Cookie cookie = new Cookie("Cookie", "CookieValue");
		resp.addCookie(cookie);
		
		if(uri.contains("Hello")) {
			resp.getWriter().append("Appended Response");
		}
		
		switch(uri) {
		case "/ServletExample/another":
			if(req.getMethod().equals("POST")) {
				ac.postSomething();
				return;
			}
			if(req.getMethod().equals("GET")) {
				ac.getSomething(req, resp);
				return;
			}
		default: break;
		}
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDispatch(req, resp);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDispatch(req, resp);
	}
}
