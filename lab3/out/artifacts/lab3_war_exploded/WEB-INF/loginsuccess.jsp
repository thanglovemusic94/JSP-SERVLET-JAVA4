<%--
  Created by IntelliJ IDEA.
  User: THANG
  Date: 7/22/2019
  Time: 5:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<div align="center">
    <form action="<%=request.getContextPath()%>/search" method="post">
<%--        <input type="text" name="user" value="">--%>
        <button type="submit">Search</button>
    </form>
    <table border="1">
        <tr>
            <th>USENAME</th>
            <th>PASSWORD</th>
        </tr>
        <c:forEach var="list" items="${list}">
            <tr>
                <td>${list.username}</td>
                <td>${list.password}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
