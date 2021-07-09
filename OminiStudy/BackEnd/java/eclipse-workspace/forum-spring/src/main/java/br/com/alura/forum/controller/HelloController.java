package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/")
	public String Hello() {
		return "Hello World!";
	}

	@RequestMapping("/login")
	public String Login() {
		return "Hello Login";
	}

	@RequestMapping("/**")
	public String PageNotFound() {
		return "Sorry, page not found!";
	}
}
