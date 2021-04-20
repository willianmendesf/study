package bitebank;

public class CriaConta2 {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		primeiraConta.saldo += 100;
		// System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo += 50;
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.agencia);
		segundaConta.agencia = 146;
		System.out.println(segundaConta.agencia);
	}
}
