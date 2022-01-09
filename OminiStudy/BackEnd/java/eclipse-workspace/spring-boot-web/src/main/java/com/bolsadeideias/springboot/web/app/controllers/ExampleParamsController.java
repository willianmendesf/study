package com.bolsadeideias.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class ExampleParamsController {

	@GetMapping("/")
	public String index() {
		return "params/index";
	}

	@GetMapping("/string")
	public String param(@RequestParam(name="text", required=false, defaultValue="value is undefined") String text, Model model) {

		model.addAttribute("result","The received text is: " + text);

		return "params/view";
	}

	@GetMapping("/mix-params")
	public String param(@RequestParam String salutation, @RequestParam Integer number, Model model) {

		model.addAttribute("result","'The salutation is: '" + salutation + "' and the number is: '" + number + "''");

		return "params/view";
	}

	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		String salutation = request.getParameter("salutation");
		Integer number = null;
		try {
			number = Integer.parseInt(request.getParameter("number"));
		} catch (NumberFormatException e) {
			number = 0;
		}

		model.addAttribute("result","'The salutation is: '" + salutation + "' and the number is: '" + number + "''");

		return "params/view";
	}

}
