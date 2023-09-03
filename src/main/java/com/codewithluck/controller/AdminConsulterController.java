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


import com.codewithluck.model.AdminConsulter;
import com.codewithluck.service.AdminConsulterService;

/**
 * Servlet implementation class AdminConsulterController
 */
public class AdminConsulterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String message="";
	
	private AdminConsulterService getAdminConsulterService() {
		return AdminConsulterService.getAdminConsulterService();
	}

       
   
    public AdminConsulterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionType= request.getParameter("actionType");
		
		if(actionType.equals("single")) {
			
			fetchSingleAdminConsulter(request, response);
			
			
			
			}
		else if 
			(actionType.equals("viewConsultant")) {
				viewAdminConsulter(request,response);
				
				
			
	}
//	else if(actionType.equals("selectConsultant")) {
//	selectAdminConsulter(request,response);
//	}
		
		else if(actionType.equals("selectConsultant1")) {
			fetchSingleAdminConsulter1(request,response);
		}
		
		else  {
			fetchAllAdminConsulter(request,response);
		}
	}


	
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String actionType = request.getParameter("actionType");
		
		if(actionType.equals("addConsultant")) {
			addAdminConsulter(request, response);
		}
		else if(actionType.equals("edit")){
			editAdminConsulter(request, response);
		}
		else if(actionType.equals("delete")) {
			deleteAdminConsulter(request, response);
		
		
		
	 
		
			
		}

	
	
		}
	
	    
	    

		

	
private void addAdminConsulter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminConsulter AdminConsulter = new AdminConsulter();
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String country=request.getParameter("country");
		String email=request.getParameter("email");
		String jobField=request.getParameter("jobfield");
	    String date=request.getParameter("date");
		String time=request.getParameter("time");
		AdminConsulter.setFirstName(firstName);
		AdminConsulter.setLastName(lastName);
		AdminConsulter.setCountry(country);
		AdminConsulter.setEmail(email);
		AdminConsulter.setJobField(jobField);
		AdminConsulter.setDate(date);
		AdminConsulter.setTime(time);
		System.out.println(AdminConsulter);
		
		try {
			if(getAdminConsulterService().addAdminConsulter(AdminConsulter)) {
				message="Consultant is add successfully confirmed";
				request.setAttribute("feedbackmessage",message);
				RequestDispatcher rd=request.getRequestDispatcher("AdminConsulterManager.jsp");
				rd.forward(request, response);
			}else {
				message="Consultant is not added successfully confirmed ";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			  message=e.getMessage();
			  System.out.println(message);
		}
		
		
	
		
	}

    private void editAdminConsulter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
