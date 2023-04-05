package br.com.willianmendesf.controle.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.willianmendesf.controle.model.ProductModel;
import br.com.willianmendesf.controle.model.Exception.ResourceNotFoundException;

@Repository
public class ProductRepository {
	
	private ArrayList<ProductModel> products = new ArrayList<ProductModel>();
	private Integer lastId = 0;
	
	/**
	 * Método para retornar uma lista de produtos.
	 * @Return lista de produtos.
	 */
	public List<ProductModel> list() {
		
		updateLastId();
		return products;
	}
	
	/**
	 * Método para retornar produto pelo id.
	 * @param id do produto que será localizado.
	 * @Return retorna produto caso seja encontrado.
	 */
	public Optional<ProductModel> getById(Integer id) {
		updateLastId();
		
		return products
				.stream()
					.filter(product -> product.getId() == id)
						.findFirst();
	}
	
	/**
	 * Método para adicionar produto na lista.
	 * @param produto a ser adicionado.
	 * @Return retorna o produto que foi adicionado na lista. 
	 */
	public ProductModel create(ProductModel product) {
		updateLastId();
		
		lastId++;
		product.setId(lastId);
		products.add(product);
		
		return product;
	}
	
	
	/**
	 *
	 * Parametro para atualizar o produto especificado.
	 * @param O produto que deve ser atualizado
	 * @Return Retorna produto atualizado.
	 *
	 */
	public ProductModel update(ProductModel product) {
		updateLastId();
	
		/** Encontrar produto na lista. */
		Optional<ProductModel> oldProduct = getById(product.getId());
		
		/** valida se o produto foi encontrado */
		if(oldProduct.isEmpty()) throw new ResourceNotFoundException("Produto não encontrado.");
		
		/** remove a versão antiga do produto; */
		delete(product.getId());	
		
		/** adicionar o produto; */
		products.add(product);
		
		/** returna o produto; */
		return product;
	}
	
	
	/**
	* Método para deletar produto, deleta a partir do id do produto.
	* @param delete o produto que o id foi informado 
	*/
	public String delete(Integer id) {
		updateLastId();
		
		Optional<ProductModel> searchProduct = getById(id);
		
		if(searchProduct.isEmpty()) return "O Produto não existe.";
		
		else {
			products.removeIf(product -> product.getId() == id);
			return "Produto Deletado com sucesso!";
		}
	}
	
	private void updateLastId() {
		if(products.isEmpty()) lastId = 0;
	}

}
