<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: THANG
  Date: 8/1/2019
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<c:url value="/UserController"/>" method="post">
    <input type="text" name="usename">
    <input type="pass" name="password">
    <button type="submit">Submit</button>
</form>
</body>
</html>