clearMessage();
		
        AdminConsulter adminConsulter = new AdminConsulter();
        adminConsulter.setId(Integer.parseInt(request.getParameter("id")));
     
        adminConsulter.setFirstName(request.getParameter("firstName"));
       
        adminConsulter.setLastName(request.getParameter("lastName"));
        adminConsulter.setCountry(request.getParameter("country"));
        adminConsulter.setEmail(request.getParameter("email"));
        adminConsulter.setJobField(request.getParameter("jobField"));
        adminConsulter.setDate(request.getParameter("date"));
        adminConsulter.setTime(request.getParameter("time"));
        
       
		try {
			if(getAdminConsulterService().editAdminConsulter(adminConsulter)) {
				message = "The Consulter has been successfully updated!  Consulter  Code: " +  adminConsulter.getId();
			}
			else {
				message = "Failed to update the  Consulter !  Consulter  Code: " + adminConsulter.getId();
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}
		
		request.setAttribute("feebackMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("SearchAndUpdate.jsp");
		rd.forward(request, response);
		
	}
    	
    	
    


     private void deleteAdminConsulter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 clearMessage();
 		int id = Integer.parseInt(request.getParameter("id"));
 		
 		try {
 			if(getAdminConsulterService().deleteAdminConsulter(id)) {
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
 		
 		response.sendRedirect("getadminconsulter?actionType=all");

	}
	
	private void fetchSingleAdminConsulter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		clearMessage();
	
		
    int id = Integer.parseInt(request.getParameter("id"));
    
    
		
		try {
			AdminConsulter adminConsulter = getAdminConsulterService().fetchSingleAdminConsulter(id);
			if(adminConsulter.getId() > 0){
				request.setAttribute("AdminConsulter", adminConsulter);
				message = "The Consulter id has been searched !" + id; 
			}
			else {
				message = "No record found!";
				
			
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}
		request.setAttribute("feebackMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("SearchAndUpdate.jsp");
	
		rd.forward(request, response);
	}
	
	
    private void fetchAllAdminConsulter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	clearMessage();
    	
    	List<AdminConsulter > AdminConsulterList=new ArrayList<AdminConsulter>();
		try {
			AdminConsulterList=getAdminConsulterService().fetchAdminConsulter();
			System.out.println(AdminConsulterList);
			if(AdminConsulterList.size()>0) {
			
			}else {
				message="No Records Found";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			   message=e.getMessage();
		}
		request.setAttribute("AdminConsulterList", AdminConsulterList);
		request.setAttribute("feedbackmessage", message);
		RequestDispatcher rd=request.getRequestDispatcher("ConsulterDelete.jsp");
		rd.forward(request, response);
		
		
		
	}
    
//    private void selectAdminConsulter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//   	 
//   	 
//   	clearMessage();
//	
//      	 
//   int id = Integer.parseInt(request.getParameter("id"));
//	System.out.println(id);	
//   	String firstName=request.getParameter("firstname");
//	String lastName=request.getParameter("lastname");
//	String country=request.getParameter("country");
//	
//	String email=request.getParameter("email");
//	String jobField=request.getParameter("jobfield");
//	String date=request.getParameter("date");
//	String time=request.getParameter("time");
//	
//	try {
//		AdminConsulter AdminConsulter=getAdminConsulterService().fetchSingleAdminConsulter1(id);
//		int AdminConsulter1=AdminConsulter.getId();
//	   
//	    if(id==(AdminConsulter1)) {
//	    	System.out.println("hellow world");	
//			message="Consultant Added successfully";
//			request.setAttribute("Message1",id);
//			request.setAttribute("Message2",email);
//  		    request.setAttribute("Message3",firstName);
//			request.setAttribute("Message4",lastName);
//			request.setAttribute("Message5",country);
//			request.setAttribute("Message6",date);
//			request.setAttribute("Message7",time);
//			request.setAttribute("Message8",jobField);
//			
//		RequestDispatcher rd=request.getRequestDispatcher("BookAppointment.jsp");
//	
//	  
//			rd.forward(request, response);
//			
//		}
//	} catch (ClassNotFoundException | SQLException e) {
//		// TODO Auto-generated catch block
//	      message=e.getMessage();
//	}
//   }
//	


    
  private void  viewAdminConsulter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<AdminConsulter > consultantList=new ArrayList<AdminConsulter>();
		try {
			consultantList=getAdminConsulterService().fetchAdminConsulter();
			System.out.println(consultantList);
			
			
			
			if(consultantList.size()>0) {
			
			}else {
				message="No Records Found";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			   message=e.getMessage();
		}
		request.setAttribute("ConsultantList", consultantList);
		request.setAttribute("feedbackmessage", message);
		RequestDispatcher rd=request.getRequestDispatcher("ViewConsultant.jsp");
		rd.forward(request, response);
	
		
		
	}
  
  private void fetchSingleAdminConsulter1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  clearMessage();

	    
	   	 
	   	int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);	
	   	String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String country=request.getParameter("country");
		
		String email=request.getParameter("email");
		String jobField=request.getParameter("jobfield");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		
		try {
			AdminConsulter AdminConsulter=getAdminConsulterService().fetchSingleAdminConsulter1(id);
			int  AdminConsulter1=AdminConsulter.getId();
		   
		    if(id==AdminConsulter1) {
		    	System.out.println("hellow world");	
				message="Consultant Added successfully";
				request.setAttribute("Message1",AdminConsulter1);
				request.setAttribute("Message2",email);
				request.setAttribute("Message3",firstName);
				request.setAttribute("Message4",lastName);
				request.setAttribute("Message5",country);
				request.setAttribute("Message6",date);
				request.setAttribute("Message7",time);
				request.setAttribute("Message8",jobField);
				
				RequestDispatcher rd=request.getRequestDispatcher("BookAppointment.jsp");
			
			  
				rd.forward(request, response);
		    }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		      message=e.getMessage();
		}
		
  }
		
	
	  
  

  



		
	
	
    
    
    
    
	
    	




	private void clearMessage() {
		// TODO Auto-generated method stub
		
	}
    
    

    }









