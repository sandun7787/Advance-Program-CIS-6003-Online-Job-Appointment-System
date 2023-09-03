<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Dash Board</title>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
<%@include file ="component/allcss.jsp" %>

</head>
<body>

<%@include file ="component/UserNav.jsp" %>


<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
  
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/home 12.jpg" class="d-block w-100" height="800px">
      <div class="carousel-caption d-none d-md-block">
        <h5>House Keeping</h5>
        <p>A housekeeping job appointment consultation is a meeting or discussion between a homeowner or employer and a potential housekeeper or cleaning service provider.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="img/job4.jpg" class="d-block w-100"  height="800px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Farmer</h5>
        <p>A farming job appointment consultation is a meeting or discussion between a farmer or agricultural employer and a job applicant or potential employee.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="img/job5.jpg" class="d-block w-100"  height="800px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Engineering</h5>
        <p>An engineering job appointment consultation is a meeting or discussion between an engineering employer or project manager and a potential engineering candidate or consultant. During this consultation, both parties typically discuss the specific engineering job position, project requirements, technical skills needed, qualifications, work expectations, timelines, and any other relevant details</p>
      </div>
 
  
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>


		
<div class="container p-2">
		<p class="text-center fs-2 ">Our Team</p>
		
		<div class="row">
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="img/ceo.jpeg" width="250px" height="300px">
						<p class="fw-bold fs-5">shanilka perara</p>
						<p class="fs-7">(CEO & Chairman)</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="img/con1.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Hanshika Perera</p>
						<p class="fs-7">(Manager)</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="img/con2.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Nilukshi Anandan</p>
						<p class="fs-7">(Consulter)</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="img/man.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Sehan vijesinha</p>
						<p class="fs-7">(Consulter)</p>
					</div>
				</div>
			</div>

		</div>

	</div>



<%@include file="component/footer.jsp"%>

</body>

</html>
</body>
</html>