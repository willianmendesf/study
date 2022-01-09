package br.com.willianmendesf.administrativoapi.repository;

import br.com.willianmendesf.administrativoapi.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Repository
public class ServiceRepository {

	public List<User> returnUserList(String cpf) {
		User firsUser = new User("William", "Mendes", "28/12/1992", 28, "151.620.437-96");

		List<User> listUsers = new ArrayList<>();
		listUsers.add(firsUser);

		return listUsers;
	}
}
