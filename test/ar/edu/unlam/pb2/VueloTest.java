package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VueloTest {

	@Test
	public void queSePuedaAgregarUnPasajeroAUnVueloCorrectamente() {
		
		Pasajero pasajero = new Pasajero("Mario", "Lopez", 23445, 40001002, TipoDeVuelo.CLASETURISTA);
		Vuelo vuelo = new Vuelo(1);
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = vuelo.agregarPasajero(pasajero);
		
		assertEquals(valorEsperado, valorObtenido);	
		//Si no recuerdo mal también se puede verificar de esta forma
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
	public void queSePuedaVerificarElPrecioDelDestino() {
		
		Vuelo vuelo = new Vuelo(1);
		
		String valorEsperado = "El valor de su destino es de " + 3400;
		
		String valorObtenido = vuelo.verificarPrecioDestino(DestinoVuelo.ITALIA);
		
		assertEquals(valorEsperado, valorObtenido);
	}
}
