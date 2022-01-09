package br.com.retangulo.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import retangulo.Retangulo;

@RunWith(Parameterized.class)
public class RetanguloTest {

	private int base;
	private int altura;
	private int area;

	int calcularArea;
	int calcularPerimetro;
	int resultado;
	int resultado2;

	Retangulo retangulo;

	public RetanguloTest(int base, int altura, int area) {
		this.base = base;
		this.altura = altura;
		this.area = area;
	}

	@Parameters
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][] {
			{10,20,200},
			{10,30,300}
		});
	}

	@Before
	public void setUp() throws Exception {
		retangulo = new Retangulo(base, altura);

		resultado = retangulo.calculaArea();
		resultado2 = retangulo.calculaPerimetro();

		calcularArea = retangulo.calculaArea();
		calcularPerimetro = retangulo.calculaPerimetro();
	}

	@Test
	public void calculaArea() {
		assertEquals(resultado, calcularArea);
	}

	@Test
	public void calculaPerimetro() {
		assertEquals(resultado2, calcularPerimetro);
	}

}
