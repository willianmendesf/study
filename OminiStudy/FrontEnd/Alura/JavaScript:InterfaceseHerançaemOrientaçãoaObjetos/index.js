import { Gerente } from './Funcionarios/Gerente.js'
import { Diretor } from './Funcionarios/Diretor.js'
import { Auth } from './Config/Auth.js'
import { Cliente } from './Cliente.js'


// DIRETOR
const diretor = new Diretor("Rodrigo", 10000, 1231231231)
diretor.cadastrarSenha('12345678')
const diretorLogado = Auth.login(diretor, '12345678')

// GERENTE
const gerente = new Gerente("Ricardo", 5000, 12312902031)
gerente.cadastrarSenha('123456789')
const gerenteLogado = Auth.login(gerente, '123456789')


// CLIENTE
const cliente = new Cliente("Lais", '938746586799')
// cliente.cadastrarSenha('123')
const clienteLogado = Auth.login(cliente, '123')

console.log( clienteLogado )
