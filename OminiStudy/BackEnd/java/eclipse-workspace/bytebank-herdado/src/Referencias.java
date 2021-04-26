
public class Referencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Marcos", "222");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Gerente("Marcos", "222");
		f1.setSalario(2000.0);
		
		Funcionario b1 = new Gerente("Marcos", "222");
		b1.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(b1);
		
		System.out.println(controle.getSoma());
	}
}
