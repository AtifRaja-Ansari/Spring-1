package com.Library.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequestDTO {
	
	@NotNull(message ="Invalid Book_id/Book_id not Entered")
	private Long Book_id;
	
	@NotBlank(message = "Invalid Name/Empty name")
	@NotNull(message = "Invalid Name/Name not Entered")
	@Size(min = 10, max = 50,message = "Name should be 15-50 Charaacters")
	private String Book_Name;
	
	@NotBlank(message = "Invalid Book_Type/Empty Book_Type")
	@NotNull(message ="Invalid Book_Type/Book_Type not Entered")
	@Size(min = 10, max = 50,message = "Book_Type should be 15-50 Charaacters")
	private String Book_Type;
	
	@NotBlank(message = "Invalid Author_Name/Empty Author_Name")
	@NotNull(message ="Invalid Author_Name/Author_Name not Entered")
	@Size(min = 10, max = 50,message = "Author_Name should be 15-50 Charaacters")
	private String Author;
	
	@NotBlank(message = "Invalid Name/Empty name")
	@NotNull(message ="Invalid Name/Name not Entered")
	@Size(min = 10, max = 50,message = "Name should be 15-50 Charaacters")
	private String Publish_date;
}
