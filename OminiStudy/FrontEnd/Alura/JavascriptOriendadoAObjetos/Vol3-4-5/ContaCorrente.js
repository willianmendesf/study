import { Cliente } from './Cliente.js';

export class ContaCorrente {
	static NumeroDeContas = 0;
	_agencia;
	_cliente;
	_saldo = 0
	// #saldo = 0 future feature JS for private methods

	constructor (agencia, cliente) {
		this._agencia = agencia;
		this._cliente = cliente;
		ContaCorrente.NumeroDeContas += 1;
	}

	set cliente(novoCliente) {
		if (novoCliente instanceof Cliente) {
			this._cliente = novoCliente;
		}
	}

	get cliente() {
		return this._cliente;
	}

	get saldo () {
		return this._saldo;
	}

	sacar(valor) {
		if (valor < 0) return 'Saldo insuficiente';
		if (this._saldo <= 0) return 'Saldo insuficiente';
		if (this._saldo >= valor) {
			this._saldo -= valor
			return valor
		} else {
			return 'Saldo insuficiente'
		}
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
