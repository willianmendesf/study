import { Cliente } from './Cliente.js';
import { Conta } from './Conta.js';
import { ContaCorrente } from './ContaCorrente.js';
import { ContaPoupanca } from './ContaPoupanca.js';

const cliente1 = new Cliente('Ricardo', 36872639)
const ContaCorrenteRicardo = new ContaCorrente(cliente1, 1001)
// ContaCorrenteRicardo.depositar(300)
const contaPoupancaRicardo = new ContaPoupanca(ContaCorrenteRicardo.sacar(140), cliente1, 1001);
console.log(ContaCorrenteRicardo);
// console.log(contaPoupancaRicardo);


