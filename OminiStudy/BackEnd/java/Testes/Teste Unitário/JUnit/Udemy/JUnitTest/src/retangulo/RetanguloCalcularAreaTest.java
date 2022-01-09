package retangulo;

public class RetanguloCalcularAreaTest {
	public static void main(String args[]) {

		Retangulo retangulo;

		retangulo = new Retangulo(10, 2);
		int resuladoEsperado = 20;

		int resultado = retangulo.calcularArea();

		if(resultado == resuladoEsperado) {
			System.out.println("Teste OK!, esperado: " + resuladoEsperado + " retornou: " + resultado);
		} else {
			System.out.println("Teste FALHOU!, esperado: " + resuladoEsperado + " retornou: " + resultado);
		}
	}
}
