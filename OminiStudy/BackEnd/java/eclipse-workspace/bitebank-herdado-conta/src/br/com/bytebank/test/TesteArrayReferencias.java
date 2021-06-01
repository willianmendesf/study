package br.com.bytebank.test;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5]
		//ContaCorrente[] contas = new ContaCorrente[5];
		//Conta[] contas = new Conta[5];
		Object[] contas = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(121,121);
		ContaPoupanca cc2 = new ContaPoupanca(122,122);
		ContaPoupanca ref = (ContaPoupanca) contas[0]; // type cast
		Cliente cliente = new Cliente();

		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cliente;
		
		//System.out.println(cc2.getNumero());
//		System.out.println(contas[1].getNumero());
//		System.out.println(contas[2].getNumero());
		System.out.println(ref.getNumero());
		
		
		
		
		
		
	}
}
