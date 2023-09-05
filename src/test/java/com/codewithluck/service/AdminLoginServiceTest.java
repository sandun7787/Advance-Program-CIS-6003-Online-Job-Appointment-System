package com.codewithluck.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.codewithluck.model.Admin;

class AdminLoginServiceTest {
	static AdminLoginService adminLoginServiceObj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		adminLoginServiceObj = AdminLoginService.getAdminLoginService();
		 
	}



	@Test
	@Disabled
	void testAdminLoginService() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetAdminLoginService() throws ClassNotFoundException, SQLException  {
	
	
	}

	@Test
	@Disabled
	@DisplayName("Admin Login")
	void testFetchAdminLogin() throws ClassNotFoundException, SQLException {
		
	
		   Admin result=adminLoginServiceObj.fetchAdminLogin("admin@gmail.com");

	        if((result.getEmail()!=null)&&(result.getPassword()!=null)) {

	            assertEquals(result,"login  is successfully confirmed");
	}


}
	
	@Test
	@DisplayName("Admin Login negative")
	void testFetchAdminLoginnegtive() throws ClassNotFoundException, SQLException {
		
	
		   Admin result=adminLoginServiceObj.fetchAdminLogin("gajidu@gmail.com");

	        if((result.getEmail()==null)&&(result.getPassword()==null)) {

	            assertEquals(result,"login  is not successfully confirmed");
	}


}
}
