<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file ="component/allcss.jsp" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file ="component/ConsultUserNavjsp.jsp" %>


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
 
</body>
</html>