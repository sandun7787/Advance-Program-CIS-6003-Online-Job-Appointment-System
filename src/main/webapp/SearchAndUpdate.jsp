<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Job Appoinment System</title>
<%@include file="../component/allcss.jsp"%>

<!-- Latest compiled and minified CSS -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!-- Latest compiled JavaScript -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>	
</head>
<body>
 <%@include file="component/Consulter.jsp" %>
<div class="container">
			
		
			
			
			<br/>
			<h1>Search and update Consulter</h1>
			
			<p style='color:green'>${feebackMessage}</p>
			
			<form action="getadminconsulter" method="get">			
				<label for="AdminConsulterid">Enter  Code:</label>
				<input class="form-control" type="number" id="id" name="id" placeholder="Type the id code"/>
				<input type="hidden" name="actionType" value="single"/>
				<br/>
				<button type="submit" class="btn btn-success">Search</button>	
						
			</form>
			<hr/>
			<p style='color:green'>${feebackMessage}</p>
			
			<form action="adminconsulter" method="post">			
				<label for="AdminConsulteridUpdate">Product Code:</label>
				<input class="form-control" type="number" id="id" name="id" readonly="readonly" value="${AdminConsulter.id}"/>
				
				<label for="AdminConsulterfirstName">FirstName:</label>
				<input class="form-control" type="text" id="firstName" name="firstName" value="${adminConsulter.firstName()}"/>
				
				<label for="AdminConsulterlastName">LastName:</label>
				<input class="form-control" type="text" id="lastName" name="lastName" value="${adminConsulter.lastName()}"/>
				
				
				<label for="exampleCountry">Country</label>
                 <select class=" form-control"  name="country" value="${adminConsulter.country()}" >
                <option value="Australia">Australia</option>
                <option value="England">England</option>
               <option value="America">America</option>    
                </select>
				
				
				<label for="AdminConsulteremail">Email:</label>
				<input class="form-control" type="text" id="email" name="email" value="${adminConsulter.email()}"/>
				
				
				<div class="form-group">
                <label for="jobfield">JobField</label>
                <select class=" form-control"  id="jobfield" name="jobField" value="${adminConsulter.jobField()}">
                <option value="Agriculture">Natural Resources</option>
                <option value="Architecture and Construction">Architecture and Construction</option>
                <option value=" Communication"> Communication</option>
                <option value="Business and Finance">Business and Finance</option>
                <option value="Education and Training">Education and Training</option>
                 <option value="Farming ">Farming</option>
                  <option value="Health Science">Health Science</option>
                <option value="Information Technology">Information Technology</option>
                
               </select>
    
             
				
				<input type="hidden" name="actionType" value="edit"/>
				<br/>
				<button type="submit" class="btn btn-success">Update</button>			
			</form>
					
		</div>	

</body>
</html>