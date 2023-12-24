<%@page import="com.helper.FactoryProvider, org.hibernate.*, com.entities.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
	<div class="container-fluid p-0 m-0">
    	<%@include file="Navbar.jsp" %>
    	<br>
    	<div class="container">
	    	<h1>Edit Your Note</h1>
	    	<%
	    		int noteId = Integer.parseInt(request.getParameter("note_id").trim());
	    		Session s = FactoryProvider.getFactory().openSession();
	    		Note note = (Note) s.get(Note.class, noteId);
	    	%>
	    	
	    	<form action="UpdateServlet" method="POST">
	    		<input value="<%= note.getId() %>" name="note_id" type="hidden">
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label" required>Title</label>
			    <input name="title" type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter title"
			    	value="<%= note.getTitle() %>"
			    >
			  </div>
			  <div class="mb-3">
			    <label for="content" class="form-label">Description</label>
			    <textarea name="content" id="content" placeholder="Type here.." required class="form-control" style="height:300px;"><%= note.getContent() %>
			    </textarea>
			  </div>
			  	<button type="submit" class="btn btn-success">Submit</button>		  
			  <div class="container">
			  </div>
			</form>
    	</div>
    </div>
</body>
</html>