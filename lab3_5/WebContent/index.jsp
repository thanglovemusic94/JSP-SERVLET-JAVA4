<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>MY JSP PAGE</TITLE>
</HEAD>
<BODY>
	<%
		int num = 8;
		if (num > 5) {
	%>
	<H3>hi</H3>
	<%
		} else {
	%>
	<h3>num value should not be less than 6</h3>
	<%
		}
	%>
	
</BODY>
</HTML>
