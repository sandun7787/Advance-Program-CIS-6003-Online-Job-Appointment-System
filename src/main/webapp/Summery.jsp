<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accepted Job Report</title>

<%@include file ="component/allcss.jsp" %>
</head>
<body>

<%@include file="component/adminNav.jsp" %>

  <div class="container">
         
              
               <h2 style="text-align:center;">Accepted Job Seeker Report</h2>
               <p style='color:green'>Accepted Job Seeker Report</p>
                <p style='color:green'>${feedbackmessage}</p>
        
       
           <table class="table table-bordered">
              <thead>
              <tr>
                 <th>id</th>
                 <th>Job Seeker Full Name</th>
                 <th>Consultant Full Name</th>
                 <th>Appointment Date</th>
                 <th>Email</th>
                 <th>Phone Number</th>
                 <th>Location</th>
                 <th>Session</th>
                 <th>Address</th>
              </tr>
              </thead>
              <tbody>
              
              <tag:forEach var="product" items="${AcceptList}">
						<tr>
							<td>${product.id}</td>
							<td>${product.fullName}</td>
							<td>${product.consultername}</td>
							<td>${product.appoinDate}</td>
							<td>${product.email}</td>
							<td>${product.phNo}</td>
							<td>${product.location}</td>
							<td>${product.session}</td>
							<td>${product.address}</td>
							
															
							
						</tr>
					</tag:forEach>
				</tbody>
			</table>	
		</div>

</body>
</html>