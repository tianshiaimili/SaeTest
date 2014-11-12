package com.hua.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestBaiDuServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		super.doGet(req, resp);
		String path = req.getRequestURI();
		System.out.println("path =="+path);
		String path2 = req.getRequestURL().toString();
				System.out.println("path2 = ="+ path2);
		resp.sendRedirect("http://www.baidu.com");
//		req.getRequestDispatcher("www.baidu.com").forward(req, resp);
//		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
}
