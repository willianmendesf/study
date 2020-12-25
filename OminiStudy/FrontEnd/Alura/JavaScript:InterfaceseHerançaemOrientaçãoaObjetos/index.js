import { SistemaAutenticacao } from './Config/SistemaAutenticacao.js'
import { Diretor } from './Funcionarios/Diretor.js'
import { Gerente } from './Funcionarios/Gerente.js'
import { Cliente } from './Funcionarios/Cliente.js'


// DIRETOR
const diretor = new Diretor("Rodrigo", 10000, 1231231231)
diretor.cadastrarSenha('12345678')
const diretorLogado = SistemaAutenticacao.login(diretor, '12345678')

// GERENTE
const gerente = new Gerente("Ricardo", 5000, 12312902031)
gerente.cadastrarSenha('123456789')
const gerenteLogado = SistemaAutenticacao.login(gerente, '123456789')

// CLIENTE
const cliente = new Cliente("Lais", '938746586799')
const clienteLogado = SistemaAutenticacao.login(cliente, '123')

console.log( diretorLogado, gerenteLogado, clienteLogado )
