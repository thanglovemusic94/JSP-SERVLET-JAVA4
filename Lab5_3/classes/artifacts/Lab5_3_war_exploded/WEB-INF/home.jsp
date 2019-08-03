<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Danh Sach USER</h1>

		<form action="<c:url value="/HomeController"/>" method="post">
			<input type="text" name="usename">
            <br>
			<input type="pass" name = "password">
            <br>
			<button type="submit">Submit</button>
		</form>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>USE</th>
				<th>PASS</th>
				<th>isAdmin</th>
			</tr>

			<c:forEach items="${list}" var="list" varStatus="Count">
				<tr>
					<td><c:out value="${Count.count}" /></td>
					<td><c:if test="${list.user eq 'an' || list.user eq 'An' }">
							<p style="color: red">${list.user}</p>
						</c:if> <c:if test="${list.user ne 'an' && list.user ne 'An' }">
							<p>${list.user}</p>
						</c:if>
					<td>${list.pass}</td>

<%--					<td>${list.isAdmin()}</td>--%>
					<td>
						<c:if test="${list.isAdmin() eq true}">
							admin
						</c:if>
						<c:if test="${list.isAdmin() eq false}">
							user
						</c:if>
					</td>
				</tr>
			</c:forEach>

		</table>
	</center>
</body>
</html>
