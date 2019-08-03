<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<h1>Danh Sách Điện Thoại</h1>
	<h2>${msg}</h2>
	<form action="indexController" method="post">
		<label>Tên Thuê Bao</label>
		<input type="text" name="name">
		<br>
		<label>Số Diện Thoại</label>
		<input type="text" name="phone">
		<br>
		<label>Địa Chỉ</label>
		<input type="text" name="address">
		<br>
		
		<input type="submit" value="Tra Cứu">
		<br>
	</form>
</body>
</html>