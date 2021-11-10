package br.com.willianmendesf.administrativoapi.service;

import br.com.willianmendesf.administrativoapi.model.User;
import br.com.willianmendesf.administrativoapi.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;


@Service
public class AdminService {

	@Autowired
	private ServiceRepository repository;

	public List<User> getUsers(String cpf) {
		List<User> listOfUser = null;

		try {
			listOfUser = repository.returnUserList(cpf);
		} catch (Exception e) {
			String body = "Houve um erro ao retornar a lista";
			System.out.println(body);
		}

		return listOfUser;
	}
}
