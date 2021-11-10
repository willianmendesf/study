package br.com.calculadora.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import calc.Calculadora;

@FixMethodOrder(MethodSorters.JVM)
public class CalculadoraTest {

	int testeSoma;
	int testeMultiplcia;
	int testeSubtrai;

	Calculadora calculadora;

	@Before
	public void setUp() throws Exception {
		calculadora = new Calculadora();

		testeSoma = calculadora.soma(10, 10);
		testeSubtrai = calculadora.subtrai(20, 10);
		testeMultiplcia = calculadora.multiplica(3, 3);
	}

	@Test
	public void testSoma() {
		assertEquals(20, testeSoma);
	}

	@Test
	public void testMultiplica() {
		assertEquals(9, testeMultiplcia);
	}

	@Test(timeout = 200)
	public void testSubtrai() {
		assertEquals(10, testeSubtrai);
	}

}
