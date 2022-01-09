package calc;

public class CalculadoraTest {
	private String module;

	public void MultiplicaTest(){
		module = "MULTIPLICATEST";

		Calculadora calculadora =  new Calculadora();

		int retornoEsperado = 9;
		int retorno = calculadora.multiplica(3,3);

		if(retornoEsperado == retorno) {
			System.out.println(module + ": Teste OK, era esperado: " + retornoEsperado + " retornou: " + retorno);
		} else {
			System.out.println(module + ": Teste Falhou, era esperado " + retornoEsperado + " retornou: " + retorno);
		}
	}

	public void SomaTest(){
		module = "SOMATEST";

		Calculadora calculadora =  new Calculadora();

		int retornoEsperado = 4;
		int retorno = calculadora.soma(2,2);

		if(retornoEsperado == retorno) {
			System.out.println(module + ": Teste OK, era esperado: " + retornoEsperado + " retornou: " + retorno);
		} else {
			System.out.println(module + ": Teste Falhou, era esperado " + retornoEsperado + " retornou: " + retorno);
		}
	}

	public void SubtraiTest() {
		module = "SUBTRAITEST";

		Calculadora calculadora =  new Calculadora();

		int retornoEsperado = 2;
		int retorno = calculadora.subtrai(5,3);

		if(retornoEsperado == retorno) {
			System.out.println(module + ": Teste OK, era esperado: " + retornoEsperado + " retornou: " + retorno);
		} else {
			System.out.println(module + ": Teste Falhou, era esperado " + retornoEsperado + " retornou: " + retorno);
		}
	}
}
