package br.com.willianmendesf.controle.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.willianmendesf.controle.model.ClientModel;
import br.com.willianmendesf.controle.model.Exception.ResourceNotFoundException;

@Repository
public class ClientRepository {
	
	private ArrayList<ClientModel> clients = new ArrayList<>();
	private Integer id = 0;
	
	public ArrayList<ClientModel> listClients() {
		return clients;
	}
	
	public ClientModel newClient(ClientModel client) {
		
		client.setId(id++);
		clients.add(client);
		
		return client;
	}
	
	public Optional<ClientModel> getById(Integer id) {
		return clients
				.stream()
					.filter(client -> client.getId() == id)
						.findFirst();
	}
	
	public ClientModel updateClient(Integer id, ClientModel client) {
		
		Optional<ClientModel> oldClient = getById(id);
		
		if(oldClient.isEmpty()) throw new ResourceNotFoundException("Cliente não encontrado.");		
		else {
			deleteClient(id);
			
			client.setId(id);
			clients.add(client);
			
			return client;
		}
		
	}
	
	public String deleteClient(Integer id) {
		Optional<ClientModel> getClient = getById(id);
		
		if(getClient.isEmpty()) return "O Cliente especificado não existe."; 
		else {
			clients.removeIf(client -> client.getId() == id);
			return "Cliente Removido com sucesso!";
		}		
	}
 
}
