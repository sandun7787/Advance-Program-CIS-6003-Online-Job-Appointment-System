package com.codewithluck.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogout {
	@WebServlet("/userLogout")
	public class userLogout extends HttpServlet {
		
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			HttpSession session = req.getSession();
			session.removeAttribute("userObj");
			session.setAttribute("succMsg", "User Logout Sucessfully");
			resp.sendRedirect("UserLogin.jsp");

		}

		
	}

}
