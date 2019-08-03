<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>wellcome</title>
<style type="text/css">
* {
	margin: 0 auto;
	max-width: 80%;
	color: blue;
}
</style>
</head>
<body>
	<h4>wellcome: ${name}</h4>
	<h1>Wellcome to MVC</h1>
	<form action="LoginController" method="post">
		<label>UseName</label> <input type="text" name="useNameSearch"> <br>
		<button type="submit" name="btnAction" value="Search">Search</button>
	</form>

</body>
</html>