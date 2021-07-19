package com.example.algamoney.api.controller;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.algamoney.api.model.Category;
import com.example.algamoney.api.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public List<Category> listAll() {
		return categoryRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Category category, HttpServletResponse response) {
		// função para recuperar o novo recurso e criar uma URL onde o consumidor pode encontrar esse novo recurso.
		Category saveCategory = categoryRepository.save(category);
		URI uri = ServletUriComponentsBuilder //helper spring
					.fromCurrentRequestUri() //A partir da requisição atual (pegar a url do servidor em questão)
					.path("/{id}")	// usar o id
					.buildAndExpand(saveCategory.getId()) // pegar o ID na base
					.toUri(); // usar o ID na area informada
		
		response.setHeader("Location", uri.toASCIIString()); // setar o localtion com a URI buscada e montada.
	}
}



