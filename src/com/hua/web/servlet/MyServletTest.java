package com.hua.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		super.doGet(req, resp);
		String path = request.getContextPath();
		System.out.println("path==="+request.getContextPath());
//		String message = "<a href='http://www.baidu.com'>"+"Click me please1111"+"</a>";
		String message = "<a href='"+path+"/testBaiDuServlet'>"+"Click me please1221"+"</a>";
		PrintWriter writer = response.getWriter();
		writer.write(message);
		writer.close();
		
	}

	
	/**
	 * 
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		super.doPost(req, resp);
	}
	
}
