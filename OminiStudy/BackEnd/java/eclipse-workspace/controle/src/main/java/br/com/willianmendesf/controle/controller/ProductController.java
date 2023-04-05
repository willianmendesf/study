package br.com.willianmendesf.controle.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.willianmendesf.controle.model.ProductModel;
import br.com.willianmendesf.controle.services.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	@Autowired
	private ProductService service;

	@GetMapping("/list")
	public List<ProductModel> get() {
		return service.list();
	}

	@GetMapping("/id/{id}")
	public Optional<ProductModel> getById(@PathVariable Integer id) {
		return service.getById(id);
	}

	@PostMapping("/create")
	public ProductModel add(@RequestBody ProductModel product) {
		return service.create(product);
	}

	@PostMapping("/update/{id}")
	public ProductModel update(@RequestBody ProductModel product, @PathVariable Integer id) {
		return service.update(id, product);
	}

	@PostMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return service.delete(id);
	}
}
