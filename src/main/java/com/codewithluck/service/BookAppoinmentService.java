package com.codewithluck.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithluck.dao.BookAppoinmentManager;
import com.codewithluck.dao.BookAppoinmentManagerImp;
import com.codewithluck.model.BookAppoinment;

public class BookAppoinmentService {
	
	private static BookAppoinmentService BookAppoinmentServiceObj;

    private BookAppoinmentService() {
		
	}
	
public synchronized static BookAppoinmentService getBookAppoinmentService() {
		
		if(BookAppoinmentServiceObj == null) {
			BookAppoinmentServiceObj = new BookAppoinmentService();
		}
		
		return BookAppoinmentServiceObj;
	}
    
    
	private BookAppoinmentManager getBookAppoinmentManager() {
		return new BookAppoinmentManagerImp();

	}
	
	public boolean addBookAppoinment( BookAppoinment  bookAppoinment) throws ClassNotFoundException, SQLException {
		return getBookAppoinmentManager().addBookAppoinment( bookAppoinment);
	}
	
	public boolean editBookAppoinment(BookAppoinment bookAppoinment) throws ClassNotFoundException, SQLException {
		return getBookAppoinmentManager().editBookAppoinment(bookAppoinment);
		
	}
	
	public boolean deleteBookAppoinment(int id) throws ClassNotFoundException, SQLException {
		return getBookAppoinmentManager().deleteBookAppoinment(id);
	}
	
	public BookAppoinment fetchSingleBookAppoinment(int id) throws ClassNotFoundException, SQLException {
		return getBookAppoinmentManager().fetchSingleBookAppoinment(id);
	}
	
	public List<BookAppoinment> fetchAllBookAppoinment() throws ClassNotFoundException, SQLException {
		return getBookAppoinmentManager().fetchAllBookAppoinment();
	}

	public List<BookAppoinment> fetchAllBookAppoinment1()throws ClassNotFoundException, SQLException { 
		return getBookAppoinmentManager().fetchAllBookAppoinment1();
		
	}
	
}

