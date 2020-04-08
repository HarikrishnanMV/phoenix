<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update medicine list</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/medicine-update-form.css"/>
</head>
<body bgcolor="#66e0ff">
<div class="first">
<h1>Pharma MANAGEMENT SYSTEM</h1>

<h3>Update Medicines</h3>
</div>
<div class="one">
<form:form action="saveMedicine"  method="POST" modelAttribute="medicine" >
<table>
			<tbody>
			<tr>
					<td><label>Medicine_ID:</label></td>
					<td><form:input path="id" /></td>
				</tr>
				<tr>
					<td><label>Medicine Name:</label></td>
					<td><form:input path="medName" /></td>
				
				</tr>
				<tr>
					<td><label>Units:</label></td>
					<td><form:input path="units" /></td>
					
				</tr>
				<tr>
					<td><label>Price per Unit:</label></td>
					<td><form:input path="pricepu" /></td>
			
				</tr>
				<tr>
					<td><label>Manufacturing Date:</label></td>
					<td><form:input path="manufacDate" placeholder="yyyy-mm-dd" /></td>
				
				</tr>
				<tr>
					<td><label>Expiry Date:</label></td>
					<td><form:input path="expDate" placeholder="yyyy-mm-dd" /></td>
				
				</tr>
				<tr>
					<td><label>Manufacturing Company:</label></td>
					<td><form:input path="manufacComp" /></td>
					
				</tr>
				<tr>
					<td><input type="submit" value="Save" class="save"></td>
				</tr>
			
			</tbody>
		</table>
	</form:form>
	
		<button><a href="http://localhost:8081/PharmaManagement/success?username=admin&password=admin&submit=Login">Back to Home
			Page</a></button>
	
	</div>
</body>
</html>
