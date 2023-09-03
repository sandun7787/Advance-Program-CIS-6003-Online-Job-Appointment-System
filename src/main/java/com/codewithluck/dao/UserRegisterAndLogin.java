package com.codewithluck.dao;

import java.sql.SQLException;
import java.util.List;

import com.codewithluck.model.User;

public interface UserRegisterAndLogin {
	public boolean registerUser(User user) throws SQLException, ClassNotFoundException;
	public User fetchSingleUser(String email) throws ClassNotFoundException, SQLException;
	public List<User> fetchallUser()throws ClassNotFoundException, SQLException;
	public boolean deleteUser(int id) throws SQLException, ClassNotFoundException;

}
