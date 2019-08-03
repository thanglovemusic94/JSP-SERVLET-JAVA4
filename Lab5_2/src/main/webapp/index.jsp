<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<h3>Tính Tổng 2 Số</h3>
	<form action="index.jsp">
		<label>
			Số 1: 
		</label>
		<input type="text" name="so1" value="${param.so1}">
		<br>
		<label>
			Số 2: 
		</label>
		<input type="text" name="so2" value="${param.so2}">
		<br>
		<input type="submit" value="Tính">
		<c:if test="${not empty param.so1 and not empty param.so2 }">
			<c:set var="kq" value=" ${param.so1 + param.so2}"></c:set>
			Kết quả: <c:out value="${kq }"></c:out>
		</c:if>
	</form>
</body>
</html>
