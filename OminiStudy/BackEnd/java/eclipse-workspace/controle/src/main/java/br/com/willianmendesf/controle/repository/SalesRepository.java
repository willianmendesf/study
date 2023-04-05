package br.com.willianmendesf.controle.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.willianmendesf.controle.model.SalesModel;
import br.com.willianmendesf.controle.model.Exception.ResourceNotFoundException;

@Repository
public class SalesRepository {
	
	 private ArrayList<SalesModel> sales = new ArrayList<>();
	 private Integer id = 1;
	 private Integer skuNum = 2648960;
	 private String sku = "ABS";
	 
	 public ArrayList<SalesModel> list() {
		 return sales;
	 }
	 
	 public Optional<SalesModel> saleById(Integer id) {
		 Optional<SalesModel> getSaleId = sales.stream().filter(sale -> sale.getId() == id).findFirst();
		 
		 if(!!getSaleId.isEmpty()) throw new ResourceNotFoundException("A sale de id: " + id + ", não existe.");
		 
		 return getSaleId;
	 }
	 
	 public Optional<SalesModel> saleBySku(String sku) {
		 Optional<SalesModel> saleSku = sales.stream().filter(sale -> sale.getSku() == sku).findFirst();
		 
		 System.out.println(sku);
		 System.out.println(saleSku);
		 
		 if(saleSku.isEmpty()) throw new ResourceNotFoundException("A sale de sku: " + sku + ", não existe.");
		 
		 return saleSku;
	 }
	 
	 public String newSale(SalesModel newSale) {
		 Optional<SalesModel> validExistingSale = sales.stream().filter(sale -> sale.getSku() == newSale.getSku()).findFirst();
		 newSale.setId(id++);
		 Integer newSkuNum = skuNum++;
		 newSale.setSku(sku + newSkuNum.toString());
		 
		 if(!validExistingSale.isEmpty()) {
			throw new ResourceNotFoundException("Venda duplicada tente novamente.");
		 } else {
			 sales.add(newSale);
			 return "Obteve Sucesso!";
		 }
	 }
	 
	 public String delete(Integer id) {
		 Optional<SalesModel> oldSale = saleById(id);
		 
		 if (oldSale.isEmpty()) return "Sale de id: " + id + ", não existe !";
		 else {
			 sales.removeIf(sale -> sale.getId() == id);
			 return "Sale de id: " + id + " Deletada com sucesso.";
		 }
		 
	 }
}
