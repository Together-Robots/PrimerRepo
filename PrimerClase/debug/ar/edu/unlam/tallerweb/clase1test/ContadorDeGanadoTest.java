package ar.edu.unlam.tallerweb.clase1test;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.clase1.ContadorDeGanado;

public class ContadorDeGanadoTest {

	@Test
	public void testQuePuedaContar() {

		ContadorDeGanado miContador = new ContadorDeGanado();
		Integer cantidadEsperada = 1;

		miContador.contar();
		Integer cantidadObtenida = miContador.mostrarCantidad();

		Assert.assertEquals(cantidadEsperada, cantidadObtenida);

		//limpiar buffer del constructor
		miContador = null;
		//que onda con el status de git?
	}	
}