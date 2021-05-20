package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.modelo.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {
	
	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista() {
		Topico topico = new Topico("Duvida", "Conteudo", new Curso("SpringBoot", "Programação"));
		
		return Arrays.asList(topico, topico, topico);
	}

}
