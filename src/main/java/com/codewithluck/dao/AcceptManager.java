package com.codewithluck.dao;

import java.sql.SQLException;
import java.util.List;

import com.codewithluck.model.Accept;



public interface AcceptManager {
	
public boolean addAccept(Accept accept) throws SQLException, ClassNotFoundException;

	
	
	public List<Accept> fetchAllAccept() throws SQLException, ClassNotFoundException;

}
