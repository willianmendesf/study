package Test;

import com.example.calc.Calculadora;

public class CalcTest {
	private Calculadora calculadora;

	public void soma() {
		calculadora = new Calculadora();
		int retornoEsperado = 4;

		int retorno = calculadora.soma(2,2);

		if(retornoEsperado == retorno) {
			System.out.println("Teste OK");
		} else {
			System.out.println("Teste Falhou");
		}
	}
}
