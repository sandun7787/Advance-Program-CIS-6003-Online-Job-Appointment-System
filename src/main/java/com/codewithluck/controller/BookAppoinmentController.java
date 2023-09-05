package com.codewithluck.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.codewithluck.model.BookAppoinment;
import com.codewithluck.service.BookAppoinmentService;

/**
 * Servlet implementation class BookAppoinmentController
 */
public class BookAppoinmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message="";
	
     private BookAppoinmentService getBookAppoinmentService() {
		
		return BookAppoinmentService.getBookAppoinmentService();
	}
       
  
    public BookAppoinmentController() {
 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String actionType5= request.getParameter("actionType5");
			
			if(actionType5.equals("single1")) {
				fetchSingleBookAppoinment(request, response);
				
				}
			else if(actionType5.equals("single2")) {
				fetchAllBookAppoinment1(request, response);
			}
			
		
		
			else  {
				fetchAllBookAppoinment(request,response);
			}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String actionType5=request.getParameter("actionType5");
          
          if(actionType5.equals("BookAppointment")) {
        	  addBookAppoinment(request,response);
          }
          
          else if(actionType5.equals("delete1")){
  			deleteBookAppoinment(request, response);
  		}
          
          else if(actionType5.equals("accept")){
    			updateBookAppoinment(request, response);
          }
          
	

	}
	private void addBookAppoinment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookAppoinment bookAppoinment=new BookAppoinment ();
		
		String consultantFirstName=request.getParameter("consultantfirstname");
		System.out.println(consultantFirstName);
		String consultantLastName=request.getParameter("consultantlastname");
		System.out.println(consultantLastName);
		String consultantEmail=request.getParameter("consultantemail");
		System.out.println(consultantEmail);
		String Country=request.getParameter("country");
		System.out.println(Country);
		String jobSeekerEmail=request.getParameter("jobseekeremail");
		System.out.println(jobSeekerEmail);
		String jobSeekerFirstName=request.getParameter("jobseekerfirstname");
		System.out.println(jobSeekerFirstName);
		String jobSeekerLastName=request.getParameter("jobseekerlastname");
		System.out.println(jobSeekerLastName);
		String jobField=request.getParameter("jobfield");
		System.out.println(jobField);
		String appointmentDate=request.getParameter("date");
		System.out.println(appointmentDate);
		String appointmentTime=request.getParameter("time");
		System.out.println(appointmentTime);
		String state=request.getParameter("state");
	
	
		bookAppoinment.setJobSeekerFirstName(jobSeekerFirstName);
		bookAppoinment.setJobSeekerLastName(jobSeekerLastName);
		bookAppoinment.setJobSeekerEmail(jobSeekerEmail);
		bookAppoinment.setJobField(jobField);
		bookAppoinment.setCountry(Country);
		bookAppoinment.setConsultantFirstName(consultantFirstName);
		bookAppoinment.setConsultantLastName(consultantLastName);
		bookAppoinment.setConsultantEmail(consultantEmail);
		bookAppoinment.setAppointmentDate(appointmentDate);
		bookAppoinment.setAppointmentTime(appointmentTime);
		bookAppoinment.setState(state);
	
		System.out.println(bookAppoinment);
		
		try {
			if(getBookAppoinmentService().addBookAppoinment(bookAppoinment)) {
				message="Appointment Booking  is  successfully confirmed";
				request.setAttribute("feedbackmessage",message);
				RequestDispatcher rd=request.getRequestDispatcher("BookAppointment.jsp");
				
				rd.forward(request, response);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			 message=e.getMessage();
		}
		
		
		
		
		
	}
	private void deleteBookAppoinment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 clearMessage();
	 		int id = Integer.parseInt(request.getParameter("id"));
	 		
	 		try {
	 			if(getBookAppoinmentService().deleteBookAppoinment(id)) {
	 				message = "The Consulter has been successfully deleted: " + id;
	 			
	 			}
	 			else {
	 				message = "Failed to delet the Consulter !: " + id;
	 				
	 	
	 			}
	 		} 
	 		catch (ClassNotFoundException | SQLException e) {
	 			message =e.getMessage();
	 		}
	 		
	 	
	 		
	 		HttpSession session = request.getSession();
	 		session.setAttribute("message", message);
	 		
	 		response.sendRedirect("getBookAppoinment?actionType5=ConsultUserNavjsp");

		}
		
	

	private void fetchSingleBookAppoinment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		clearMessage();
		
		
	    int id = Integer.parseInt(request.getParameter("id"));
	    
	    
			
			try {
				BookAppoinment bookAppoinment  = getBookAppoinmentService().fetchSingleBookAppoinment(id);
				if( bookAppoinment.getId() > 0){
					request.setAttribute("bookAppoinment",bookAppoinment);
					message = "The  id has been searched !" + id; 
				}
				else {
					message = "No record found!";
					
				
				}
			} 
			catch (ClassNotFoundException | SQLException e) {
				message = e.getMessage();
			}
			request.setAttribute("feebackMessage", message);
			RequestDispatcher rd = request.getRequestDispatcher("BookAppoinment.jsp");
		
			rd.forward(request, response);
		}
		
		
	
    
	
		
	
	
	private void fetchAllBookAppoinment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		List<BookAppoinment > bookAppoinmentList=new ArrayList<BookAppoinment>();
		try {
			bookAppoinmentList=getBookAppoinmentService().fetchAllBookAppoinment();
		
			
			if(bookAppoinmentList.size()>0) {
			
			}else {
				message="No Records Found";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			   message=e.getMessage();
		}
		request.setAttribute("BookAppoinmentList", bookAppoinmentList);
		request.setAttribute("feedbackmessage", message);
		RequestDispatcher rd=request.getRequestDispatcher("ViewUser.jsp");
		rd.forward(request, response);
	
		
		
	}
	
	private void fetchAllBookAppoinment1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		clearMessage();
		List<BookAppoinment > bookAppoinmentList=new ArrayList<BookAppoinment>();
		try {
			bookAppoinmentList=getBookAppoinmentService().fetchAllBookAppoinment1();
		
			
			if(bookAppoinmentList.size()>0) {
			
			}else {
				message="No Records Found";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			   message=e.getMessage();
		}
		request.setAttribute("BookAppoinmentList1", bookAppoinmentList);
		request.setAttribute("feedbackmessage", message);
		RequestDispatcher rd=request.getRequestDispatcher("getBookAppoinment?actionType5=AdminViewUser.jsp");
		rd.forward(request, response);
	
		
		
	}
	
	
    	

	private void clearMessage() {
		// TODO Auto-generated method stub
		
	}
	
	private void updateBookAppoinment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookAppoinment bookAppoinment = new BookAppoinment();
		
		int ID=Integer.valueOf(request.getParameter("id"));
		String consultantFirstName=request.getParameter("consultantfirstname");
		System.out.println(consultantFirstName);
		String consultantLastName=request.getParameter("consultantlastname");
		System.out.println(consultantLastName);
		String consultantEmail=request.getParameter("consultantemail");
		System.out.println(consultantEmail);
		String Country=request.getParameter("country");
		System.out.println(Country);
		String jobSeekerEmail=request.getParameter("jobseekeremail");
		System.out.println(jobSeekerEmail);
		String jobSeekerFirstName=request.getParameter("jobseekerfirstname");
		System.out.println(jobSeekerFirstName);
		String jobSeekerLastName=request.getParameter("jobseekerlastname");
		System.out.println(jobSeekerLastName);
		String jobField=request.getParameter("jobfield");
		System.out.println(jobField);
		String appointmentDate=request.getParameter("date");
		System.out.println(appointmentDate);
		String appointmentTime=request.getParameter("time");
		System.out.println(appointmentTime);
		String state=request.getParameter("state");
		String state1="";
		state="accepted";
		state1=state;
	
		bookAppoinment.setId(ID);
		bookAppoinment.setJobSeekerFirstName(jobSeekerFirstName);
		bookAppoinment.setJobSeekerLastName(jobSeekerLastName);
		bookAppoinment.setJobSeekerEmail(jobSeekerEmail);
		bookAppoinment.setJobField(jobField);
		bookAppoinment.setCountry(Country);
		bookAppoinment.setConsultantFirstName(consultantFirstName);
		bookAppoinment.setConsultantLastName(consultantLastName);
		bookAppoinment.setConsultantEmail(consultantEmail);
		bookAppoinment.setAppointmentDate(appointmentDate);
		bookAppoinment.setAppointmentTime(appointmentTime);
		bookAppoinment.setState(state);
		

	try {
		if(getBookAppoinmentService().editBookAppoinment(bookAppoinment)) {
			message="Appointment Booking  is  successfully confirmed";
			request.setAttribute("feedbackmessage",message);
			RequestDispatcher rd=request.getRequestDispatcher("ViewUser.jsp");
			
			rd.forward(request, response);
			
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		 message=e.getMessage();
	}
	
	}
	
}
	
	

		
		
	

