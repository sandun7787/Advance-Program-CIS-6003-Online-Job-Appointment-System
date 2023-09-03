package com.codewithluck.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codewithluck.dao.utils.dbDriverManager;
import com.codewithluck.dao.utils.dbDriverManagerFactory;
import com.codewithluck.model.Accept;


public class AcceptManagerImp implements AcceptManager {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		dbDriverManagerFactory driverFactory=new dbDriverManagerFactory();
		dbDriverManager driverManager=driverFactory.getDbDriver("MYSQL");
		return driverManager.getConnection();
		
	}

	public AcceptManagerImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addAccept(Accept accept) throws SQLException, ClassNotFoundException {
Connection connection=getConnection();
		
		String query="INSERT INTO accept (fullName,consultername,appoinDate,email,phNo,location,session,address) VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		
		ps.setString(1, accept.getFullName());
		ps.setString(2, accept.getConsultername());
		ps.setString(3, accept.getAppoinDate());
		ps.setString(4, accept.getEmail());
		ps.setString(5, accept.getPhNo());
		ps.setString(6, accept.getLocation());
		ps.setString(7, accept.getSession());
		ps.setString(8, accept.getAddress());
		
		
	
		
		
		
	    boolean result=false;
	    if(ps.executeUpdate()>0) {
	    	
	    	result=true;
	    }
	    ps.close();
	    connection.close();
		return result;
	}
	
	
	@Override
	public List<Accept> fetchAllAccept() throws SQLException, ClassNotFoundException {
	
           Connection connection=getConnection();
		
		String query = "SELECT * FROM accept ";
		Statement st = connection.createStatement();
		
         List<Accept> acceptList = new ArrayList<Accept>();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			Accept accept = new Accept();
			accept.setId(rs.getInt("id"));
			
			accept.setFullName(rs.getString("fullName"));
			accept.setConsultername(rs.getString("consultername"));
			accept.setAppoinDate(rs.getString("appoinDate"));
			accept.setEmail(rs.getString("email"));
			accept.setPhNo(rs.getString("phNo"));
			accept.setLocation(rs.getString("location"));
			accept.setSession(rs.getString("session"));
			accept.setAddress(rs.getString("address"));
			
			
			
			acceptList.add(accept);
		}
		
		st.close();
		connection.close();
		
		return acceptList;
		
	
	}
	}


