<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>PharmaManagementSystem</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/login.css"/>
	<script src="<c:url value="/resources/js/login.js" />"></script>
</head>
<body bgcolor="#66e0ff">

<div class="first">
<center>
<h1 class="size"><b>Livewell Pharmacy</b></h1>
</center>

<center>
<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;" >Login</button>
</center>
</div>

<div id="id01" class="modal">
  
  <form class="modal-content animate" form action="success" modelAttribute="admin">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <center><h2><b>Login</b></h2></center>
    </div>

    <div class="container">
      <label for="username"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="username" required>

      <label for="passwprd"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>
        
      <button type="submit" onSubmit="validateAdmin">Login</button>
      <button type="reset">Reset</button>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
    </div>
  </form>
</div>
</body>
</html>
