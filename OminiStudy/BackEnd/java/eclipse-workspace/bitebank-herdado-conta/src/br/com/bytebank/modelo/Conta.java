package br.com.bytebank.modelo;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author willianmendesf
 * Version: 1.0
 *
 */
public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o Objeto Conta a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		if (valor <= 0.1) {
			System.out.println("Valor de depositado Inv�lido.");
			return;
		} this.saldo += valor;
	}
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Fundos insuficiente. Seu Saldo � " + this.saldo);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double 		getSaldo() { return this.saldo; }
	public static int 	getTotal() { return Conta.total; }
	
	public int			getNumero() { return this.numero; }
	public void 		setNumero(int numero) { this.numero = numero; }
	
	public int 			getAgencia() { return agencia; }
	public void 		setAgencia(int agencia) { this.agencia = agencia; }
	
	public void 		setTitular(Cliente titular) { this.titular = titular; }
	public Cliente 		getTitular() { return titular; }
}
