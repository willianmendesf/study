package com.bolsadeideias.springboot.web.app.models;

public class Usuario {
	private String name;
	private String lastname;
	private String email;

	public Usuario() {}

	public Usuario (String name, String lastname, String email) {
		this.setName(name);
		this.setLastname(lastname);
		this.setEmail(email);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
