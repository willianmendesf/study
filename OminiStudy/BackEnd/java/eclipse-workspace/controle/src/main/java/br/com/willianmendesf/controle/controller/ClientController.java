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

import br.com.willianmendesf.controle.model.ClientModel;
import br.com.willianmendesf.controle.services.ClientService;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping("/list")
	public ArrayList<ClientModel> list() {
		return service.list();
	}
	
	@GetMapping("/client/{id}")
	public Optional<ClientModel> getById(@PathVariable Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/create")
	public ClientModel create(@RequestBody ClientModel client) {
		return service.create(client);
	}
	
	@PostMapping("/update/{id}")
	public ClientModel update(@PathVariable Integer id, @RequestBody  ClientModel client) {
		return service.update(id, client);
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return service.delete(id);
	}

}
