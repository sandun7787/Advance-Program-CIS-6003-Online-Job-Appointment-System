<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Consultant</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />
</head>
<body>
<%@include file ="component/UserNav.jsp" %>
     
         <div class="container">
         
              
               <h2 style="text-align:center;">View Consultant</h2>
               <p>View Your Consultants Now</p>
                <p style="color:green">${feedbackmessage}</p>
        
       
           <table class="table table-bordered">
              <thead>
              <tr>
                 <th>id</th>
                 <th>Consultant First Name</th>
                 <th>Consultant Last Name</th>
                 <th>Country</th>
                 <th>Email</th>
                 <th>Job Field</th>
                 <th>Date</th>
                 <th>Time</th>
                 <th>Select Consultants</th>
              </tr>
              </thead>
              <tbody>
              <tag:forEach var="AdminConsulter" items="${ConsultantList}">
              <tr>
               <form action="getadminconsulter" method="get">
                  <td><input type="hidden" name="id" value="${AdminConsulter.id}">${AdminConsulter.id}</td>
                  <td><input type="hidden" name="firstname" value="${AdminConsulter.firstName}">${AdminConsulter.firstName}</td>
                  <td><input type="hidden" name="lastname" value="${AdminConsulter.lastName }">${AdminConsulter.lastName }</td>
                  <td><input type="hidden" name="country" value="${AdminConsulter.country}">${AdminConsulter.country}</td>
                  <td><input type="hidden" name="email" value="${AdminConsulter.email}">${AdminConsulter.email}</td>
                  <td><input type="hidden" name="jobfield" value="${AdminConsulter.jobField}">${AdminConsulter.jobField}</td>
                  <td><input type="hidden" name="date" value="${AdminConsulter.date}">${AdminConsulter.date}</td>
                  <td><input type="hidden" name="time" value="${AdminConsulter.time}">${AdminConsulter.time}</td>
                
                   
                   <td>
                   					
									
					<input type="hidden" name="actionType" value="selectConsultant1">
					<button type="submit" class="btn btn-success">select</button>
							
                   
                   
                   </td>
                   
           
                
                  
               </tr>
               
              </tag:forEach>  
                  
              
              
              
              </tbody>
               
           </table>
           
        </div>
</body>
</html>