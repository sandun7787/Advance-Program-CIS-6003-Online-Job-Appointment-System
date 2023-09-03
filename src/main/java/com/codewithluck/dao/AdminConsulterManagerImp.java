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
import com.codewithluck.model.AdminConsulter;


public class AdminConsulterManagerImp implements AdminConsulterManager {

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		dbDriverManagerFactory driverFactory=new dbDriverManagerFactory();
		dbDriverManager driverManager=driverFactory.getDbDriver("MYSQL");
		return driverManager.getConnection();
	}
	
	public AdminConsulterManagerImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addAdminConsulter(AdminConsulter AdminConsulter) throws SQLException, ClassNotFoundException {
Connection connection=getConnection();
		
		String query="INSERT INTO adminconsulter (id,firstName,lastName,country,email,jobField,date,time) VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1,AdminConsulter .getId());
		ps.setString(2,AdminConsulter.getFirstName());
		ps.setString(3,AdminConsulter.getLastName());
		ps.setString(4,AdminConsulter.getCountry());
		ps.setString(5,AdminConsulter.getEmail());
		ps.setString(6,AdminConsulter.getJobField());
		ps.setString(7,AdminConsulter.getDate());
		ps.setString(8,AdminConsulter.getTime());
		
		
	    boolean result=false;
	    if(ps.executeUpdate()>0) {
	    	
	    	result=true;
	    }
	    ps.close();
	    connection.close();
		return result;
	}
	

	@Override
	public boolean editAdminConsulter(AdminConsulter AdminConsulter) throws SQLException, ClassNotFoundException {
              Connection connection=getConnection();
		
		String query="UPDATE adminconsulter SET firstName=?,lastName=?,country=?,email=?,jobField=? WHERE id=?";
		PreparedStatement ps=connection.prepareStatement(query);
		
		
		ps.setString(1,AdminConsulter.getFirstName());
		ps.setString(2,AdminConsulter.getLastName());
		ps.setString(3,AdminConsulter.getCountry());
		ps.setString(4,AdminConsulter.getEmail());
		ps.setString(5,AdminConsulter.getJobField());
		ps.setInt(6,AdminConsulter.getId());

		
	
	
		
	    boolean result=false;
	    if(ps.executeUpdate()>0) {
	    	
	    	result=true;
	    }
	    ps.close();
	    connection.close();
		return result;
	}
	
		

	@Override
	public boolean deleteAdminConsulter(int id) throws SQLException, ClassNotFoundException {
		
		Connection connection=getConnection();
		String query="DELETE  FROM adminconsulter WHERE id=? ";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1,id);
		
		
	    boolean result=false;
	    if(ps.executeUpdate()>0) {
	    	
	    	result=true;
	    }
	    ps.close();
	    connection.close();
		return result;
	}
	
		


	@Override
	public AdminConsulter fetchSingleAdminConsulter(int id) throws SQLException, ClassNotFoundException {
		Connection connection=getConnection();
		
		String query = "SELECT * FROM adminconsulter WHERE id=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		
		
		ResultSet rs = ps.executeQuery();
		
		AdminConsulter adminConsulter = new AdminConsulter();
		
		while(rs.next()) {
			adminConsulter.setId(rs.getInt("id"));
			adminConsulter.setFirstName(rs.getString("firstName"));
			adminConsulter.setLastName(rs.getString("lastName"));
			adminConsulter.setCountry(rs.getString("country"));
			adminConsulter.setEmail(rs.getString("email"));
			adminConsulter.setJobField(rs.getString("jobfield"));
			adminConsulter.setDate(rs.getString("date"));
			adminConsulter.setTime(rs.getString("time"));
			
		}
		
		ps.close();
		connection.close();		
		return adminConsulter;
	}

		


	@Override
	public List<AdminConsulter> fetchAllAdminConsulter() throws SQLException, ClassNotFoundException {
		
		Connection connection=getConnection();
		
		String query = "SELECT * FROM adminconsulter";
		Statement st = connection.createStatement();
		
         List<AdminConsulter> adminConsulterList = new ArrayList<AdminConsulter>();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			AdminConsulter adminConsulter = new AdminConsulter();
			adminConsulter.setId(rs.getInt("id"));
			adminConsulter.setFirstName(rs.getString("firstName"));
			adminConsulter.setLastName(rs.getString("lastName"));
			adminConsulter.setCountry(rs.getString("country"));
			adminConsulter.setEmail(rs.getString("email"));
			adminConsulter.setJobField(rs.getString("jobField"));
			adminConsulter.setDate(rs.getString("date"));
			adminConsulter.setTime(rs.getString("time"));
			
			adminConsulterList.add(adminConsulter);
		}
		
		st.close();
		connection.close();
		
		return adminConsulterList;
	

	}

	@Override
	public AdminConsulter fetchSingleAdminConsulter1(int id) throws SQLException, ClassNotFoundException {
		
         Connection connection=getConnection();
		
		String query = "SELECT * FROM adminconsulter WHERE id=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		
		
		ResultSet rs = ps.executeQuery();
		
		AdminConsulter adminConsulter = new AdminConsulter();
		
		while(rs.next()) {
			adminConsulter.setId(rs.getInt("id"));
			adminConsulter.setFirstName(rs.getString("firstName"));
			adminConsulter.setLastName(rs.getString("lastName"));
			adminConsulter.setCountry(rs.getString("country"));
			adminConsulter.setEmail(rs.getString("email"));
			adminConsulter.setJobField(rs.getString("jobfield"));
			adminConsulter.setDate(rs.getString("date"));
			adminConsulter.setTime(rs.getString("time"));
			
		}
		
		ps.close();
		connection.close();		
		return adminConsulter;
		
		
	}
}
