package br.com.willianmendesf.administrativoapi.controller;

import br.com.willianmendesf.administrativoapi.model.User;
import br.com.willianmendesf.administrativoapi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController extends IOException {

	@Autowired
	private AdminService service;

	@GetMapping
	public List<User> returnUserList(@RequestParam String cpf) {
			return service.getUsers(cpf);
	}

}
