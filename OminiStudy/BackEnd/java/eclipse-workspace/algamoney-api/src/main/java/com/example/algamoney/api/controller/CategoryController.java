package com.example.algamoney.api.controller;

import com.example.algamoney.api.model.Category;
import com.example.algamoney.api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

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
	public ResponseEntity<Category> create(@RequestBody Category category, HttpServletResponse response) {
		// função para recuperar o novo recurso e criar uma URL onde o consumidor pode encontrar esse novo recurso.
		Category saveCategory = categoryRepository.save(category);

		URI uri = ServletUriComponentsBuilder //helper spring
					.fromCurrentRequestUri() //A partir da requisição atual (pegar a url do servidor em questão)
					.path("/{id}")	// usar o id
					.buildAndExpand(saveCategory.getId()) // pegar o ID na base
					.toUri(); // usar o ID na area informada

		response.setHeader("Location", uri.toASCIIString()); // setar o localtion com a URI buscada e montada.

		return ResponseEntity.created(uri).body(saveCategory);
	}

	@GetMapping("/{id}")
	public Object getById(@PathVariable Long id) {
		if (id == null) {
			return ResponseEntity.notFound().build();
		} else {
			return categoryRepository.findById(id);
		}
	}
}



