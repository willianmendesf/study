package br.com.willianmendesf.controle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.willianmendesf.controle.model.ProductModel;
import br.com.willianmendesf.controle.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<ProductModel> list() {
		return repository.list();
	} 
	
	public Optional<ProductModel> getById(Integer id) {
		return repository.getById(id);
	}
	
	public ProductModel create(ProductModel product) {
		return repository.create(product);
	}
	
	public ProductModel update(Integer id, ProductModel product) {
		product.setId(id);
		return repository.update(product);
	}
	
	public String delete(Integer id) {
		return repository.delete(id);
	}
}
