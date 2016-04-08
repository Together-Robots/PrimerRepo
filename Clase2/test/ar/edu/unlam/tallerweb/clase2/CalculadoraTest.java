package ar.edu.unlam.tallerweb.clase2;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deberiaPoderSumarDosNumeros() {
		Integer resultadoEsperado = 7;
		Integer resultadoObtenido = 0;
		Calculadora miCalculadora = new Calculadora();
		resultadoObtenido = miCalculadora.sumar(4, 3);
		Assert.assertEquals("El valor obtenido no es el esperado.", resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void deberiaPoderRestarDosNumeros() {
		Integer resultadoEsperado = 1;
		Integer resultadoObtenido = 0;
		Calculadora miCalculadora = new Calculadora();
		resultadoObtenido = miCalculadora.restar(4, 3);
		Assert.assertEquals("El valor obtenido no es el esperado.", resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void deberiaPoderMultiplicarDosNumeros() {
		Integer resultadoEsperado = 12;
		Integer resultadoObtenido = 0;
		Calculadora miCalculadora = new Calculadora();
		resultadoObtenido = miCalculadora.multiplicar(4, 3);
		Assert.assertEquals("El valor obtenido no es el esperado.", resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void deberiaPoderDividirDosNumeros() {
		Double resultadoEsperado = 1.5;
		Double resultadoObtenido = 4.0;
		Calculadora miCalculadora = new Calculadora();
		resultadoObtenido = miCalculadora.dividir(3.0, 2.0);
		Assert.assertEquals("El valor obtenido no es el esperado.", resultadoEsperado, resultadoObtenido);
	}
}
