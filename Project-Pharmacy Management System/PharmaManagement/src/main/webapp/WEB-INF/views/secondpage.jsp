<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Livewell Pharmacy</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/secondpage.css"/>

</head>

<body bgcolor="#66e0ff">
<div class ="first">
<h1>LIVEWELL PHARMACY MANAGEMENT SYSTEM</h1>
</div>


<div class="two">
<form:form action="list"  method="POST" >
<input type="submit" value="View the medicines">
</form:form>

<form method="GET">
<input type="button" value="Add Medicine" onclick="window.location.href='addMedicine';return false;" class="add-button"/>
</form>

<form method="GET">
<input type="button" value="Update Medicine" onclick="window.location.href='upMedicine';return false;" class="add-button"/>
</form>

<form method="GET">
<input type="button" value="Delete Medicine" onclick="window.location.href='delMedicine';return false;" class="add-button"/>
</form>

<form method="GET">
<input type="button" value="Bill" onclick="window.location.href='bill';return false;" class="add-button"/>
</form>

<form:form action="viewBill"  method="POST" >
<input type="submit" value="View Bill Details">
</form:form>

</div>
<div class="three">
<form action="searchMedicine1" >
<input type="number" name="medicineId" placeholder="Medicine Id">
<input type="submit" value="Search" >
</form>

<form action="searchMedicine2" >
<input type="text" name="medName" placeholder="Medicine Name">
<input type="submit" value="Search" >
</form>

<form action="searchMedicine3" >
<input type="text" name="manufacComp" placeholder="Company Name">
<input type="submit" value="Search" >
</form>
</div>

</main>
</body>
</html>
