
public class TestGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,22292);
		// conta.setNumero(1337);
		conta.setNumero(1337);
		// System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		// conta.titular = "paulo";
		//conta.setTitular("Paulo");
		// paulo.setNome();
		paulo.setCpf("222.222.222-22");
		paulo.setProfissão("Developer");
		conta.setTitular(paulo);
		
		conta.getTitular().setProfissão("Programador");
		System.out.println(conta.getTitular().getProfissão());
	}
}
