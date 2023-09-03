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
   
         
              
      <h2 style="text-align:center; ">View Appoinments</h2>
              
       
        
       
         <table class="table table-bordered">
         <p style="color:green;margin-left:470px;">${feedbackmessage}</p>
              <thead>
              <tr>
                 <th>id</th>
                 <th>JobSeekerName</th>
            
                 <th>Country</th>
                 <th>JobSeekerEmail</th>
                 <th>ConsultantName</th>
                 <th>ConsultantEmail</th>
                 <th>JobField</th>
                 <th>appointmentDate</th>
                 <th>State</th>
                <th>Select</th>
                 <th>Delete</th>
             
             
              </tr>
              </thead>
              <tbody>
              <tag:forEach var="ViewConsultant" items="${BookAppoinmentList}">
              
             <tr>
             <form action="BookAppoinment"  method="post">
				<td><input type="hidden" name="id" value="${ViewConsultant.id }">${ViewConsultant.id }</td>
				 <td><input type="hidden" name="jobseekerfirstname" value="${ViewConsultant.jobSeekerFirstName}">${ViewConsultant.jobSeekerFirstName}</td>
                 <td><input type="hidden" name="country" value="${ViewConsultant.country}">${ViewConsultant.country}</td>
                 <td><input type="hidden" name="jobseekeremail" value="${ViewConsultant.jobSeekerEmail}">${ViewConsultant.jobSeekerEmail}</td>
                 <td><input type="hidden" name="consultantfirstname" value="${ViewConsultant.consultantFirstName }">${ViewConsultant.consultantFirstName }</td>
                 <td><input type="hidden" name="consultantemail" value="${ViewConsultant.consultantEmail}">${ViewConsultant.consultantEmail}</td>
                 <td><input type="hidden" name="jobfield" value="${ViewConsultant.jobField}">${ViewConsultant.jobField}</td>
                  <td><input type="hidden" name="date" value="${ViewConsultant.appointmentDate}">${ViewConsultant.appointmentDate}</td>
           
                  <td><input type="hidden" name="state" value="${ViewConsultant.state }">${ViewConsultant.state }</td>
                  
                  <td>
                  <button type="submit" class="btn btn-success" name="actionType5" value="accept" >Accept</button>
                  </td>
                  
                  <td>
															
									<input type="hidden" name="id" value="${ViewConsultant.id}">
									<input type="hidden" name="actionType5" value="delete1">
									<button type="submit" class="btn btn-danger">Delete</button>
														
							</td>
                 
              </form>
                  
                  
                 
              
              
							
						
               
                  
             
						</tr>
					</tag:forEach>
				</tbody>
			</table>	
		</div>