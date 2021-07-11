package com.example.algamoney.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.api.model.Category;
import com.example.algamoney.api.repository.CategoryRepository;

@RestController
@RequestMapping("/categorys")
public class CategoryController {
	
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public List<Category> listAll() {
		return categoryRepository.findAll();
	}
}
