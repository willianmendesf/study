package Application;

import retangulo.RetanguloTest;
import calc.CalculadoraTest;

public class RunApplicationTests {
	public static void main(String args[]) {
		// Calculadora Module
		CalculadoraTest calculadora = new CalculadoraTest();
		calculadora.MultiplicaTest();
		calculadora.SubtraiTest();
		calculadora.SomaTest();

		// Retangulo Module
		RetanguloTest retangulo = new RetanguloTest();
		retangulo.CalculaAreaTest();
		retangulo.CalculaPerimetroTest();
	}
}


