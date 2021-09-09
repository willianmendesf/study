package com.example.algamoney.api.controller;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.algamoney.api.model.Category;
import com.example.algamoney.api.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryRepository repository;

	@GetMapping
	public List<Category> listAll() {
		return repository.findAll();
	}

	@PostMapping
	public ResponseEntity<Category> create(@RequestBody Category category, HttpServletResponse response) {
		Category saveCategory = repository.save(category);

		URI uri = ServletUriComponentsBuilder
			.fromCurrentRequestUri()
				.path("/{id}")
					.buildAndExpand(saveCategory.getId())
						.toUri();

		response.setHeader("Location", uri.toASCIIString());

		return ResponseEntity.created(uri).body(saveCategory);
	}
	
	
}



