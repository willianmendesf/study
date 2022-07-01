package com.willianmendesf.bookstoremanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willianmendesf.bookstoremanager.dto.BookDTO;
import com.willianmendesf.bookstoremanager.dto.MessageResponseDTO;
import com.willianmendesf.bookstoremanager.entity.Book;
import com.willianmendesf.bookstoremanager.mapper.BookMapper;
import com.willianmendesf.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	private final BookMapper bookMapper = BookMapper.INSTANCE;
	
	public List<Book> list() {
		return bookRepository.findAll();
	}
	
	public MessageResponseDTO create(BookDTO bookDTO) {
		
		Book bookToSave = bookMapper.toModel(bookDTO);
		Book savedBook  = bookRepository.save(bookToSave);
		
		return MessageResponseDTO
				.builder()
				 .message("book created with ID " + savedBook.getId())
				  .build();
	}
}
