package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String Login() {
		return "Hello Login";
	}
	
	@RequestMapping("/**")
	@ResponseBody
	public String PageNotFound() {
		return "Sorry, page not found!";
	}
}
