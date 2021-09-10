package com.bolsadeideias.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"", "/", "/index", "/home", "/inicio"})
	public String index(Model model) {
		model.addAttribute("titulo", "Olá. Spring Framework com MDOEL!");
		return "index";
	}

	setInterval(()=>{
		if(document.querySelector('.sweet-alert')) document.querySelector('.sweet-alert').querySelector('.confirm').click()
		if(document.querySelector('#L_ContDown_1_50741').textContent == 0 && document.querySelector('#L_ContDown_2_50741').textContent == 1) {
			console.log(`Cronômetro: Faltando ${document.querySelector('#L_ContDown_1_50741').textContent}${document.querySelector('#L_ContDown_2_50741').textContent} segundos para finalizar, Agora o Lance foi Feito. ;)`)
			ExecutarLance('50741');
		} else {
			console.log(`Cronômetro: ${document.querySelector('#L_ContDown_1_50741').textContent}${document.querySelector('#L_ContDown_2_50741').textContent} segundos para finalizar, não lançarei. :D`)
		}
	},900)

}
