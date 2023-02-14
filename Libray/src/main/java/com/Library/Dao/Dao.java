package com.Library.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Library.Entity.Book;

public interface Dao extends JpaRepository<Book, Long> {

	@Query("from Book where  Book_Name like :s%")
	Book  getOne(@Param("s") String Bname);


}
