package com.codewithluck.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.codewithluck.model.BookAppoinment;


class BookAppoinmentServiceTest {
	static BookAppoinmentService BookAppoinmentServiceObj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		BookAppoinmentServiceObj =  BookAppoinmentService.getBookAppoinmentService();
	}



	@Test
	@Disabled
	@DisplayName("Book Appoinment")
	void testAddBookAppoinmentPsoitive () throws ClassNotFoundException,SQLException {
	      
		BookAppoinment appoinment = new BookAppoinment();
	    appoinment.setId(0);
	    appoinment.setJobSeekerFirstName("sadun");
	    appoinment.setConsultantLastName("warnasooreya");
	    appoinment.setCountry("japan");
	    appoinment.setJobSeekerEmail("warnasooreya@gmail.com");
	    appoinment.setConsultantFirstName("nadika");
	    appoinment.setConsultantLastName("karunarthna");
	    appoinment.setConsultantEmail("nadika@gmail.com");
	    appoinment.setJobField("nursing");
	    appoinment.setAppointmentDate("2023-05-12");
	    appoinment.setAppointmentTime("20.34");
	    appoinment.setState("false");	
	      boolean result=BookAppoinmentServiceObj.addBookAppoinment(appoinment);
	      boolean expected=true;
	      
	      assertEquals(expected,result,"Book appoinment is adding successfully");
	}

	@Test
	@Disabled
	@DisplayName("Book Appoinment negative")
	void testAddBookAppoinmentNegative () throws ClassNotFoundException,SQLException {
	      
		
	    
	      boolean result=BookAppoinmentServiceObj.addBookAppoinment(null);
	      boolean expected=true;
	      
	      assertEquals(expected,result,"Book appoinment is not adding successfully");
	}
	
	
	@Test
	@DisplayName("Edite Book Appoinment ")
	@Disabled
	void testEditBookAppoinment()  throws ClassNotFoundException,SQLException {
	 
		      
			BookAppoinment appoinment = new BookAppoinment();
		    appoinment.setId(19);
		    appoinment.setJobSeekerFirstName("kasuni");
		    appoinment.setConsultantLastName("erandika");
		    appoinment.setCountry("America");
		    appoinment.setJobSeekerEmail("Kasuni@gmail.com");
		    appoinment.setConsultantFirstName("saduni");
		    appoinment.setConsultantLastName("warnasooreya");
		    appoinment.setConsultantEmail("saduni@gmail.com");
		    appoinment.setJobField("farming");
		    appoinment.setAppointmentDate("2023-08-22");
		    appoinment.setAppointmentTime("009.34");
		    appoinment.setState("Accepetd");	
		      boolean result=BookAppoinmentServiceObj.editBookAppoinment(appoinment);
		      boolean expected=true;
		      
		      assertEquals(expected,result,"Book appoinment is edite successfully");
		}
	
	@Test
	@Disabled
	@DisplayName(" Edite Book Appoinment negative")
	void testEditBookAppoinmentNegative () throws ClassNotFoundException,SQLException {
		
		 boolean result=BookAppoinmentServiceObj.editBookAppoinment(null);
	      boolean expected=true;
	      
	      assertEquals(expected,result,"Book appoinment is not edite successfully");
	}
	
	
	

	@Test
	@Disabled
	@DisplayName(" Delete Book Appoinment ")
	void testDeleteBookAppoinment()throws ClassNotFoundException,SQLException {
		 boolean result=BookAppoinmentServiceObj.deleteBookAppoinment(35);
	      boolean expected=true;
	      
	      assertEquals(expected,result,"Book appoinment is  delete successfully");
	}
		
	@Test
	@Disabled
	@DisplayName(" Delete Book Appoinment negative ")
	void testDeleteBookAppoinmentnegative()throws ClassNotFoundException,SQLException {
		 boolean result=BookAppoinmentServiceObj.deleteBookAppoinment(3);
	      boolean expected=true;
	      
	      assertEquals(expected,result,"Book appoinment is not delete successfully");
	}
		
	

	@Test
	@Disabled
    @DisplayName("Fetch A Signle Job Appointment ")


 void testFetchSingleBookAppoinment() throws ClassNotFoundException, SQLException {

     BookAppoinment result=BookAppoinmentServiceObj.fetchSingleBookAppoinment(45);

           if(result.getId()>0) {

                assertEquals(result,"fetch a single appointment");

           }
  }
	
	
	@Test
	 @DisplayName("Fetch A Signle Job Appointment negative")

	 void testFetchSingleBookAppoinmentnegtive() throws ClassNotFoundException, SQLException {

	     BookAppoinment result=BookAppoinmentServiceObj.fetchSingleBookAppoinment(1);

	           if(result.getId()>0) {

	                assertEquals(result,"not found the report");

	           }
	  }
		
	

	@Test
	@Disabled
	@DisplayName(" fetch all negative ")
	void testFetchAllBookAppoinmentnegative() throws ClassNotFoundException, SQLException { 
		   List<BookAppoinment> result=BookAppoinmentServiceObj.fetchAllBookAppoinment();

		   if(result!=null) {

               

               assertEquals(result,"All the record are available");

           }

    }
		
	}



