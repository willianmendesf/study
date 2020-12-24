import { Cliente } from './Cliente.js';
import { ContaCorrente } from './ContaCorrente.js';
import { ContaPoupanca } from './ContaPoupanca.js';
import { ContaSalario } from './ContaSalario.js';

const cliente1 = new Cliente('Ricardo', 36872639)
const ContaCorrenteRicardo = new ContaCorrente(cliente1, 1001)

const contaPoupancaRicardo = new ContaPoupanca(ContaCorrenteRicardo.sacar(140), cliente1, 1001);
const contaSalario =  new ContaSalario(cliente1)

contaSalario.depositar(100)
contaSalario.sacar(10)

console.log(contaSalario);


