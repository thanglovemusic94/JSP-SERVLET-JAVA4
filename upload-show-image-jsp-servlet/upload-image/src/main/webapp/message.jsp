<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload Result</title>
</head>
<body>
	<fieldset>
		 <h2>URL image: ${message}</h2>
		 <c:forEach var = "item" items="${urlImages}">
		 	<img src="data:image/jpeg;base64,${item}" />
		 </c:forEach>
	</fieldset>
</body>
</html>