
public class Balconista extends Funcionario {
	
	public Balconista(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public double getBonificacao() {
		return 200;
	}
}
