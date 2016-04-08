package ar.edu.unlam.tallerweb.clase2;

import org.junit.Assert;
import org.junit.Test;

public class AnilloTest {

	@Test
	public void deberiaCalcularElPerimetroInternoDelAnillo() {
		Double perimetroInternoEsperado = 7.53984;
		Double perimetroInternoObtenido = 0.0;
		
		Anillo anillo = new Anillo();
		
		perimetroInternoObtenido = anillo.calcularPerimetroInterno();
		Assert.assertEquals("El perimetro interno obtenido no es el esperado", perimetroInternoEsperado, perimetroInternoObtenido);
	}
	
	@Test
	public void deberiaObtenerElPerimetroExternoDelAnillo() {

		Double perimetroExternoEsperado = 15.07968;
		Double perimetroExternoObtenido = 0.0;
		
		Anillo anillo = new Anillo();
		
		perimetroExternoObtenido = anillo.calcularPerimetroExterno();
		Assert.assertEquals("El perimetro externo obtenido no es el esperado", perimetroExternoEsperado, perimetroExternoObtenido);
	}

	@Test
	public void deberiaObtenerElAreaDelAnillo() {
		
		Double areaEsperada = 1.2;
		Double areaObtenida = 0.0;
		
		Anillo anillo = new Anillo();
		
		areaObtenida = anillo.calcularArea();
		Assert.assertEquals("El área obtenida no es la esperada", areaEsperada, areaObtenida);
	}
}
