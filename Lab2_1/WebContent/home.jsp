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
	
	
	<h1>Kết quả tra Điện Thoại theo yêu cầu của bạn của Bạn</h1>
	<h2>${msg }</h2>
	<table border="1">
		<tr>
			<th>STT</th>
			<th>Tên Thuê Bao</th>
			<th>Số Điện Thoại</th>
			<th>Địa Chỉ</th>
		</tr>

		<c:forEach items="${listArray}" var="l" varStatus="Count" >
			<tr>
				<td><c:out value="${Count.count}"/></td>
				<td>${l.name}</td>
				<td>${l.phone}</td>
				<td>${l.address}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>