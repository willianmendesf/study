package calc;

public class CalculadoraTestSoma {

	public static void main(String args[]) {
		Calculadora calculadora =  new Calculadora();

		int retornoEsperado = 4;

		int retorno = calculadora.soma(2,2);

		if(retornoEsperado == retorno) {
			System.out.println("Teste OK, era esperado: " + retornoEsperado + " retornou: " + retorno);
		} else {
			System.out.println("Teste Falhou, era esperado " + retornoEsperado + " retornou: " + retorno);
		}
	}
}
