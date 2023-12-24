<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all_js_css.jsp" %>
<title>Add Notes</title>
</head>
<body>
	  <div class="container-fluid p-0 m-0">
    	<%@include file="Navbar.jsp" %>
    	<br>
    	<div class="container">
	    	<h2>Add Note</h2>
	    	<form action="SaveNoteServlet" method="POST">
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">Title</label>
			    <input name="title" type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter title" required>
			  </div>
			  <div class="mb-3">
			    <label for="content" class="form-label">Description</label>
			    <textarea name="content" id="content" placeholder="Type here.." required class="form-control" style="height:300px;"></textarea>
			  </div>
			  <div class="container">
			  	<button type="submit" class="btn btn-primary">Submit</button>		  
			  </div>
			</form>
    	</div>
    </div>
</body>
</html>