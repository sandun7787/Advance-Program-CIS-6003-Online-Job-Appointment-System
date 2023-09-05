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

import com.codewithluck.model.BookAppoinment;

public class BookAppoinmentManagerImp implements BookAppoinmentManager {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		dbDriverManagerFactory driverFactory=new dbDriverManagerFactory();
		dbDriverManager driverManager=driverFactory.getDbDriver("MYSQL");
		return driverManager.getConnection();
		
	}

	public BookAppoinmentManagerImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addBookAppoinment(BookAppoinment bookAppoinment) throws SQLException, ClassNotFoundException {
		Connection connection=getConnection();
		String query="INSERT INTO jobappointment (jobSeekerFirstName,jobSeekerLastName, country,jobSeekerEmail,consultantFirstName, consultantLastName,consultantEmail,jobField,appointmentDate,appointmentTime,state) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
	
	    ps.setString(1,bookAppoinment.getJobSeekerFirstName());
	    ps.setString(2,bookAppoinment.getJobSeekerLastName());
	    ps.setString(3,bookAppoinment.getCountry());
	    ps.setString(4,bookAppoinment.getJobSeekerEmail());
	    ps.setString(5,bookAppoinment.getConsultantFirstName());
	    ps.setString(6,bookAppoinment.getConsultantLastName());
	    ps.setString(7,bookAppoinment.getConsultantEmail());
	    ps.setString(8,bookAppoinment.getJobField());
	    ps.setString(9,bookAppoinment.getAppointmentDate());
	    ps.setString(10,bookAppoinment.getAppointmentTime());
	    ps.setString(11,bookAppoinment.getState());
		
	    boolean result=false;
	    if(ps.executeUpdate()>0) {
	    	
	    	result=true;
	    }
	    ps.close();
	    connection.close();
		
		return result;
	}
	
	@Override
	public boolean deleteBookAppoinment(int id) throws SQLException, ClassNotFoundException {
		Connection connection=getConnection();
		String query="DELETE  FROM jobappointment WHERE id=? ";
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
	public BookAppoinment fetchSingleBookAppoinment(int id) throws SQLException, ClassNotFoundException {
Connection connection=getConnection();
		
		String query = "SELECT * FROM jobappointment WHERE id=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		
		BookAppoinment bookAppoinment = new BookAppoinment();
		ResultSet rs = ps.executeQuery();
		
		
		
		while(rs.next()) {
			bookAppoinment.setId(rs.getInt("id"));
			bookAppoinment.setJobSeekerFirstName(rs.getString("jobSeekerFirstName"));
			bookAppoinment.setJobSeekerLastName(rs.getString("jobSeekerLastName"));
			bookAppoinment.setCountry(rs.getString("country"));
			bookAppoinment.setJobSeekerEmail(rs.getString("jobSeekerEmail"));
			bookAppoinment.setConsultantFirstName(rs.getString("consultantFirstName"));
			bookAppoinment.setConsultantLastName(rs.getString("consultantLastName"));
			bookAppoinment.setConsultantEmail(rs.getString("consultantEmail"));
			bookAppoinment.setJobField(rs.getString("jobField"));
			bookAppoinment.setAppointmentDate(rs.getString("appointmentDate"));
			bookAppoinment.setAppointmentTime(rs.getString("appointmentTime"));
			bookAppoinment.setState(rs.getString("state"));
			System.out.println(bookAppoinment);
			
				
			
			
		}
		
		ps.close();
		connection.close();		
		return bookAppoinment;
	
	}

	@Override
	public List<BookAppoinment> fetchAllBookAppoinment() throws SQLException, ClassNotFoundException {
Connection connection=getConnection();
		
		String query = "SELECT * FROM jobappointment";
		Statement st = connection.createStatement();
		
         List<BookAppoinment> bookAppoinmentList = new ArrayList<BookAppoinment>();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			BookAppoinment bookAppoinment = new BookAppoinment();
			bookAppoinment.setId(rs.getInt("id"));
			
			bookAppoinment.setJobSeekerFirstName(rs.getString("jobSeekerFirstName"));
			bookAppoinment.setJobSeekerLastName(rs.getString("jobSeekerLastName"));
			bookAppoinment.setCountry(rs.getString("country"));
			bookAppoinment.setJobSeekerEmail(rs.getString("jobSeekerEmail"));
			bookAppoinment.setConsultantFirstName(rs.getString("consultantFirstName"));
			bookAppoinment.setConsultantLastName(rs.getString("consultantLastName"));
			bookAppoinment.setConsultantEmail(rs.getString("consultantEmail"));
			bookAppoinment.setJobField(rs.getString("jobField"));
			bookAppoinment.setAppointmentDate(rs.getString("appointmentDate"));
			bookAppoinment.setAppointmentTime(rs.getString("appointmentTime"));
			bookAppoinment.setState(rs.getString("state"));
			
			bookAppoinmentList.add(bookAppoinment);
		}
		
		st.close();
		connection.close();
		
		return bookAppoinmentList;
		
	}

	@Override
	public boolean acceptBookAppoinment(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookAppoinment> fetchAllBookAppoinment1() throws SQLException, ClassNotFoundException {
Connection connection=getConnection();
		
		String query = "SELECT * FROM jobappointment";
		Statement st = connection.createStatement();
		
         List<BookAppoinment> bookAppoinmentList = new ArrayList<BookAppoinment>();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			BookAppoinment bookAppoinment = new BookAppoinment();
			bookAppoinment.setId(rs.getInt("id"));
			
			bookAppoinment.setJobSeekerFirstName(rs.getString("jobSeekerFirstName"));
			bookAppoinment.setJobSeekerLastName(rs.getString("jobSeekerLastName"));
			bookAppoinment.setCountry(rs.getString("country"));
			bookAppoinment.setJobSeekerEmail(rs.getString("jobSeekerEmail"));
			bookAppoinment.setConsultantFirstName(rs.getString("consultantFirstName"));
			bookAppoinment.setConsultantLastName(rs.getString("consultantLastName"));
			bookAppoinment.setConsultantEmail(rs.getString("consultantEmail"));
			bookAppoinment.setJobField(rs.getString("jobField"));
			bookAppoinment.setAppointmentDate(rs.getString("appointmentDate"));
			bookAppoinment.setAppointmentTime(rs.getString("appointmentTime"));
			bookAppoinment.setState(rs.getString("state"));
			
			bookAppoinmentList.add(bookAppoinment);
		}
		
		st.close();
		connection.close();
		
		return bookAppoinmentList;
		
	
	}

	@Override
	public boolean editBookAppoinment(BookAppoinment bookAppoinment) throws SQLException, ClassNotFoundException {
	
		Connection connection = getConnection();
		String query = "UPDATE  jobappointment SET  jobSeekerFirstName=?,jobSeekerLastName=?, country=?,jobSeekerEmail=?,consultantFirstName=?, consultantLastName=?,consultantEmail=?,jobField=?,appointmentDate=?,appointmentTime=?,state=? WHERE id=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, bookAppoinment.getJobSeekerFirstName());
		ps.setString(2, bookAppoinment.getJobSeekerLastName());
		ps.setString(3, bookAppoinment.getCountry());
		ps.setString(4, bookAppoinment.getJobSeekerEmail());
		ps.setString(5, bookAppoinment.getConsultantFirstName());
		ps.setString(6, bookAppoinment.getConsultantLastName());
		ps.setString(7, bookAppoinment.getConsultantEmail());
		ps.setString(8, bookAppoinment.getJobField());
		ps.setString(9, bookAppoinment.getAppointmentDate());
		ps.setString(10, bookAppoinment.getAppointmentTime());
		ps.setString(11, bookAppoinment.getState());
		ps.setInt(12, bookAppoinment.getId());
		
		
		
		boolean result = false;		
		if(ps.executeUpdate() > 0)
			result = true;
		
		ps.close();
		connection.close();
		
		return result;
	}
	}

	
	

