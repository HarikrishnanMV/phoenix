<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medicine List-Search By Id</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/medicine-search-form.css"/>
</head>
<body bgcolor="#66e0ff">
<div class="first">
<h1>Pharma Management System</h1>

<h3>Medicine List</h3>
</div>
<div class="one">
<br>
<table border="1">
	    <tr>
		   <td>Medicine_ID</td>
		   <td>Medicine Name</td>
		   <td>Units</td>
		   <td>Price per Unit</td>
		   <td>Manufacturing date</td>
		   <td>Expiriy Date</td>
	       	   <td>Manufacturing Company</td>
		   
	    </tr>
	    
		<c:url var="updateLink" value="/updateMedicine">
				<c:param name="medicineId" value="${tempMedicines.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="/deleteMedicine">
				<c:param name="medicineId" value="${tempMedicines.id}"></c:param>
			</c:url>
	    <tr>
				<td>${tempMedicines.id}</td>
				<td>${tempMedicines.medName}</td>
				<td>${tempMedicines.units}</td>
				<td>${tempMedicines.pricepu}</td>
				<td>${tempMedicines.manufacDate}</td>
				<td>${tempMedicines.expDate}</td>
				<td>${tempMedicines.manufacComp}</td>
				<td><a href="${updateLink}" class="red">Update</a>|
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false" class="red">Delete</a></td>
			</tr>
	</table>

	<button><a href="http://localhost:8081/PharmaManagement/success?username=admin&password=admin&submit=Login">Back to Home
			Page</a></button>

</div>
</body>
</html>