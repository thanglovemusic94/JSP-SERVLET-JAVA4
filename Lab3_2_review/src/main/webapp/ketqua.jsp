<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String so1 = request.getParameter("so1");
		String so2 =request.getParameter("so2");

		String c = "";
		if((so1 != null && so1.length()>0 && so1.matches("\\d+")) && (so1 != null && so1.length()>0 && so2.matches("\\d+"))){
			int d = Integer.parseInt(so1) + Integer.parseInt(so2);	
			c = String.valueOf(d);
		}else c = "khong co du lieu hoac sai kieu du lieu";
		
	%>
	<h2>Tổng:  <%= c %></h2>
	
</body>
</html>