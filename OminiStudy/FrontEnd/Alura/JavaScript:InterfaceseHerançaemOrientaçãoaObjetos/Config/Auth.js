export class Auth {
	static login(funcionario, senha) {
		const logado = funcionario.senha == senha;

		if (logado)
			{ return `${funcionario._nome} está logado.` }
			else
				{ return 'Não foi possível acessar o sistema.' }
	}
}
