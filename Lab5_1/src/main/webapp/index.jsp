<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<table border="1" style="border-collapse: collapse; width: 500px;">
		<tr>
			<th scope="col">Concept</th>
			<th scope="col">Expression</th>
			<th scope="col">Result</th>
		</tr>
		<tr>
			<th scope="row">Cộng </th>
			<td>${"${"}5+5}</td>
			<td>${5+5}</td>
		</tr>
		<tr>
			<th scope="row">Trừ </th>
			<td>${"${"}5-5}</td>
			<td>${5-5}</td>
			
		</tr>
		<tr>
			<th scope="row">Nhân</th>
			<td>${"${"}5*5}</td>
			<td>${5*5}</td>
			
		</tr>
		<tr>
			<th scope="row">Chia</th>
			<td>${"${"}5/5}</td>
			<td>${5/5}</td>
			
		</tr>
	</table>
</body>
</html>