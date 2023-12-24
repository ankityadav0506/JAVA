<!doctype html>
<html lang="en">
  <head>
    <title>Note Taker : Home Page</title>
	<%@include file="all_js_css.jsp" %>
  </head>
  <body>
    
    <div class="container-fluid p-0 m-0">
    	<%@include file="Navbar.jsp" %>
    </div>
    
    <br>
    <div class="card py-5">
    	<img class="img-fluid mx-auto" style="max-width:400px;" src="img/notes.png">
    	<h1 class="text-primary text-uppercase text-center mt-3">Start taking your notes</h1>
    	
    	<div class="container text-center">
    		<a href="add_notes.jsp"><button class="btn btn-outline-primary text-center">Start here</button></a>    	
    	</div>
    </div>

  </body>
</html>