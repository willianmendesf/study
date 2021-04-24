
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		conta.deposita(100);
		
		Conta conta2 = new Conta(1337, 24226);
		conta2.deposita(1000);
		
		Conta conta3 = new Conta(1337, 24226);
		conta3.deposita(1299.22);
		
		System.out.println(conta3.saldo());
		System.out.println(Conta.getTotal());
	}

}
