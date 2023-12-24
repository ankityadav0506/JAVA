<%@page import="org.hibernate.query.NativeQuery"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session" %>
<%@page import="org.hibernate.query.Query" %>
<%@page import="java.util.List" %>
<%@page import="com.entities.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Notes</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
	<div class="container-fluid p-0 m-0">
    	<%@include file="Navbar.jsp" %>
    	<br>
    	<div class="container">
	    	<h1>Your Notes</h1>
	    	
	    	<div class="row">
	    		<div class="col-12">
			    	<% 
			    		Session s = FactoryProvider.getFactory().openSession();
			    		Query q = s.createQuery("from Note");
			    		List<Note> list = q.list();
			    		for (Note note : list){
			    	%>
			    	
			    		<div class="card mt-3">
						  <img src="img/notes.png" style="max-width:100px;" class="card-img-top m-4" alt="...">
						  <div class="card-body px-5">
						    <h5 class="card-title"><%= note.getTitle() %></h5>
						    <p class="card-text"><%= note.getContent() %></p>
						    <p><b class="text-primary"><%= note.getAddeddate() %></b></p>
						    <a href="DeleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a>
						    <a href="edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">Update</a>
						  </div>
						</div>
			    	<%
			    		}
			    		s.close();
			    	%>
	    		</div>
    		</div>
    	</div>
    </div>
</body>
</html>