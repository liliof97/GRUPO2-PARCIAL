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

		Vuelo vuelo = new Vuelo(numeroDeVuelo, pasajero.getDestino());

		Boolean valorObtenido = vuelo.agregarPasajero(pasajero,1 ,1);

		assertEquals(valorEsperado, valorObtenido);
		// Si no recuerdo mal también se puede verificar de esta forma
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queSePuedaVerificarElDestino() {
		
		Vuelo vuelo = new Vuelo(1, DestinoVuelo.CHINA);
		
		String valorEsperado = "El destino de su vuelo es " + DestinoVuelo.CHINA;
		
		String valorObtenido = vuelo.verificarDestino(DestinoVuelo.CHINA);
		
		assertEquals(valorEsperado, valorObtenido);
	}

		
	public void queAlComprarElVueloyAsignarSuAsientoYTipoDeVueloEsteGuardeAlPasajeroEnElTipoDevueloDeseado() {
		TipoDeVuelo tipo=TipoDeVuelo.PRIMERACLASE;
		DestinoVuelo destino=DestinoVuelo.ALEMANIA;
		
		Pasajero pasajero=new Pasajero("lili","alvez",456123,415936,tipo,destino);
		
		Vuelo vuelo=new Vuelo(456789,destino);
		
		Boolean valorActual=vuelo.agregarPasajero(pasajero,0,1);
		
		assertTrue(valorActual);
	}
	@Test
	public void agregarPersonaAlaClaseDeClaeBusinessyQueMeTireFalseSiEstaLlenaLosAsientosDeTipoDeVuelo() {
		TipoDeVuelo tipo=TipoDeVuelo.CLASEBUSINESS;
		DestinoVuelo destino=DestinoVuelo.ALEMANIA;
		
		Pasajero pasajero1=new Pasajero("lili","alvez",456123,415936,tipo,destino);
		Pasajero pasajero2=new Pasajero("lili","alvez",456123,415936,tipo,destino);
		Pasajero pasajero3=new Pasajero("lili","alvez",456123,415936,tipo,destino);
		Pasajero pasajero4=new Pasajero("lili","alvez",456123,415936,tipo,destino);
		Pasajero pasajero5=new Pasajero("lili","alvez",456123,415936,tipo,destino);

		
		Vuelo vuelo=new Vuelo(456789,destino);
		
		Boolean valorActual1=vuelo.agregarPasajero(pasajero1,0,0);
		Boolean valorActual2=vuelo.agregarPasajero(pasajero1,0,1);
		Boolean valorActual3=vuelo.agregarPasajero(pasajero2,1,0);
		Boolean valorActual4=vuelo.agregarPasajero(pasajero3,1,1);
		Boolean valorActual5=vuelo.agregarPasajero(pasajero4,1,1);
		
		assertTrue(valorActual1);
		assertTrue(valorActual2);
		assertTrue(valorActual3);
		assertTrue(valorActual4);
		assertFalse(valorActual5);
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
		Vuelo vuelo = new Vuelo(numeroDeVuelo,DestinoVuelo.ALEMANIA);

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
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo,DestinoVuelo.ITALIA);
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
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo, DestinoVuelo.FRANCIA);
		Pasajero pasajero = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA, DestinoVuelo.FRANCIA);
		
		Integer valorObtenido=vuelo.precioPasaje(pasajero);
		
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void noGuardarPasajeroSiEsteRepiteElMismoAsiente() {
		TipoDeVuelo tipo=TipoDeVuelo.CLASEBUSINESS;
		DestinoVuelo destino=DestinoVuelo.ALEMANIA;
		DestinoVuelo destino1=DestinoVuelo.CHINA;
		
		Pasajero pasajero1=new Pasajero("lili","alvez",456123,415936,tipo,destino);
		Pasajero pasajero2=new Pasajero("lili","alvez",456123,415936,tipo,destino1);
		
		Vuelo vuelo=new Vuelo(456789,destino);
		
		Boolean valorActual1=vuelo.agregarPasajero(pasajero1,0,0);
		Boolean valorActual2=vuelo.agregarPasajero(pasajero2,0,0);
		
		assertTrue(valorActual1);
	    assertFalse(valorActual2);
	}
	@Test
	public void queDeFalseSiElDestinoDelVueloYdestinoDePasajeroSonDistintos() {
		TipoDeVuelo tipo=TipoDeVuelo.CLASETURISTA;
		DestinoVuelo destino=DestinoVuelo.ALEMANIA;
		DestinoVuelo destino1=DestinoVuelo.CHINA;
		
		Pasajero pasajero1=new Pasajero("lili","alvez",456123,415936,tipo,destino);
		Pasajero pasajero2=new Pasajero("lili","alvez",456123,415936,tipo,destino1);
		
		Vuelo vuelo=new Vuelo(456789,destino);
		
		Boolean valorActual1=vuelo.agregarPasajero(pasajero1,0,0);
		Boolean valorActual2=vuelo.agregarPasajero(pasajero2,0,0);
		
		assertTrue(valorActual1);
	    assertFalse(valorActual2);
		
		
	}
	@Test 
	public void queSeDeLaOrdenTrueDeDespegarSiLaCantidadDePasajerosSuperaEl50PorcientoDeLaCapacidadMaximaDePasajeros() {

	TipoDeVuelo tipo1=TipoDeVuelo.CLASETURISTA;
	TipoDeVuelo tipo2=TipoDeVuelo.PRIMERACLASE;
    TipoDeVuelo tipo3=TipoDeVuelo.CLASEBUSINESS;
	DestinoVuelo destino=DestinoVuelo.ALEMANIA;
	
	
	Pasajero pasajero1=new Pasajero("lili","alvez",456123,415936,tipo2,destino);
	Pasajero pasajero2=new Pasajero("lili","alvez",456123,415936,tipo2,destino);
	Pasajero pasajero3=new Pasajero("lili","alvez",456123,415936,tipo2,destino);
	Pasajero pasajero4=new Pasajero("lili","alvez",456123,415936,tipo1,destino);
	Pasajero pasajero5=new Pasajero("lili","alvez",456123,415936,tipo1,destino);
	Pasajero pasajero6=new Pasajero("lili","alvez",456123,415936,tipo3,destino);
	Vuelo vuelo=new Vuelo(456789,destino);
	vuelo.agregarPasajero(pasajero1,0,0);
	vuelo.agregarPasajero(pasajero2,0,1);
	vuelo.agregarPasajero(pasajero3,1,0);
	vuelo.agregarPasajero(pasajero4,1,1);
	vuelo.agregarPasajero(pasajero5,0,1);
	vuelo.agregarPasajero(pasajero6,0,1);
	

	Boolean valorActual=vuelo.verificacionDelPermisoAvolar();
	assertTrue(valorActual);
	}
	
	@Test
	public void queDeFalseSiLaCantidadDePasajerosEsMenorAlPorcentajeRequeridoParaElDespegue() {
		
		TipoDeVuelo tipo1=TipoDeVuelo.CLASETURISTA;
		TipoDeVuelo tipo2=TipoDeVuelo.PRIMERACLASE;
	    
		DestinoVuelo destino=DestinoVuelo.ALEMANIA;
		
		
		Pasajero pasajero1=new Pasajero("lili","alvez",456123,415936,tipo2,destino);
		Pasajero pasajero2=new Pasajero("lili","alvez",456123,415936,tipo2,destino);
		Pasajero pasajero3=new Pasajero("lili","alvez",456123,415936,tipo2,destino);
		Pasajero pasajero4=new Pasajero("lili","alvez",456123,415936,tipo1,destino);
	
		Vuelo vuelo=new Vuelo(456789,destino);
		
		vuelo.agregarPasajero(pasajero1,0,0);
		vuelo.agregarPasajero(pasajero2,0,1);
		vuelo.agregarPasajero(pasajero3,1,0);
		vuelo.agregarPasajero(pasajero4,1,1);
		
		
		

		Boolean valorActual=vuelo.verificacionDelPermisoAvolar();
		assertFalse(valorActual);
		
	}
	
}
