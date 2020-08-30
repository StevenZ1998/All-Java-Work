package com.skillstorm;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class FilterExample implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("In Filter Init.");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filtering...");
		
		String blocked = request.getParameter("blocked");
		
		if(blocked != null && blocked.equals("true")) {
			response.getWriter().write("Your request is blocked");
			((HttpServletResponse)response).setStatus(401);
		}
		else {
			chain.doFilter(request, response);
		}
		
		// localhost:8080/ServletExample?hello?blocked=true
	}

	@Override
	public void destroy() {
		System.out.println("In Filter Destroy.");
	}
	
	
	
}
