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
		String so2 = request.getParameter("so2");
		request.setAttribute("c", "ban chua dien du lieu hoac sai kieu du lieu hoặc độ dài kiểu dữ liệu chưa đúng");
		// kiểu Int có tối đa 10 chữ số 4 byte
		if((so1 != null && so1.length()>0 && so1.length() <= 10 && so1.matches("\\d+")) && 
				(so1 != null && so1.length()>0&& so2.length() <= 10 && so2.matches("\\d+"))){
			int c = Integer.parseInt(so1) + Integer.parseInt(so2);
			request.setAttribute("so1", so1);
			request.setAttribute("so2", so2);
			request.setAttribute("c", c);
		}
		RequestDispatcher rd = request.getRequestDispatcher("viewTinhTong.jsp");	
		rd.forward(request, response);
	%>
</body>
</html>