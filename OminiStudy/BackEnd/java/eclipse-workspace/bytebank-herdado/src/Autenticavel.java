// Contrato autenticavel;
	//quem assinar esse contrato, precisa implementar;
		//metodo set senha;
		//metodo autentica;

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
