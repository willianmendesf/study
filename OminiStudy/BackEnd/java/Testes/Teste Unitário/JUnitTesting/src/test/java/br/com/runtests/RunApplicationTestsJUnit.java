package br.com.runtests;

import br.com.calculadora.test.CalculadoraTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import br.com.retangulo.test.RetanguloTest;

import java.sql.ResultSet;
import java.util.List;


public class RunApplicationTestsJUnit {
	public static void main (String args[]){
		Result retangulo = JUnitCore.runClasses(RetanguloTest.class);
		Result calculadora = JUnitCore.runClasses(CalculadoraTest.class);

		List<Failure> falhaRetangulo 		= retangulo.getFailures();
		List<Failure> falhaCalculadora 	= calculadora.getFailures();

		for(Failure failure : falhaRetangulo) {
			System.out.println(failure.getMessage());
		}

		for(Failure failure : falhaCalculadora) {
			System.out.println(failure.getMessage());
		}

		System.out.println("RetanguloTest: " + retangulo.wasSuccessful());
		System.out.println("CalculadoraTest: " + retangulo.wasSuccessful());
	}
}





