package com.carros.domain;

public class Carro {
	private Long id;
	private String nome;
	
	public Carro(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String nome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
