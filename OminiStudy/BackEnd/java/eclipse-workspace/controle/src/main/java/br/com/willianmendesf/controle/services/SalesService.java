package br.com.willianmendesf.controle.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.willianmendesf.controle.model.SalesModel;
import br.com.willianmendesf.controle.repository.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	private SalesRepository repository;
	
	public ArrayList<SalesModel> list() {
		return repository.list();
	}
	
	public Optional<SalesModel> saleById(Integer id) {
		return repository.saleById(id);
	}
	
	public Optional<SalesModel> saleBySku(String sku) {
		return repository.saleBySku(sku);
	}
	
	public String newSale (SalesModel newSale) {
		return repository.newSale(newSale);
	}
	
	public String delete(Integer id) {
		return repository.delete(id);
	}

}
