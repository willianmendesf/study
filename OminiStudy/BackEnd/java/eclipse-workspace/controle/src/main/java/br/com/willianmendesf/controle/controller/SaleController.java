package br.com.willianmendesf.controle.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.willianmendesf.controle.model.SalesModel;
import br.com.willianmendesf.controle.services.SalesService;

@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {
	
	@Autowired
	private SalesService service;
	
	@GetMapping("/")
	public ArrayList<SalesModel> list() {
		return service.list();
	}
	
	@GetMapping("/sale/id/{id}")
	public Optional<SalesModel> saleById(@PathVariable Integer id) {
		return service.saleById(id);
	}
	
	@GetMapping("/sale/sku/{sku}")
	public Optional<SalesModel> saleBySku(@PathVariable String sku) {
		return service.saleBySku(sku);
	}
	
	@PostMapping("/newSale")
	public String newSale(@RequestBody SalesModel newSale) {
		return service.newSale(newSale);
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return service.delete(id);
	}
}
