package com.Library.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.DTO.UserRequestDTO;
import com.Library.Dao.Dao;
import com.Library.Entity.Book;

@Service
public class ServiceImpl implements Lib_Service{
	@Autowired
	private Dao dao;
	
	@Override
	public List<Book> getbook() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	@Override
	public Book singleBooks(String Bname) {
		// TODO Auto-generated method stub

		return dao.getOne(Bname);
	}
	
	@Override
	public Book addBook(UserRequestDTO obj) {
		// TODO Auto-generated method stub
		Book book=Book.builder().Author(obj.getAuthor()).Book_id(obj.getBook_id()).
				Book_Name(obj.getBook_Name()).Book_Type(obj.getBook_Type()).build();
		return dao.save(book);
	}

	@Override
	public Book updateBook(Book obj) {
		// TODO Auto-generated method stub
		dao.save(obj);
		return obj;
		}
	
	@Override
	public Book deleteBook(Long Bid) {
		// TODO Auto-generated method stub
		Book del = dao.getOne(Bid);
		dao.delete(del);
		return null;
	}
	
	
}
