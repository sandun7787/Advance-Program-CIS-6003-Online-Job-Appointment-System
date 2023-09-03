<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>

<%@include file ="component/allcss.jsp" %>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>


</head>
<body>

   <%@include file="component/navbar.jsp" %>
   
   <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/1.png" class="d-block w-100" alt="..."height="800px">
      <div class="carousel-caption d-none d-md-block">
        <h5> Container Driver</h5>
        <p>In the role of a container driver, my primary responsibility is to transport shipping containers to their designated locations, ensuring cargo is secure and following transportation regulations and safety protocols.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="img/2.jpg" class="d-block w-100" alt="..."height="800px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Air Hostess</h5>
        <p>role of an air hostess, I am dedicated to ensuring passenger safety and providing exceptional service throughout their journey, contributing to a pleasant and secure flying experience..</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="img/3.jpg" class="d-block w-100" alt="..."height="800px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Constructor</h5>
        <p>primary responsibility is to oversee and manage the construction process, ensuring that projects are completed efficiently, on time, and within budget while maintaining high-quality standards and safety protocols.</p>
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
</div>
<div class="container p-3">
		<p class="text-center fs-2 ">Key Features of our Ozone Consultant</p>

		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">100% Safety</p>
								<p>All jobs come with inherent risks, making 100% safety unattainable in any occupation. Mitigating these risks through proper training and safety measures is essential.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Clean Environment</p>
								<p>Job appointment consultants play a vital role in connecting individuals with employment opportunities while contributing to a clean environment by advocating eco-friendly </p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Friendly </p>
								<p>specialize in connecting talented candidates with their dream jobs and guiding companies to find the perfect fit for their teams. Let's work together to make your career aspirations a reality.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5"> Research</p>
								<p>job appointment consultant, my expertise lies in identifying top talent and matching them with research-focused positions that align with their skills and career goals.  dedicated to helping individuals .</p>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<img alt="" src="img/8.jpg">
			</div>

		</div>
	</div>

	<hr>

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