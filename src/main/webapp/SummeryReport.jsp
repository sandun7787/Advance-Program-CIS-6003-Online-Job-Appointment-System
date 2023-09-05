<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Accept Report</title>
<%@include file="component/allcss.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 8px 0 rgba(0, 0, 0, 0.3);
}

.backImg {
	background: linear-gradient(rgba(0, 0, 0, .4), rgba(0, 0, 0, .4)),
		url("img/job5.jpg");
	height: 20vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body>
<%@include file="component/ConsultUserNavjsp.jsp"%>

<div class="container-fulid backImg p-5">
		<p class="text-center fs-2 text-white"></p>
	</div>
	<div class="container p-3">
		<div class="row">
			<div class="col-md-6 p-5">
				<img alt="" src="img/23.png">
			</div>

			<div class="col-md-6">
				<div class="card paint-card">
					<div class="card-body">
						<p class="text-center fs-3">User Accept Report</p>
					
						<form class="row g-3" action="acceptcontroller" method="post">
						  
						  <p  style="color:Green;margin-left:150px;" >${feedbackmessage}</p>


							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">Job Seeker Full Name</label> <input
									required type="text" class="form-control" name="fullName">
							</div>
							
							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">Consultant Full  Name</label> <input
									required type="text" class="form-control" name="consultername">
							</div>
							

							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">
									Date</label>
									 <input type="date" class="form-control" required
									name="appoinDate">
							</div>

							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">Email</label> <input
									required type="email" class="form-control" name="email">
							</div>

							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">Phone No</label> <input
									maxlength="10" required type="number" class="form-control"
									name="phNo">
							</div>
							
							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">Location</label> <input
									maxlength="10" required type="text" class="form-control"
									name="location">
							</div>
							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">Session</label> <input
									maxlength="10" required type="text" class="form-control"
									name="session">
							</div>
						
							<div class="col-md-12">
								<label>Full Address</label>
								<textarea required name="address" class="form-control" rows="3"
									cols=""></textarea>
				                  
				                  <br>
				                  <hr>

								<button  type="submit"   name="actionType" value="add" class="btn btn-success">Submit</button>
						
						</form>
					</div>
				</div>
			</div>
		</div>
</div>



	
	<%@include file="component/footer.jsp"%>


</body>
</html>