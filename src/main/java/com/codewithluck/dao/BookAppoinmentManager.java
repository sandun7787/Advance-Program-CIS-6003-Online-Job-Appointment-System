package com.codewithluck.dao;

import java.sql.SQLException;
import java.util.List;

import com.codewithluck.model.BookAppoinment;

public interface BookAppoinmentManager {
	
public boolean addBookAppoinment(BookAppoinment bookAppoinment) throws SQLException, ClassNotFoundException;

public boolean editBookAppoinment(BookAppoinment bookAppoinment) throws SQLException, ClassNotFoundException;

public boolean deleteBookAppoinment(int id) throws SQLException, ClassNotFoundException;
	
public BookAppoinment fetchSingleBookAppoinment(int id) throws SQLException, ClassNotFoundException;
	
public List<BookAppoinment> fetchAllBookAppoinment() throws SQLException, ClassNotFoundException;

public boolean acceptBookAppoinment(int id)throws SQLException, ClassNotFoundException;

public List<BookAppoinment> fetchAllBookAppoinment1()throws SQLException, ClassNotFoundException;


}
