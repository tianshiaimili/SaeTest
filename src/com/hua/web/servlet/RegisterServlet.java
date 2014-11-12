package com.hua.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hua.web.dao.SqlManager;

public class RegisterServlet extends HttpServlet{

	String username = null;
	String password = null;

/**
 * CREATE TABLE `t_category` (
  `cid` int(20) NOT NULL,
  `title` varchar(50) default NULL,
  `sequnce` int(20) default NULL,
  `deleted` tinyint(1) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

这个是在SAE中创建
CREATE TABLE  `app_huyue520`.`testable` (`id` INT( 10 ) NOT NULL AUTO_INCREMENT ,
`age` VARCHAR( 50 ) NOT NULL ,
PRIMARY KEY (  `id` )
) ENGINE = MYISAM



 */


//	String sql = "create table User(id int auto_increment primary key not null ,username varchar(50),password varchar(50)) ENGINE=InnoDB DEFAULT CHARSET=utf8";
	String sql = "create table User(id INT(20) not null auto_increment ,username varchar(50),password varchar(50),primary key(id)) ENGINE=InnoDB DEFAULT CHARSET=utf8";
	String sql2 = "insert into User(username,password)values(?,?)";
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		super.doGet(req, resp);
		username = request.getParameter("username");
		password = request.getParameter("password");
		System.out.println(username +"   "+password);
		SqlManager manager;
		try {
			manager = SqlManager.createInstance();
			manager.connectDB();
			
			if(username != null && password != null){
				
				if(SqlManager.isExistTable("User")){
					if(manager.executeUpdate(sql2, new String[]{username,password})){
//						response.sendRedirect("/");
						request.getRequestDispatcher("/login.jsp").forward(request, response);
					}else {
						request.getRequestDispatcher("/register.jsp").forward(request, response);
					}
					
				}else {
					
					if(manager.executeUpdate(sql)){
					boolean ok = manager.executeUpdate(sql2, new String[]{username,password});
					if(ok){
						request.getRequestDispatcher("/login.jsp").forward(request, response);
					}else {
						request.getRequestDispatcher("/register.jsp").forward(request, response);
					}
					
					}else {
						request.getRequestDispatcher("/register.jsp").forward(request, response);
					}
				}
				
			}else {
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
}
