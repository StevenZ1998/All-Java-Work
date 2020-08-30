package com.skillstorm.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		if(req.getSession().getAttribute("userInfo") == null) {
			if(req.getMethod().equals("POST")) {
				String user = req.getParameter("username");
				String pass = req.getParameter("password");
				
				// Call DAO.
				// Using hardcoded logic here.
				if(user != null && pass != null && user.equals("admin") && pass.equals("password")) {
					// If user exists
					req.getSession().setAttribute("UserInfo",  user);
					chain.doFilter(req, resp);
				}
				else {
					// Not logged in.
					resp.setStatus(401); // UNauthorized access.
				}
			}
			else if(req.getMethod().equals("GET")) {
				resp.sendRedirect("/loginproject/login.html");
			}
		}
		else {
			chain.doFilter(req, resp);;
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
