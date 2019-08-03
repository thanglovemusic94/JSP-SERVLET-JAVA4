<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File upload</title>
</head>
<body>
	<h1>File Upload Form</h1>
	<fieldset>
		<legend>Upload File</legend>
		<form action="UploadServlet" method="post" enctype="multipart/form-data">
			<label for="fileName">Select File: </label> 
			<input id="fileName" type="file" name="fileName" multiple="multiple" size="30" />
			<br/> 
			<input type="submit" value="Upload" />
		</form>
	</fieldset>
</body>
</html>