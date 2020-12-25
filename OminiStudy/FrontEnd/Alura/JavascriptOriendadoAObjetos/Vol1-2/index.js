class Cliente {
	nome
	cpf
	rg
}

class ContaCorrente {
	agencia
	// #saldo = 0 future feature JS for private methods
	_saldo = 0

	sacar(valor) {
		if (valor < 0) return 'Saldo insuficiente'
		if (this._saldo >= valor) {
			this._saldo -= valor
			return valor
		} else {
			return
		}
	}

	depositar(valor) {
		if (valor < 0) return
		this._saldo += valor
	}
}

const cliente1 = new Cliente()
const cliente1CC = new ContaCorrente()

cliente1.nome = 'Ricardo'
cliente1.cpf = 123355353
cliente1.rg = 1231313123

cliente1CC.agencia = 2021
cliente1CC.depositar(300)

const valorSacado = cliente1CC.sacar(-100)
console.log(valorSacado)

console.log(cliente1CC)
