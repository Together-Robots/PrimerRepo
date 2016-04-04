/*Nombre del Paquete.
 En esta clase se encuentran la logica que realiza las pruebas.
 */
package ar.edu.unlam.tallerweb.clase1;

/*A mi entender los imports son las librerias que utiliza JAVA
en este caso junit que van a permitir testear la aplicacion
se importa tanto el Assert como el Test porque los vamos
a usar.
 */

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/*INI del constructor por default ContadorDeGanadoTest*/

public class ContadorDeGanadoTest {

	//Declaro el metodo que testee
	
	@Test //Especifico que es una prueba
	public void testQuePuedaContar() {
		
		//preparacion
		
		/*Los Objetos son instancias de una clase
		por lo que declaro un nuevo objeto "miContador"
		de la clase ContadorDeGanado y le especifico 
		que voy a hacer un nuevo (new) ContadorDeGanado()
		*/
		
		ContadorDeGanado miContador = new ContadorDeGanado();
		Integer cantidadEsperada=1; //si es 2 da error
		
		/*Le cargue el valor 1 a la variable cantidadEsperada*/
		
		//Ejecucion
		
		/*Le concateno la funcion contar a mi objeto miContador
		 Declaro la variable cantidadObtenida y la igualo
		 al valor que devuelve la funcion de mi objeto
		 Recordar de la otra clase que se le carga valor "1"
		 */
		miContador.contar();
		Integer cantidadObtenida=miContador.mostrarCantidad();
		
		//Validacion
		
		/*Los Assert basicamente sirven para comparar valores
		Existen varios tipos de comparador, en este caso 
		usamos el assertEquals que compara la cantidadEsperada
		con la cantidadObtenida 1=1 ?*/
		
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		
		//Limpieza
		
		/*Es necesario limpiar el constructor del objeto por si
		 se desea correr nuevamente el programa ya que
		 si no se limpia podrìa quedar basura en el buffer
		 y generarìa algun error. 
		 Mas que nada se usa para optimizar.
		 */
		
		miContador=null;
	}
	
	//Crear un contador que devuelva 0 ? 
	
	/*
	@Test
	public void testQueDaZeroCuandoCorre() {
		//preparacion
		ContadorDeGanado miContador = new ContadorDeGanado();
		Integer cantidadEsperada=0; //si es 2 da error
		//Ejecucion
		miContador.contar();
		Integer cantidadObtenida=miContador.mostrarCantidad();
		//Validacion
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		//Limpieza
		miContador=null;*/
	
} //FIN Del Constructor Defautl.
