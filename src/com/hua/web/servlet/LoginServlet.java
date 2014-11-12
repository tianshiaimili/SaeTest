package com.hua.web.servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hua.web.dao.SqlManager;

public class LoginServlet extends HttpServlet{

	String sql = "select password from User where username = ?";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		super.doGet(req, resp);
		String username = request.getParameter("username");
		String password = request.getParameter("password").trim();
		System.out.println("-----------------------");
		System.out.println("password=="+password+"    username== "+username);
		if(username != null && !username.equals("")){
			try {
				SqlManager manager = SqlManager.createInstance();
				manager.connectDB();
				ResultSet resultSet = manager.executeQuery(sql, new String[]{username});
				if(resultSet.next()){
					String tempPW = resultSet.getString("password").trim();
					
					System.out.println("password=="+password+"    tempPW=="+tempPW);
					System.out.println("**************success=="+(tempPW.equals(password)));
					if(tempPW.equals(password)){
						System.out.println("**************success");
						request.getRequestDispatcher("/success.jsp").forward(request, response);
					}else {
						request.getRequestDispatcher("/login.jsp").forward(request, response);
					}
				}else {
					request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}else {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		super.doPost(req, resp);
		doGet(request, response);
		
	}
	
}
