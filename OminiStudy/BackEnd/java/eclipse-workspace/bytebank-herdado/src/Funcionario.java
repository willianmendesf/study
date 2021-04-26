
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - funcionario comum, 1- gerente;
	
	public Funcionario(String nome, String cpf) { 
		this.nome = nome; this.cpf = cpf; 
	}
	
	public void setTipo(int tipo) { this.tipo = tipo; }
	public int getTipo() { return tipo; }
	
	public double getBonificacao() { return this.salario * 0.05; }
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getCpf() { return cpf; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	
	public double getSalario() { return salario; }
	public void setSalario(double salario) { this.salario = salario; }
}
