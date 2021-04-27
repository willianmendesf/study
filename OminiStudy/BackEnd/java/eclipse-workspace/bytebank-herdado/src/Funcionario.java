// abstract: nao pode instanciar dessa classe porque é abstrata (nao pode dar NEW).
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0;
		
	public Funcionario(String nome, String cpf) { this.nome = nome; this.cpf = cpf; }
	
	public void setTipo(int tipo) { this.tipo = tipo; }
	public int getTipo() { return tipo; }
	
	// abstract: metodo sem corpo, nao ha implementação.
	public abstract double getBonificacao();
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getCpf() { return cpf; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	
	public double getSalario() { return salario; }
	public void setSalario(double salario) { this.salario = salario; }
}
