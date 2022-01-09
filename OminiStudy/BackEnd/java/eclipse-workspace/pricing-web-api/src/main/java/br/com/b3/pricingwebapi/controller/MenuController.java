package br.com.b3.pricingwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.b3.pricingwebapi.model.Menu;
import br.com.b3.pricingwebapi.repository.MenuRepository;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuRepository menuRepository;

	@GetMapping("/")
	public List<Menu> listAll() {
		return menuRepository.findAll();
	}
}
