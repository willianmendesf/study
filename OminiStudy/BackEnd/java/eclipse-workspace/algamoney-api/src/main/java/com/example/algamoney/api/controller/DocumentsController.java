package com.example.algamoney.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
public class DocumentsController {
	@GetMapping
	public String list() {
		return "return List";
	}

	@PostMapping("/docx/{id}")
	public String listDocx(@PathVariable Number id){
		return "all docx" + id;
	}
}
