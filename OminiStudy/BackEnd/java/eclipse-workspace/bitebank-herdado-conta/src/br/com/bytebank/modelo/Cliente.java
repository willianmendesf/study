package br.com.bytebank.modelo;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author willianmendesf
 * Version: 1.0
 *
 */
public class Cliente {
	
	private String 	nome;
	private String	cpf;
	private String 	profissão;
	
	
	public String 	getNome() { return nome; }
	public void 	setNome(String nome) { this.nome = nome; }
	
	public String 	getCpf() { return cpf; }
	public void 	setCpf(String cpf) { this.cpf = cpf; }
	
	public String 	getProfissão() { return profissão; }
	public void 	setProfissão(String profissão) { this.profissão = profissão; }
	
}