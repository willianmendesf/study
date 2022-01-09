package com.carros.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping()
	public String get() {
		return "Get Spring Boot";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("login") String login, @RequestParam("senha") String senha){
		return "Seu login é: " + login + ", e sua senha é: " + senha;
	}
}
