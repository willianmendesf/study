package com.willianmendesf.bookstoremanager.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
	
	private Long id;
	
	@NotBlank
	@Size(max = 200)
	private String name;
	
	@NotNull
	private Integer pages;
	
	@NotNull
	private Integer chapters;
	
	@NotBlank
	@Size(max = 200)
	//@Pattern(regexp="(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[-])))"
	private String isbn;
	
	@NotBlank
	@Size(max = 200)
	private String publisherName;
	
	@Valid
	@NotNull
	private AuthorDTO author;
	
}
