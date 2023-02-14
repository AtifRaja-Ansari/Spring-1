package com.Library.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="Book_List")
@Builder
public class Book {
	@Id
	@Column(name="Book_id",length=50)
	private Long Book_id;
	@Column(name="Book_Name",length=50)
	private String Book_Name;
	@Column(name="Book_type",length=30)
	private String Book_Type;
	@Column(name="Author_Name",length=50)
	private String Author;
	@Column(name="Publish_date",length=20)
	private String Publish_date;
	

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getBook_Type() {
		return Book_Type;
	}

	public void setBook_Type(String book_Type) {
		Book_Type = book_Type;
	}

	public Long getBook_id() {
		return Book_id;
	}

	public void setBook_id(Long book_id) {
		Book_id = book_id;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublish_date() {
		return Publish_date;
	}

	public void setPublish_date(String publish_date) {
		Publish_date = publish_date;
	}

	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Long book_id,String book_Name, String book_Type, String author, String publish_date) {
		super();
		Book_Name = book_Name;
		Book_Type = book_Type;
		Book_id = book_id;
		Author = author;
		Publish_date = publish_date;
	
	}

	@Override
	public String toString() {
		return "Book [Book_Name=" + Book_Name + ", Book_Type=" + Book_Type + ", Book_id=" + Book_id + ", Author="
				+ Author + ", Publish_date=" + Publish_date +"]";
	}
	
	

}
