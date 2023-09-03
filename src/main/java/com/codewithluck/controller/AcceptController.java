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


import com.codewithluck.model.Accept;
import com.codewithluck.service.AcceptService;



/**
 * Servlet implementation class AcceptController
 */
public class AcceptController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
String message = "";
	
	private AcceptService getAcceptService() {
		return AcceptService.getAcceptService();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcceptController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String actionType= request.getParameter("actionType");
		
		if(actionType.equals("single")) {
			fetchAllAccept(request, response);
		}
		else {
			fetchAllAccept(request, response);
		}
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String actionType = request.getParameter("actionType");
		
		if(actionType.equals("add")) {
			addAccept(request, response);
		}
	}
	
private void addAccept(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Accept accept = new Accept();
		String fullName=request.getParameter("fullName");
		String consultername=request.getParameter("consultername");
		String appoinDate=request.getParameter("appoinDate");
		String email=request.getParameter("email");
		String phNo=request.getParameter("phNo");
		String location=request.getParameter("location");
		String session=request.getParameter("session");
		String address=request.getParameter("address");
		
		
		
	   
	    accept.setFullName(fullName);
	    accept.setConsultername(consultername);
	    accept.setAppoinDate(appoinDate);
	    accept.setEmail(email);
	    accept.setPhNo(phNo);
	    accept.setLocation(location);
	    accept.setSession(session);
	    accept.setAddress(address);
	
		
		try {
			if(getAcceptService().addAccept(accept)) {
				message="Report is select successfully confirmed";
				request.setAttribute("feedbackmessage",message);
				RequestDispatcher rd=request.getRequestDispatcher("SummeryReport.jsp");
				rd.forward(request, response);
			}else {
				message="Consultant is not added successfully confirmed ";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			  message=e.getMessage();
			  
		}
		
		
		
	}

   private void fetchAllAccept(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
	   clearMessage();
		
		List<Accept> acceptList = new ArrayList<Accept>();
		try {
			acceptList = getAcceptService().fetchAllAccept();
			
			if(!(acceptList.size() > 0)) {
				message = "No record found!";
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}
		
		request.setAttribute("AcceptList", acceptList);
		request.setAttribute("feebackMessage", message);
		
		RequestDispatcher rd = request.getRequestDispatcher("Summery.jsp");
		rd.forward(request, response);
		
	}
	
	private void clearMessage() {
		message = "";
	}
	
	
	}

   
		
	


