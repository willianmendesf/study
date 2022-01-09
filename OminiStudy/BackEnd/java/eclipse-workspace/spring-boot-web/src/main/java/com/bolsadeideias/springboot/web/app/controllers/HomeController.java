package com.bolsadeideias.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Home(){
		return "forward:/app/index";
		//return "redirect:/app/index";
	}

	@GetMapping("/start")
	public String HomeTwo(){
		return "redirect:/app/index";
	}
}
