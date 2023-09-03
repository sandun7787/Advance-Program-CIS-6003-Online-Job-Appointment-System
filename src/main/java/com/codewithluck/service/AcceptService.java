package com.codewithluck.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithluck.dao.AcceptManager;
import com.codewithluck.dao.AcceptManagerImp;
import com.codewithluck.model.Accept;



public class AcceptService {
	
	private static AcceptService acceptServiceObj;

	public AcceptService() {
		// TODO Auto-generated constructor stub
	}
	
public synchronized static AcceptService getAcceptService() {
		
		if(acceptServiceObj == null) {
			acceptServiceObj = new AcceptService();
		}
		
		return acceptServiceObj;
	}

private AcceptManager getAcceptManager() {
    return new AcceptManagerImp();
    
    }
    
    public boolean addAccept(Accept Accept) throws ClassNotFoundException, SQLException {
		return getAcceptManager().addAccept(Accept);
	}
    
    public List<Accept> fetchAllAccept() throws ClassNotFoundException, SQLException {
		return getAcceptManager().fetchAllAccept();
	}

}


