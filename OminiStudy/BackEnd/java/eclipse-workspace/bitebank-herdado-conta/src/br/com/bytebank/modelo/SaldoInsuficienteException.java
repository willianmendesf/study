package br.com.bytebank.modelo;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
