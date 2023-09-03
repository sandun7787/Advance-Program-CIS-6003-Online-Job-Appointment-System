<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Job Appointment</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />

<style type="text/css">

 


   
 </style>
</head>
<body>
<%@include file ="component/ConsultUserNavjsp.jsp" %>
     
  <div class="container">
   <pstyle="color:green">${feedbackmessage}</p>
         
              
      <h2 style="text-align:center; ">View Appoinments</h2>
              
       
        
       
         <table class="table table-bordered">
              <thead>
              <tr>
                 <th>id</th>
                 <th>JobSeekerFirstName</th>
                 <th>JobSeekerLastName</th>
                 <th>Country</th>
                 <th>JobSeekerEmail</th>
                 <th>ConsultantFirstNam</th>
                 <th>consultantLastName</th>
                 <th>ConsultantEmail</th>
                 <th>JobField</th>
                 <th>appointmentDate</th>
                 <th>appointmentTime</th>
                 
                <th>Select</th>
             
             
              </tr>
              </thead>
              <tbody>
              <tag:forEach var="ViewConsultant" items="${BookAppoinmentList1}">
             <tr>
				<td>${ViewConsultant.id }</td>
				 <td>${ViewConsultant.jobSeekerFirstName}</td>
                 <td>${ViewConsultant.jobSeekerLastName }</td>
                 <td>${ViewConsultant.country}</td>
                 <td>${ViewConsultant.jobSeekerEmail}</td>
                 <td>${ViewConsultant.consultantFirstName }</td>
                 <td>${ViewConsultant.consultantLastName }</td>
                 <td>${ViewConsultant.consultantEmail}</td>
                 <td>${ViewConsultant.jobField}</td>
                  <td>${ViewConsultant.appointmentDate}</td>
                   <td>${ViewConsultant.appointmentTime}</td>
                  
                  
                  
                  	</tr>
					</tag:forEach>
				</tbody>
			</table>	
		</div>