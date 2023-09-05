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

import com.codewithluck.model.Consulter;



class ConsulterLoginServiceTest {
	static  ConsulterLoginService ConsulterLoginServiceObj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ConsulterLoginServiceObj= ConsulterLoginService.getConsulterLoginService();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}



	@Test
	@Disabled
	
	void testConsulterLoginService() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	@DisplayName("consulter login")
	void testFetchConsulterLogin() throws ClassNotFoundException, SQLException {
		Consulter  result=ConsulterLoginServiceObj.fetchConsulterLogin("consulter@gmail.com");

	        if((result.getEmail()!=null)&&(result.getPassword()!=null)) {

	            assertEquals(result,"login  is successfully confirmed");
	}

	}
	@Test
	@DisplayName("consulter login negative")
	void testFetchConsulterLoginnegative() throws ClassNotFoundException, SQLException {
		Consulter  result=ConsulterLoginServiceObj.fetchConsulterLogin("savidy@gmail.com");

	        if((result.getEmail()!=null)&&(result.getPassword()!=null)) {

	            assertEquals(result,"login  is not successfully confirmed");
	}
	        
	}
	

}
