package br.com.bytebank.test;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(123,123);
		conta.deposita(200.0);
		
		try {
			conta.saca(252.20);			
			System.out.println(conta.getSaldo());
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
