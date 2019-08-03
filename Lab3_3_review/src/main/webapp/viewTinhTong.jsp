<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="controllerTinhTong.jsp" method="get">
		Nhập a: <input type="text" name = "so1" value="${so1}">
		<br>
		Nhập b: <input type="text" name = "so2" value="${so2}">
		<br>
		<button type="submit">Tính tổng</button>
	</form>
	
	<h1><b>Kết quả: ${c}</b></h1>
</body>
</html>