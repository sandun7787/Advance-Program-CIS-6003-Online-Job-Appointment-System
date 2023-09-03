<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@include file ="component/allcss.jsp" %>
<meta charset="ISO-8859-1">
<title>Book Appoinment</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="//g.tutorialjinni.com/mojoaxel/bootstrap-select-country/dist/css/bootstrap-select-country.min.css" />

<style type="text/css">
h1{
   text-align:center;
   margin-top:20px;
 }
.bookappointment{
    max-width:400px;
    margin-left:400px;
    margin-top:80px;
    }
    

   
 </style>
</head>
<body>
<%@include file ="component/UserNav.jsp" %>


   <h1 style="margin-right:100px">Appointment Booking</h1>

</body>
 <p style="color:green;margin-left:750px;">${feedbackmessage}</p>

 <div class="container">
  <form action="BookAppoinment"  class="bookappointment" method="POST">

   <div class="form-group">
    <label for="id">CONSULTER ID</label>
    <input type="text" class="form-control" class="id" name="id" readonly="readonly" value="${Message1}" required>
    </div>
    <br/>
  <div class="form-group">
    <label for="consultantfirstname">CONSULTER FIRST NAME</label>
    <input type="text" class="form-control" id="consultantfirstname" class="consultantfirstname" name="consultantfirstname" readonly="readonly" value="${Message3}" required>
    </div>
  <br/>
    <div class="form-group">
    <label for="consultantlastname">CONSULTER LASTNAME</label>
    <input type="text" class="form-control" class="consultantlastname"  id="consultantlastname" name="consultantlastname"readonly="readonly" value="${Message4}" required>
     </div>
  <br/>
    <div class="form-group">
    <label for="consultantemail">CONSULTER EMAIL</label>
    <input type="email" class="form-control" class="consultantemail" id="consultantemail" name="consultantemail"readonly="readonly" value="${Message2}" required>
    </div>
 <br/>
<div class="form-group">
    <label for="country">CONSULTER COUNTRY</label>
    <input type="text" class=" form-control" id="country" name="country" readonly="readonly"value="${Message5}" ></input>
     </div>
  <br/>
   <div class="form-group">
    <label for="jobseekeremail">USER EMAIL</label>
    <input type="email" class="form-control" id="jobseekeremail" class="jobseekeremail" name="jobseekeremail" required>
     </div>
  <br/>
      <div class="form-group">
    <label for="jobseekerfirstname">USER FIRST NAME</label>
    <input type="text" class="form-control"  id="jobseekerfirstname" class="jobseekerfirstname" name="jobseekerfirstname" required>
    </div>
  <br/>
    <div class="form-group">
    <label for="jobseekerlastname">USER LAST NAME</label>
    <input type="text" class="form-control" class="jobseekerlastname" id="jobseekerlastname" name="jobseekerlastname" required>
     </div>
  <br/>
   <div class="form-group">
    <label for="jobfield"> CONSULTER JOBFIELD</label>
    <input type="text" class="form-control" class="jobfield" id="jobfield" name="jobfield" readonly="readonly" value="${Message8}" required>
     </div>
   <br/>
   <div class="form-group">
    <label for="jobfield">USER JOBFIELD</label>
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
    <label for="date"> CONSULTER DATE</label>
    <input type="text" class="form-control" class="date" id="date" name="date" readonly="readonly" value="${Message6}" required>
     </div>
   <br/>
   <div class="form-group">
    <label for="time"> CONSULTER TIME</label>
    <input type="text" class="form-control" class="time"  id="time" name="time" readonly="readonly" value="${Message7}" required>
     </div>
     <br>
      <div class="form-group">
    <label for="state"></label>
    <input type="hidden" class="form-control" class="state" id="state" name="state" readonly="readonly" value="false" required>
     </div>
     
   <br/>
  <button type="submit" onClick="submit()" style="width:380px; margin-bottom:100px;" border-radius:10px" name="actionType5" value="BookAppointment" class="btn btn-success">Add</button>
 </div>
   </form>
   
   
   
   <script src="https://smtpjs.com/v3/smtp.js"></script>
   
   <script>
   

   let consultantfirstname =document.getElementById("consultantlastname").value;
   console.log(consultantfirstname);
   let consultantlastname=document.getElementById("consultantlastname").value;
   console.log(consultantlastname);
   let consultantemail=document.getElementById("consultantemail").value;
   console.log(consultantemail);
   let country=document.getElementById("country").value;
   console.log(country);
   let jobseekeremail=document.getElementById("jobseekeremail").value;
   console.log(jobseekeremail);
   let jobseekerfirstname=document.getElementById("jobseekerfirstname").value;
   console.log(jobseekerfirstname);
   let jobseekerlastname=document.getElementById("jobseekerlastname").value;
   console.log(jobseekerlastname);
   let jobfield=document.getElementById("jobfield").value;
   console.log(jobfield);
   

   let body="Your Job Appointment is successfully Booked "+"<br/>consultantfirstname :"+consultantfirstname;

   let body1="consultantlastname :"+consultantlastname+"<br/>consultantemail :"+consultantemail+"<br/>country:"+country+"<br/>jobseekeremail:"+jobseekeremail+"<br/>jobfield:"+jobfield;

   let fullBody=body+body1;

   function submit(){

	   Email.send({

		   SecureToken  : "e1f48050-ef56-436e-90b0-cb3d445b8ae3",
		    To : 'prageethkasun637@gmail.com',
		    From : "prageethkasun637@gmail.com",
		    Subject : "This is the subject",
		    Body : fullBody
		}).then(
		  message => alert(message)
		);
	   
   }
   
   
 </script>
   
   
   
   
</body>
</html>