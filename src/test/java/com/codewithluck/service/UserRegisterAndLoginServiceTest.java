package com.codewithluck.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.codewithluck.model.BookAppoinment;
import com.codewithluck.model.User;

class UserRegisterAndLoginServiceTest {
	static UserRegisterAndLoginService UserRegisterAndLoginServiceObj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		 UserRegisterAndLoginServiceObj=UserRegisterAndLoginService.getUserRegisterAndLoginServiceObj();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


	@Test
	void testAddUser() throws ClassNotFoundException,SQLException {
		
		User user=new User();
		user.setId(0);
		user.setFirstName("Vinod");
		user.setLastName("Heetiarachchi");
		user.setEmail("vinod@gmail.com");
		user.setPassword("vinod900");
		user.setConfirmPassword("vinod900");
		boolean result=UserRegisterAndLoginServiceObj.addUser(user);
		
		assertEquals(result,"register Job Seeker should return true");
		
		
		 
	}
		
	


	@Test
	@Disabled
	void testFetchSingleUser() throws ClassNotFoundException,SQLException{
	}

	@Test
	@Disabled
	void testFetchallUser() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testDeleteUser() {
		fail("Not yet implemented");
	}

}
