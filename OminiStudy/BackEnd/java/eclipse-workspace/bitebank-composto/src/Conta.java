public class Conta {
	private double _saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
	public void deposita (double valor) {
		this._saldo += valor; 
		System.out.println("Deposito realizado com sucesso. Seu saldo é: " + this._saldo);
	}
	
	public boolean saca (double valor) {
		if (this._saldo >= valor) {
			this._saldo -= valor;
			System.out.println("Saque feito com sucesso.");
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this._saldo >= valor) {
			this._saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferência feita com sucesso.");
			return true;
		}
		System.out.println("Saldo insuficiente.");
		return false;
	}
	
	public void saldo () {
		System.out.println("Seu saldo é: " + this._saldo);
	}
}
