
public class TesteGerente {
	
	public static void main(String[] args) {
		Gerente gerente  = new Gerente("Marco Pollo", "222.222.222-22");
		gerente.setSalario(5000.0);
		
		gerente.setSenha(2222);
		gerente.autentica(2222);
		
		System.out.println(gerente.getSalario());
		System.out.println(gerente.autentica(2222));	
		System.out.println(gerente.getBonificacao());
		System.out.println(gerente.getNome());
	}
}
