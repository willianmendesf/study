package calc;

public class CalculadoraTestMultiplica {

	public static void main(String[] args) {

		Calculadora calculadora =  new Calculadora();

		int retornoEsperado = 9;

		int retorno = calculadora.multiplica(3,3);

		if(retornoEsperado == retorno) {
			System.out.println("Teste OK, era esperado: " + retornoEsperado + " retornou: " + retorno);
		} else {
			System.out.println("Teste Falhou, era esperado " + retornoEsperado + " retornou: " + retorno);
		}
	}
}
