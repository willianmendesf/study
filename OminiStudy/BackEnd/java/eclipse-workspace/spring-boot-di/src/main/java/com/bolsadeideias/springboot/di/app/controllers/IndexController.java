package com.bolsadeideias.springboot.di.app.controllers;

import com.bolsadeideias.springboot.di.app.models.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	private ServiceInterface service;

	@Autowired
	public IndexController(ServiceInterface service) {
		this.service = service;
	}

	@GetMapping({"/", "index", "home", "app"})
	public String index(Model model) {
		model.addAttribute("title","Index Page");
		model.addAttribute("content", service.operation());

		return "index";
	}
}
