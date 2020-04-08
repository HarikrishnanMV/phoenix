<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill List</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/medicine-list.css"/>
</head>
<body bgcolor="#66e0ff">
<div class="first">
<h1>Pharma Management System</h1>

<h3>Bill List</h3>
</div>
<div class="one">
<br>
<table border="1">
	    <tr>
	    	<td>Bill Number</td>
	    	<td>Bill Date</td>
		   <td>Medicine_ID</td>
		   <td>Medicine Name</td>
		      <td>Manufacturing Company</td>
		   <td>Units</td>
		   <td>Price per Unit</td>
		   <td>Tax</td>
		   <td>Total</td>
	       	
		   
	    </tr>
	    <c:forEach var="tempBill" items="${bill}">
		
			<tr>
				<td>${tempBill.billNo}</td>
				<td>${tempBill.billDate}</td>
				<td>${tempBill.id}</td>
				<td>${tempBill.medName}</td>
				<td>${tempBill.manufacComp}</td>
				<td>${tempBill.units}</td>
				<td>${tempBill.pricepu}</td>
				<td>${tempBill.tax}</td>
				<td>${tempBill.total}</td>
				
				
			</tr>
</c:forEach>
	</table>

	<button><a href="http://localhost:8081/PharmaManagement/success?username=admin&password=admin&submit=Login">Back to Home
			Page</a></button>

</div>
</body>
</html>