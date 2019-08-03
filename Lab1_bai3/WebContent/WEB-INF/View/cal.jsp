<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator</title>
</head>
<body>
<h3>may tinh online</h3>
	<form action="Controller" method="get">
		<input type="text" name = number1 value="">
		<br>
		<input type="text" name = number2 value="">
		<br>
		<button type="submit" name="action" value="+">+</button>
		<button type="submit" name="action" value="-">-</button>
		<button type="submit" name="action" value="*">*</button>
		<button type="submit" name="action" value="/">/</button>
		<button type="submit" name="action" value="hello">xin chao</button>
		<a href="Controller?action=hello">xin chao</a>
	</form>

</body>
</html>