<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consultant Add</title>
<%@include file="../component/allcss.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	 <%@include file="component/Consulter.jsp" %>
	<div class="container-fluid p-3">
		<div class="row">

			<div class="col-md-5 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">ADD CONSULTER</p>
						
			
					
						<form action="adminconsulter" method="post">
						
						
						<div class="form-group">
						<p  style="color:Green">${feedbackmessage}</p>
                          
                         <label for="exampleFirstName">First Name</label>
                       <input type="text" class="form-control" class="firstname" name="firstname" required>
    
                         </div>
                        <br/>
                           <div class="form-group">
                      <label for="exampleFirstName">Last Name</label>
                  <input type="text" class="form-control" class="lastname" name="lastname" required>
    
                          </div>
							
                       <br/>
  <div class="form-group">
    <label for="exampleCountry">Country</label>
    <select class=" form-control"  name="country" >
      <option value="Australia">Australia</option>
      <option value="England">England</option>
      <option value="America">America</option>    
    </select>
    
  </div>
  <br/>
  <script src="//cdn.tutorialjinni.com/jquery/3.6.1/jquery.min.js"></script>
  <script src="//cdn.tutorialjinni.com/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="//cdn.tutorialjinni.com/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>
  <script src="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/js/bootstrap-select-country.min.js"></script>
  <div class="form-group">
    <label for="email">Email</label>
    <input type="email" class="form-control" class="email" name="email" required>
    
  </div>
  <br/>
   <div class="form-group">
    <label for="jobfield">Job Field</label>
    <select class=" form-control" name ="jobfield">
      <option value="Agriculture">Natural Resources</option>
      <option value="Architecture and Construction">Architecture and Construction</option>
      <option value=" Communication"> Communication</option>
      <option value="Business and Finance">Business and Finance</option>
      <option value="Education and Training">Education and Training</option>
      <option value="Farming ">Farming</option>
      <option value="Health Science">Health Science</option>
      <option value="Information Technology">Information Technology</option>
    </select>
    
  </div>
  <br/>

    <div class="form-group">
    <label for="exampleConsultant">Date</label>
     <input type="date" class="form-control" class="date" name="date" required>
    </div>
    <br/>
   <div class="form-group">
    <label for="exampleConsultant">Date</label>
     <input type="time" class="form-control" class="time" name="time" required>
    </div>
   
    
  <br/>

                              
							<button type="submit"  name="actionType" value="addConsultant" class="btn btn-success">Submit</button>
						</form>
					</div>
				</div>
			</div>


			
		</div>
	</div>
</body>
</html>