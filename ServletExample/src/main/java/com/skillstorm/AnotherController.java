package com.skillstorm;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnotherController extends HttpServlet {
	
	private static final long serialVersionUID = -3366964784134571387L;

	public void postSomething() {
		System.out.println("Another Controller Post.");
	}

	public void getSomething(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Another Controller Get.");
		
		if(req.getCookies()!=null) {
		for(Cookie c : req.getCookies()) {
			if(c.getName().equals("Cookie")) {
				System.out.println("Found Cookie : " + c.getValue());
			}
		}
		
		// Remove cookie
		Cookie cookie = new Cookie("Cookie", "");
		cookie.setMaxAge(0);
		resp.addCookie(cookie);
		}
	}
	
}
