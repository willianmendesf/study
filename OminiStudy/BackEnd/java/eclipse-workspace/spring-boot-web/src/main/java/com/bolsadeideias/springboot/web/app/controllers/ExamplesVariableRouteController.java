package com.bolsadeideias.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class ExamplesVariableRouteController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Pass params in rout (@PathVariable) - HTTP - Method GET");
		return "variables/index";
	}

	@GetMapping("/string/{text}")
	public String variables(@PathVariable String text, Model model) {

		model.addAttribute("title", "Return request params of rout (@PathVariable) - HTTP - Method GET");
		model.addAttribute("result", "The received text is: " + text);

		return "variables/view";
	}

	@GetMapping("/string/{text}/{number}")
	public String variables(@PathVariable String text, @PathVariable Integer number, Model model) {

		model.addAttribute("title", "Return request params of rout (@PathVariable) - HTTP - Method GET");
		model.addAttribute("result", "The received text is: " + text + " and the number is " + number);

		return "variables/view";
	}

}
