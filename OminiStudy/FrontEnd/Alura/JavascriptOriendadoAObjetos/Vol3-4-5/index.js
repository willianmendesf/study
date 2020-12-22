import { Cliente } from './Cliente.js';
import { ContaCorrente } from './ContaCorrente.js';

const cliente1 = new Cliente('Ricardo', 123355353)
const ContaCorrenteRicardo = new ContaCorrente(1001, cliente1)
ContaCorrenteRicardo.depositar(500)

// NOVO CLIENTE
const cliente2 = new Cliente('Pedro', 129301293013)
const ContaCorrentePedro = new ContaCorrente(102, cliente2);
ContaCorrenteRicardo.transferir(100, ContaCorrentePedro)

console.log(ContaCorrente.NumeroDeContas)
