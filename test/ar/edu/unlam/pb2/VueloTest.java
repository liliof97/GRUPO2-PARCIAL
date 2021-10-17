package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VueloTest {

	@Test
	public void queSePuedaAgregarUnPasajeroAUnVueloCorrectamente() {
		String nombre = "Mario";
		String apellido = "Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Boolean valorEsperado = true;

		Pasajero pasajero = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA, DestinoVuelo.ALEMANIA);

		Vuelo vuelo = new Vuelo(numeroDeVuelo);

		Boolean valorObtenido = vuelo.agregarPasajero(pasajero);

		assertEquals(valorEsperado, valorObtenido);
		// Si no recuerdo mal también se puede verificar de esta forma
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queSePuedaVerificarElDestino() {
		
		Vuelo vuelo = new Vuelo(1);
		
		String valorEsperado = "El destino de su vuelo es " + DestinoVuelo.CHINA;
		
		String valorObtenido = vuelo.verificarDestino(DestinoVuelo.CHINA);
		
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queAlSuperarLaCapacidadMaximaNoPermitaIngresarPasajero() {
		String nombre = "Mario";
		String apellido = "Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Boolean valorEsperado = false;

		Pasajero pasajero1 = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA, DestinoVuelo.ALEMANIA);
		Pasajero pasajero2 = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA, DestinoVuelo.ALEMANIA);
		Pasajero pasajero3 = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA, DestinoVuelo.ALEMANIA);
		Pasajero pasajero4 = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA, DestinoVuelo.ALEMANIA);

		Vuelo vuelo = new Vuelo(numeroDeVuelo);

		Boolean valorObtenido = vuelo.agregarPasajero(pasajero1);
		valorObtenido = vuelo.agregarPasajero(pasajero2);
		valorObtenido = vuelo.agregarPasajero(pasajero3);
		valorObtenido = vuelo.agregarPasajero(pasajero4);

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queAlElegirTipoDeVueloPrimeraClaseElPrecioDelPasajeSeaDiezMil() {

		String nombre = "Mario";
		String apellido = "Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Integer valorEsperado = 10000;

		Pasajero pasajero = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.PRIMERACLASE, DestinoVuelo.ALEMANIA);
		Vuelo vuelo = new Vuelo(numeroDeVuelo);

		Integer valorObtenido = vuelo.precioTipoVuelo(pasajero);

		assertEquals(valorEsperado, valorObtenido);

	}
	
	@Test
	public void queSePuedaVerificarElPrecioDelDestino() {

		String nombre = "Mario";
		String apellido = "Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Integer valorEsperado = 3400;
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo);
		Pasajero pasajero = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.PRIMERACLASE, DestinoVuelo.ITALIA);
		
		
		Integer valorObtenido = vuelo.verificarPrecioDestino(pasajero);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queAlElegirTipoDeVueloClaseTuristaYAlElegirDestinoFranciaElPrecioDelPasajeSeaDeSeisMil() {
		String nombre = "Mario";
		String apellido = "Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Integer valorEsperado = 6000;
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo);
		Pasajero pasajero = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA, DestinoVuelo.FRANCIA);
		
		Integer valorObtenido=vuelo.precioPasaje(pasajero);
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
}
