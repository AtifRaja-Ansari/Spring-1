package com.Library.Services;

import java.util.List;

import javax.validation.Valid;

import com.Library.DTO.UserRequestDTO;
import com.Library.Entity.Book;

public interface Lib_Service {
	List<Book> getbook();
	
	//To check onto a Single Class detials
	public Book singleBooks(String Bname);
	
	//To add a new book
	public Book addBook(UserRequestDTO obj);
	
	//To update the record of a class
	public Book updateBook(Book obj);
			
	//To Delete a class
	public Book deleteBook(Long Bid);

}