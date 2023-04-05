package br.com.willianmendesf.controle.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.willianmendesf.controle.model.ClientModel;
import br.com.willianmendesf.controle.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public ClientModel create(ClientModel client) {
		return repository.newClient(client);
	}
	
	public ArrayList<ClientModel> list() {
		return repository.listClients();
	}
	
	public Optional<ClientModel> getById(Integer id) {
		return repository.getById(id);
	}
	
	public ClientModel update(Integer id, ClientModel client) {
		return repository.updateClient(id, client);
	}
	
	public String delete(Integer id) {
		return repository.deleteClient(id);
	}
	
}
