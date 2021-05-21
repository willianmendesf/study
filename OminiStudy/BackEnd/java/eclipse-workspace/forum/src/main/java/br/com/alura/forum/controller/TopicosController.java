package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.*;
import br.com.alura.forum.repository.TopicoRepository;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicosRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		List<Topico> topicos = topicosRepository.findAll();
		return TopicoDto.converter(topicos);
	}
}
