package com.bolsadeideias.springboot.di.app.controllers;

import com.bolsadeideias.springboot.di.app.service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private Service service = new Service();

	@GetMapping({"/"})
	public String index(Model model) {
		model.addAttribute("title","Index Page");
		model.addAttribute("content", service.operation("my info"));

		return "index";
	}
}
