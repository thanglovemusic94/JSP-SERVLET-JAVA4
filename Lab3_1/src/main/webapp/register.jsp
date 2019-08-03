<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<style type="text/css">
	*{
		margin: 0 auto;
		max-width: 80%;
		color: blue;
	}
</style>
</head>
<body>
	<h1>Login page</h1>
	<form action="LoginController" method="post">
		<label>UseName</label>
		<input type="text" name="useName">
		<br>
		<br>
		<label>passWord</label>
		<input type="password" name="passWord">
		<br>
		<br>
		<button type="submit" name = "btnAction" value="Login">Login</button>
		<button type="reset" value="Reset">Reset</button>
	</form>
</body>
</html>