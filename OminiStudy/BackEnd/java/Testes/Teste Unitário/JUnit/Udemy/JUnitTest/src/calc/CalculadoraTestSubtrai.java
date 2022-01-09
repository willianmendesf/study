package calc;

public class CalculadoraTestSubtrai {

	public static void main(String[] args) {

		Calculadora calculadora =  new Calculadora();

		int retornoEsperado = 2;

		int retorno = calculadora.subtrai(5,3);

		if(retornoEsperado == retorno) {
			System.out.println("Teste OK, era esperado: " + retornoEsperado + " retornou: " + retorno);
		} else {
			System.out.println("Teste Falhou, era esperado " + retornoEsperado + " retornou: " + retorno);
		}
	}
}
