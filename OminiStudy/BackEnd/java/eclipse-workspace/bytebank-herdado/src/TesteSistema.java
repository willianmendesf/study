
public class TesteSistema {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		
		Gerente g = new Gerente("Claudio","222.222.222-22");
		g.setSenha(2222);
		si.autentica(g);
		
		Administrador adm = new Administrador("Marcos", "222");
		adm.setSenha(3333);
		si.autentica(adm);
		
		Cliente c = new Cliente();
		c.setSenha(2222);
		si.autentica(c);
		
		Autenticavel gerente = new Gerente("O","2");
		gerente.setSenha(2222);
		si.autentica(gerente);
	}
	
}
