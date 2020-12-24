export class Conta {
	constructor(saldoInicial, cliente, agencia) {
		this._agencia 	= agencia
		this._cliente 	= cliente
		this._saldo 		= saldoInicial

		if
			(this.constructor == Conta)
			console.log('Você não deve instanciar um objeto do tipo Conta.')
	}

	set cliente(novoCliente) {
		if (novoCliente instanceof Cliente) {
			this._cliente = novoCliente;
		}
	}

	get cliente() {
		return this._cliente;
	}

	get saldo() {
		return this._saldo;
	}

	sacar(valor) {
		let taxa = 1;

		return this._sacar(valor, taxa);
	}

	_sacar(valor, taxa) {
		const valorSacado = taxa * valor

		if
			(valor < 0)
			return;

		if
			(this._saldo <= valorSacado)
			return 0;

		if
			(this._saldo >= valorSacado)
			{
				this._saldo -= valorSacado;
				return Math.round(valorSacado);
			}


		return 0;
	}

	depositar(valor) {
		if (valor < 0) return
		this._saldo += valor
	}

	transferir(valor, conta) {
		const valorSacado = this.sacar(valor)
		conta.depositar(valorSacado)
	}
}
