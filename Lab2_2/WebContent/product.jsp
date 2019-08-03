<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${check}</h1>
	
	<!-- <a href="ProductForward">sgsgg</a> -->
	
	<form action="ProductForward" method="get">
		<table border="1">
			<tr>
				<th>Mã Sản Phẩm</th>
				<th>Tên Sản Phẩm</th>
				<th>Giá</th>
				<th></th>
			</tr>
			<c:forEach items="${listProduct}" var="l">
				<tr>
					<td>${l.code}</td>
					<td>${l.name}</td>
					<td>${l.price}</td>
					<td><input type="submit" value="Addtocart" name= "action"></td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="ViewCart" name = "action">
	</form>
</body>
</html>