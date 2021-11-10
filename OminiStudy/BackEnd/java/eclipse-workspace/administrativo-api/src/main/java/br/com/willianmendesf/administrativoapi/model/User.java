package br.com.willianmendesf.administrativoapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
// @AllArgsConstructor
// @Entity // Isto diz para o Hibernate Criar uma tabela dessa classe.
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String name;
	private String lastname;
	private String dataNasc;
	private Integer age;
	private String CPF;
	private String password;
	private String username;

	public User(String name, String lastname, String dataNasc, Integer age, String CPF) {
		this.name = name;
		this.lastname = lastname;
		this.dataNasc = dataNasc;
		this.age = age;
		this.CPF = CPF;
	}
}
