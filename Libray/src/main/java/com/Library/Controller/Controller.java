package com.Library.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Library.DTO.UserRequestDTO;
import com.Library.Entity.Book;
import com.Library.Services.Lib_Service;

@RestController
public class Controller {
	@Autowired
	private Lib_Service libservice;
	
	//To view the whole class
	@GetMapping("/Books")
	public List<com.Library.Entity.Book> getclasses(){
		return this.libservice.getbook();
	}
	//for viewing a single course
		@GetMapping("/Books/{Bname}")
		public Book singleBooks(@PathVariable String Bname){
			return this.libservice.singleBooks((Bname));
		}

	//for adding a new class
		@PostMapping("/Books")
		 public Book addBook(@RequestBody @Valid UserRequestDTO obj ){
		 return this.libservice.addBook(obj);
		 }
		
		//for Updating 
		@PutMapping("/Books")
		 public Book updateBook(@RequestBody Book obj){
			return this.libservice.updateBook(obj);
		}
		
		//for deleting a Class
		@DeleteMapping("/Books/{Bid}")
		 public ResponseEntity<HttpStatus> deleteBook(@PathVariable Long Bid){
			try{
				this.libservice.deleteBook(Bid);
				return new ResponseEntity<>(HttpStatus.OK);
				}
			 catch(Exception e) {
				 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				 }
			}
		
}
