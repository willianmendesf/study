package com.willianmendesf.bookstoremanager.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willianmendesf.bookstoremanager.dto.BookDTO;
import com.willianmendesf.bookstoremanager.dto.MessageResponseDTO;
import com.willianmendesf.bookstoremanager.entity.Book;
import com.willianmendesf.bookstoremanager.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/list")
	public List<Book> listAll() {
		return bookService.list();
	}
	
	@PostMapping("/create")
	public MessageResponseDTO create(@RequestBody @Valid BookDTO book) {
		return bookService.create(book);
	}
}