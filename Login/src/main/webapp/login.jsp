<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username") != null){
			response.sendRedirect("welcome.jsp");
		}
	%>
	<form action="login" method="post">
		<label>Enter username : </label>
		<input type="text" name="uname"> <br>
		<label>Enter Password : </label>
		<input type="password" name="pass"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>