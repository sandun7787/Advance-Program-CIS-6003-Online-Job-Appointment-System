package com.codewithluck.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithluck.dao.AdminConsulterManager;
import com.codewithluck.dao.AdminConsulterManagerImp;
import com.codewithluck.model.AdminConsulter;

public class AdminConsulterService {
	
	private static AdminConsulterService AdminConsulterServiceObj;

	private AdminConsulterService() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized static AdminConsulterService getAdminConsulterService() {
		
		if(AdminConsulterServiceObj == null) {
			AdminConsulterServiceObj = new AdminConsulterService();
		}
		
		return AdminConsulterServiceObj;
		

}
	
	private AdminConsulterManager getAdminConsulterManager()  {
		return new AdminConsulterManagerImp();
		
	}
	
	public boolean addAdminConsulter(AdminConsulter AdminConsulter) throws ClassNotFoundException, SQLException {
		return getAdminConsulterManager().addAdminConsulter(AdminConsulter);
	}
	
	public boolean editAdminConsulter(AdminConsulter AdminConsulter) throws ClassNotFoundException, SQLException {
		return getAdminConsulterManager().editAdminConsulter(AdminConsulter);
	}
	
	public boolean deleteAdminConsulter(int id) throws ClassNotFoundException, SQLException {
		return getAdminConsulterManager().deleteAdminConsulter(id);
	}
	
	public AdminConsulter fetchSingleAdminConsulter(int id) throws ClassNotFoundException, SQLException {
		return getAdminConsulterManager().fetchSingleAdminConsulter(id);
	}
	
	public List<AdminConsulter> fetchAdminConsulter() throws ClassNotFoundException, SQLException {
		return getAdminConsulterManager().fetchAllAdminConsulter();
	}
	
	public AdminConsulter fetchSingleAdminConsulter1(int id) throws ClassNotFoundException, SQLException {
		return getAdminConsulterManager().fetchSingleAdminConsulter1(id);
		
	}
	
	
}
