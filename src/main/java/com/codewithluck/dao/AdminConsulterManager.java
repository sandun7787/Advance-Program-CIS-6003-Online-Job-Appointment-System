package com.codewithluck.dao;

import java.sql.SQLException;
import java.util.List;

import com.codewithluck.model.AdminConsulter;

public interface AdminConsulterManager {
	
public boolean addAdminConsulter(AdminConsulter AdminConsulter) throws SQLException, ClassNotFoundException;
	
	public boolean editAdminConsulter(AdminConsulter AdminConsulter) throws SQLException, ClassNotFoundException;
	
	public boolean deleteAdminConsulter(int id) throws SQLException, ClassNotFoundException;
	
	public AdminConsulter fetchSingleAdminConsulter(int id) throws SQLException, ClassNotFoundException;
	
	public List<AdminConsulter> fetchAllAdminConsulter() throws SQLException, ClassNotFoundException;
	
	public AdminConsulter fetchSingleAdminConsulter1(int id) throws SQLException, ClassNotFoundException;


}
