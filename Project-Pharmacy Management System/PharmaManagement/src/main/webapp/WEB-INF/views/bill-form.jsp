<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Livewell Pharmacy</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/medicine-add-form.css"/>
</head>

<body bgcolor="#66e0ff">

<div class ="first">
<h1>Livewell Pharmacy's Management System</h1>
</div>

<div class="one">
<form:form action="saveBill"  method="POST" modelAttribute="bill" >
<table>
			<tbody>
				  <tr>
					<td><label>Bill Number :</label></td>
					<td><form:input path="billNo" /></td>
					<form:errors path="billNo" cssClass="error"/>
				</tr>
				  <tr>
					<td><label>Bill Date :</label></td>
					<td><form:input path="billDate" placeholder="yyyy-mm-dd" /></td>
					<form:errors path="billDate" cssClass="error"/>
				</tr>
			    <tr>
					<td><label>Medicine_ID :</label></td>
					<td><form:input path="id" /></td>
					<form:errors path="id" cssClass="error"/>
				</tr>
				<tr>
					<td><label>Medicine Name :</label></td>
					<td><form:input path="medName" /></td>
					<form:errors path="medName" cssClass="error"/>
				</tr>
					<tr>
					<td><label>Manufacturing Company :</label></td>
					<td><form:input path="manufacComp" /></td>
					<form:errors path="manufacComp" cssClass="error"/>
				</tr>
				<tr>
					<td><label>Units :</label></td>
					<td><form:input path="units" /></td>
					<form:errors path="units" cssClass="error"/>
				</tr>
				<tr>
					<td><label>Price per Unit :</label></td>
					<td><form:input path="pricepu" /></td>
					<form:errors path="pricepu" cssClass="error"/>
				</tr>
				
				<tr>
					<td><label>Tax :</label></td>
					<td><form:input path="tax" /></td>
					<form:errors path="tax" cssClass="error"/>
				</tr>
				<tr>
					<td><label>Total :</label></td>
					<td><form:input path="total" /></td>
					<form:errors path="total" cssClass="error"/>
				</tr>
				
		
				
				<tr>
					<td><input type="submit" value="Save" class="save"></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	
	<button><a href="http://localhost:8081/PharmaManagement/success?username=admin&password=admin">Back to HomePage</a></button>
	
</body>
</html>