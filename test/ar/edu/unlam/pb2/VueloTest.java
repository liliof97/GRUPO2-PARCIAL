package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VueloTest {

	@Test
	public void queSePuedaAgregarUnPasajeroAUnVueloCorrectamente() {
		String nombre="Mario";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Boolean valorEsperado = true;
		
		Pasajero pasajero = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA);
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo);
		
		Boolean valorObtenido = vuelo.agregarPasajero(pasajero);
		
		assertEquals(valorEsperado, valorObtenido);	
		//Si no recuerdo mal también se puede verificar de esta forma
		assertTrue(valorObtenido);
	}

	@Test
	public void queAlElegirTipoDeVueloPrimeraClaseElPrecioDelPasajeSeaDiezMil() {

		String nombre="Mario";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Integer valorEsperado = 10000;
		
		Pasajero pasajero = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.PRIMERACLASE);
		Vuelo vuelo = new Vuelo(numeroDeVuelo);
		
		Integer valorObtenido = vuelo.precioPasaje(pasajero);
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
}
