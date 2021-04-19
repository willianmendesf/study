
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;

		if (idade >= 18) System.out.println("Você tem mais de 18 anos.");
		else {
			if (quantidadePessoas >= 2) System.out.println("voce nao tem 18, mas pode entrar," + "pois está companhado.");
			else System.out.println("infelizmente você nao pode entrar.");
		}
	}
}
