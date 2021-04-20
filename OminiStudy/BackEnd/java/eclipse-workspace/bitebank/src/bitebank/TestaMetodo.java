package bitebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		conta.saca(20);
		System.out.println(conta.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		System.out.println(conta2.saldo);
		conta2.transfere(300, conta);
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
		
		conta.titular = "Paulo Silveira";
		System.out.println(conta.titular);
	}
}
