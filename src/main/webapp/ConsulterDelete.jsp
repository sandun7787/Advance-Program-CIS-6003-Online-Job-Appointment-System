<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


		<!-- Latest compiled and minified CSS -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!-- Latest compiled JavaScript -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>View All Consulters & Delete Specific</title>

<%@include file="../component/allcss.jsp"%>
</head>
<body>
 <%@include file="component/Consulter.jsp" %>
 
 <div class="container">
			
			<br/>
			<h2>View All Consulters & Delete Specific </h2>
					
			<br/>		
			<table class="table table-bordered">
			<p style='color:green' text='bolt'>${message}</p>	
				<thead>
					<tr>
					<th>ID</th>
				<th>Consultant First Name</th>
                 <th>Consultant Last Name</th>
                 <th>Country</th>
                 <th>Email</th>
                 <th>Job Field</th>
                 <th>Date</th>
                 <th>Time</th>
                 <th>Select</th>
					</tr>
				</thead>			
				<tbody>
					<tag:forEach var="AdminConsulter" items="${AdminConsulterList}">
						<tr>
				   <td>${AdminConsulter.id }</td>
				  <td>${AdminConsulter.firstName }</td>
                  <td>${AdminConsulter.lastName }</td>
                  <td>${AdminConsulter.country}</td>
                  <td>${AdminConsulter.email}</td>
                  <td>${AdminConsulter.jobField }</td>
                  <td>${AdminConsulter.date}</td>
                  <td>${AdminConsulter.time}</td>
							<td>
								<form action="adminconsulter" method="post">								
									<input type="hidden" name="id" value="${AdminConsulter.id}">
									<input type="hidden" name="actionType" value="delete">
									<button type="submit" class="btn btn-danger">Delete</button>
								</form>							
							</td>
						</tr>
					</tag:forEach>
				</tbody>
			</table>	
		</div>
 
</body>
</html>