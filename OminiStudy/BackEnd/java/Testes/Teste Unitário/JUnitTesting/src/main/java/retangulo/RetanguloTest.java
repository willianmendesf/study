package retangulo;

public class RetanguloTest {
	private String module;

	public void CalculaAreaTest(){
		module = "CALCULAAREATEST";

		Retangulo retangulo;

		retangulo = new Retangulo(10, 2);

		int resuladoEsperado = 20;
		int resultado = retangulo.calculaArea();

		if(resultado == resuladoEsperado) {
			System.out.println(module + ": Teste OK!, esperado: " + resuladoEsperado + " retornou: " + resultado);
		} else {
			System.out.println(module + ": Teste FALHOU!, esperado: " + resuladoEsperado + " retornou: " + resultado);
		}
	}

	public void CalculaPerimetroTest(){
		module = "CALCULAPERIMETROTEST";

		Retangulo retangulo;

		retangulo = new Retangulo(10, 2);

		int resuladoEsperado = 24;
		int resultado = retangulo.calculaPerimetro();

		if(resultado == resuladoEsperado) {
			System.out.println(module + ": Teste OK!, esperado: " + resuladoEsperado + " retornou: " + resultado);
		} else {
			System.out.println(module + ": Teste FALHOU!, esperado: " + resuladoEsperado + " retornou: " + resultado);
		}
	}
}
