<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		
		<script language="Javascript">

		 /* function validateForm()
		    {
		        var code=document.forms["myForm"]["code"].value;
		        var name=document.forms["myForm"]["pname"].value;
		        var name=document.forms["myForm"]["short_name"].value;
		        var name=document.forms["myForm"]["partnercode"].value;
		        var name=document.forms["myForm"]["price_code"].value;
		        var name=document.forms["myForm"]["duration"].value;
		        
		        
		       var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value;
		        var name=document.forms["myForm"]["name"].value; 
		        
		        if (code==null || code=="")
		        {
		            alert("Please Fill Code Field");
		            return false;
		        }
		        if (pname==null || pname=="")
		        {
		            alert("Please Fill Plan Name Field");
		            return false;
		        }
		        
		        if (short_name==null || short_name=="")
		        {
		            alert("Please Fill Short Name Field");
		            return false;
		        }
		        
		        if (partnercode==null || partnercode=="")
		        {
		            alert("Please Fill Partner Code Field");
		            return false;
		        }
		        if (price_code==null || price_code=="")
		        {
		            alert("Please Fill Price Code Field");
		            return false;
		        }
		        if (duration==null || duration=="")
		        {
		            alert("Please Fill Duration Field");
		            return false;
		        }
		    } */
		</script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Awarti</title>
	</head>
	<body bgcolor="#D3D3D3">
		<h2 align="center">Create Plan</h2>
		<form:form name="myForm" method="POST" action="save.html" onsubmit="return validateForm()">
	   		<table border="0">
			    <%-- <tr>
			        <td><form:label path="id">Plan ID:</form:label></td>
			        <td><form:input path="id" value="${plan.id}" readonly="true"/></td>
			    </tr> --%>
			    <tr>
			        <td><form:label path="code">Plan Code:</form:label></td>
			        <td><form:input path="code" value="${plan.code}" name="code" id="code"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="name">Plan Name:</form:label></td>
			        <td><form:input path="name" value="${plan.name}" name="pname" id="pname"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="short_name">Short Name:</form:label></td>
			        <td><form:input path="short_name" value="${plan.short_name}" name="short_name" id="short_name"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="partnercode">Partner Code:</form:label></td>
			        <td><form:input path="partnercode" value="${plan.partnercode}" name="partnercode" id="partnercode"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="price_code">Price Code:</form:label></td>
			        <td><form:input path="price_code" value="${plan.price_code}" name="price_code" id="price_code"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="duration">Duration:</form:label></td>
			        <td><form:input path="duration" value="${plan.duration}" name="duration" id="duration"/></td>
			    </tr>
			<tr>
				<td><form:label path="duration_unit">Duration Unit:</form:label></td>
				<td><form:input path="duration_unit"
						value="${plan.duration_unit}"/></td>
			</tr>
			<tr>
				<td><form:label path="trial_days">Trial Days :</form:label></td>
				<td><form:input path="trial_days" value="${plan.trial_days}" /></td>
			</tr>
			<tr>
				<td><form:label path="refund_days">Refund Days:</form:label></td>
				<td><form:input path="refund_days" value="${plan.refund_days}" /></td>
			</tr>
			<tr>
				<td><form:label path="renewal_days">Renewal Days :</form:label></td>
				<td><form:input path="renewal_days"
						value="${plan.renewal_days}" /></td>
			</tr>
			<tr>
				<td><form:label path="recurring">Recurring :</form:label></td>
				<td><form:input path="recurring" value="${plan.recurring}" /></td>
			</tr>
			<tr>
				<td><form:label path="services">Services:</form:label></td>
				<td><form:input path="services" value="${plan.services}" /></td>
			</tr>
			<tr>
				<td><form:label path="status">Status:</form:label></td>
				<td><form:input path="status" value="${plan.status}" /></td>
			</tr>
			<tr>
				<td><form:label path="ptype">Ptype:</form:label></td>
				<td><form:input path="ptype" value="${plan.ptype}" /></td>
			</tr>
			<tr>
			        <td><form:label path="addongroup">Add On Group:</form:label></td>
			        <td><form:input path="addongroup" value="${plan.addongroup}"/></td>
			    </tr> 
			
			<tr>
				<td><form:label path="locked">Locked:</form:label></td>
				<td><form:input path="locked" value="${plan.locked}" /></td>
			</tr>
			<tr>
				<td><form:label path="is_upgradable">Upgradable:</form:label></td>
				<td><form:input path="is_upgradable" value="${plan.is_upgradable}" /></td>
			</tr>
			<tr>
				<td><form:label path="description">Description:</form:label></td>
				<td><form:input path="description" value="${plan.description}" /></td>
			</tr>
			<tr>
				<td><form:label path="mailer_descr">Mailer_descr:</form:label></td>
				<td><form:input path="mailer_descr" value="${plan.mailer_descr}" /></td>
			</tr>
			<tr>
				<td><form:label path="term_url">Term_url:</form:label></td>
				<td><form:input path="term_url" value="${plan.term_url}" /></td>
			</tr>
			<tr>
				<td><form:label path="app_ids">App_ids:</form:label></td>
				<td><form:input path="app_ids" value="${plan.app_ids}" /></td>
			</tr>

			  
		<%-- 	    <tr>
			        <td><form:label path="age">Employee Age:</form:label></td>
			        <td><form:input path="age" value="${employee.age}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="salary">Employee Salary:</form:label></td>
			        <td><form:input path="salary" value="${employee.salary}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="address">Employee Address:</form:label></td>
                    <td><form:input path="address" value="${employee.address}"/></td>
			    </tr> --%>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
  <%-- <c:if test="${!empty employees}">
		<h2>List Employees</h2>
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Age</th>
			<th>Employee Salary</th>
			<th>Employee Address</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"/></td>
				<td><c:out value="${employee.name}"/></td>
				<td><c:out value="${employee.age}"/></td>
				<td><c:out value="${employee.salary}"/></td>
				<td><c:out value="${employee.address}"/></td>
				<td align="center"><a href="edit.html?id=${employee.id}">Edit</a> | <a href="delete.html?id=${employee.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if> --%>
	</body>
</html>