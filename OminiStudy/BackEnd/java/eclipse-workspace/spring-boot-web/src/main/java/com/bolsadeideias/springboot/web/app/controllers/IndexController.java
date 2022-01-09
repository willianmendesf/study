package com.bolsadeideias.springboot.web.app.controllers;

import ch.qos.logback.core.util.COWArrayList;
import com.bolsadeideias.springboot.web.app.models.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/app")
public class IndexController {

	@Value("${text.indexController.index.title}")
	private String textoIndex;

	@Value("${text.indexController.perfil.title}")
	private String textoPerfil;

	@Value("${text.indexController.list.title}")
	private String textoList;

	@GetMapping({"", "/", "/index", "/home", "/inicio"})
	public String index(Model model) {
		model.addAttribute("title", textoIndex);
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setName("William");
		usuario.setLastname("Mendes");
		usuario.setEmail("robertinho1190@gmail.com");

		model.addAttribute("usuario", usuario);
		model.addAttribute("title", textoPerfil + usuario.getName());

		return "perfil";
	}

	@RequestMapping("/list")
	public String list(Model model) {

		List<Usuario> usuarios = Arrays.asList(
			new Usuario("Marcos", "Figueiredo", "mf@mf.c"),
			new Usuario("Pedro", "Paulo", "pp@pp.c"),
			new Usuario("Iverson", "Jano", "iv@iv.c"),
			new Usuario("Paula", "Chaves", "pc@iv.c")
		);

		model.addAttribute("title", textoList);
		model.addAttribute("usuarios", usuarios);

		return "list";
	}

	@RequestMapping("/lists")
	public String lists(Model model) {
		model.addAttribute("title", "Lista de Usuarios");

		return "lists";
	}

	@ModelAttribute("users")
	public List<Usuario> returnList() {
		List<Usuario> users = Arrays.asList(
			new Usuario("Marcos", "Figueiredo", "mf@mf.c"),
			new Usuario("Pedro", "Paulo", "pp@pp.c"),
			new Usuario("Iverson", "Jano", "iv@iv.c"),
			new Usuario("Fernanda", "Pereira", "pc@iv.c"),
			new Usuario("Julho", "Pirlo", "pc@iv.c"),
			new Usuario("Muzy", "Fernandes", "pc@iv.c"),
			new Usuario("Roberto", "Chaco", "pc@iv.c"),
			new Usuario("Jano", "Cuilo", "pc@iv.c"),
			new Usuario("Paula", "Chaves", "pc@iv.c")
		);

		return users;
	}

}
