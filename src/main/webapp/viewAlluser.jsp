<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Users</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />


</head>
<body>

<%@include file ="component/adminNav.jsp" %>
     
         <div class="container">
         
              
               <h2 style="text-align:center;">View Users</h2>
               
                <p style="color:green">${feedbackmessage}</p>
        
       
           <table class="table table-bordered">
              <thead>
              <tr>
               
                 <th>Id</th>
                 <th> First Name</th>
                 <th> Last Name</th>
                 <th>Email</th>
                 <th>Password</th>
                 <th>Delete</th>
          
                
              </tr>
              </thead>
              <tbody>
               <tag:forEach var="user" items="${UserList}">
						<tr>
							
							<td>${user.id}</td>
							<td>${user.firstName}</td>
							<td>${user.lastName}</td>
							<td>${user.email}</td>
							<td>${user.password}</td>
							 <td>
							 <form action="UserRegister" method="post">								
									<input type="hidden" name="id" value="${user.id}">
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