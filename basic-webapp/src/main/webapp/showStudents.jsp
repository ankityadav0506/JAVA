<%@page import="com.myapp.web.model.Students"%>
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
		Students s1 = (Students)request.getAttribute("student");
		out.println(s1);
	%>
</body>
</html>