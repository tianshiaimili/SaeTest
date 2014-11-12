<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>test</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    德玛西亚 <br>
      啦啦啦啦<br>
      <a href="<%=path%>/getCategories?starttid=0&count=10">Click me please</a><br>
      path= <%=path%><br>
      basePath= <%=basePath%>
      <br>
      <a href="<%=path%>/myServletTest">Click me to test</a>
      <br>
      <a href="<%=path%>/login.jsp">Click me to Login</a>
      <br>
      <a href="<%=path%>/register.jsp">Click me to Register</a><br>
      <a href="<%=path%>/replys.jsp">Click me to 微信接收信息</a><br>
      <a href="<%=path%>/students.jsp">Click me to 学生信息</a><br>
      <a href="<%=path%>/classes.jsp">Click me to 班级信息</a><br>
      <a href="<%=path%>/exams.jsp">Click me to 考试信息</a><br>
  </body>
</html>
