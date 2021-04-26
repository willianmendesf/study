
public class Balconista extends Funcionario {
	
	public Balconista(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getBonificacao() { return super.getBonificacao() + 100; }
	
}
