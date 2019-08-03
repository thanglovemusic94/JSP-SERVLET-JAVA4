<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="index.jsp" method="get">
		Nhập a: <input type="text" name = "so1">
		<br>
		Nhập b: <input type="text" name = "so2">
		<br>
		<button type="submit">Tính tổng</button>
	</form>
	<h2>Kết quả: </h2>
	<jsp:useBean id="cal" class="demo.indexModel">
	<jsp:setProperty property="*" name="cal"/>
	<b>
	<jsp:getProperty property="sum" name="cal"/>
	</b>
	</jsp:useBean>
</body>
</html>