package com.skillstorm.filters;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8339883502079128538L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uri = req.getRequestURI();
		if(uri.contains("logout")) {
			// Remove user attribute from the session.
			req.getSession().setAttribute("userInfo",  null);
			// Invalidate the session.
			req.getSession().invalidate();
			// Send user to login page.
			resp.sendRedirect("login.html");
			return;
		}
		else {
			resp.sendRedirect("/loginproject/main/index.html");
		}
		
		resp.sendRedirect("/loginproject/main/index.html");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("index.html").forward(req, resp);
		
	}
	
}
