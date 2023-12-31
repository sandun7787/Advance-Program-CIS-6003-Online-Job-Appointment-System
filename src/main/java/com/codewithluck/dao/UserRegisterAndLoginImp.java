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
import com.codewithluck.model.User;

public class UserRegisterAndLoginImp implements UserRegisterAndLogin {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		dbDriverManagerFactory driverFactory=new dbDriverManagerFactory();
		dbDriverManager driverManager=driverFactory.getDbDriver("MYSQL");
		return driverManager.getConnection();
		
	}

	public UserRegisterAndLoginImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean registerUser(User user) throws SQLException, ClassNotFoundException {
	
		Connection connection=getConnection();
		String query="INSERT INTO user (firstname,lastname,email,password,confirmpassword) VALUES(?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,user.getFirstName());
		ps.setString(2, user.getLastName());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getPassword());
		ps.setString(5, user.getConfirmPassword());
		
		boolean result=false;
		
		if(ps.executeUpdate()>0) {
			 result=true;
		}
		ps.close();
		connection.close();
		
		return result;
		
	}

	@Override
	public User fetchSingleUser(String email) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		String query="SELECT * FROM user WHERE email=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1, email);
		
		ResultSet rs=ps.executeQuery();
		User user=new User();
		while(rs.next()) {
			user.setFirstName(rs.getString("firstname"));
			user.setLastName(rs.getString("lastname"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setConfirmPassword(rs.getString("confirmpassword"));
			
		}
		rs.close();
		connection.close();
		return user;
		
	}
	
	

	@Override
	public List<User> fetchallUser() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
		String query = "SELECT * FROM user";
		Statement st = connection.createStatement();
		
		List<User> userList = new ArrayList<User>();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			
			User user = new User();
		    user.setId(rs.getInt("id"));
			user.setFirstName(rs.getString("firstname"));
			user.setLastName(rs.getString("lastname"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setConfirmPassword(rs.getString("confirmpassword"));
		
			userList.add(user);
		}
		
		st.close();
		connection.close();
		
		return userList;
	}

	@Override
	public boolean deleteUser(int id) throws SQLException, ClassNotFoundException {
		Connection connection = getConnection();
		String query = "DELETE FROM user WHERE id=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1,id);
		
		boolean result = false;
		if(ps.executeUpdate() > 0) {
			result = true;
		}
		
		ps.close();
		connection.close();
		
		return result;
	
	}
			
		
	}
	



