package br.com.bytebank.main;

import br.com.bytebank.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(123, 123);
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());

	}

}
