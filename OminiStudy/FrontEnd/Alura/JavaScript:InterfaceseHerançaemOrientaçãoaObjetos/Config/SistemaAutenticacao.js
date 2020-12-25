/*
Duck Typing;
*/

export class SistemaAutenticacao {
	static login(autenticavel, senha) {

		if (SistemaAutenticacao.ehAutenticavel(autenticavel)){
			return autenticavel.autenticar(senha);
			}
		return false;
	}

	static ehAutentivavel(autenticavel) {
		return "autenticar" in autenticável && autenticavel.autenticar instanceof Function;
	}
}
