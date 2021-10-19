package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VueloTest {

	@Test
	public void queSePuedaInstanciarUnaAzafataCorrectamente() {
		String nombre="Marta";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		TipoIdioma idioma = TipoIdioma.ALEMAN;
		DestinoVuelo destino = DestinoVuelo.ALEMANIA;
		Boolean disponibilidad = false;
		Integer valorEsperado = 40001002;
		
		Azafata azafata = new Azafata(nombre, apellido, dni, pasaporte, idioma, destino, disponibilidad);
		
		assertEquals(valorEsperado, azafata.getDni());	
	}
	@Test
	public void queSePuedaAgregarUnaAzafataQueHableElOLosIdiomasRequeridosQueVayaAUnDestinoDeterminadoYQueTengaDisponibilidadAUnVuelo() {
		String nombre="Mariana";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		TipoIdioma idioma = TipoIdioma.CHINO;
		DestinoVuelo destino = DestinoVuelo.COREA;
		Boolean disponibilidad = true;
		Integer numeroDeVuelo = 1;
		TipoIdioma idiomaRequeridoUno = TipoIdioma.COREANO;
		TipoIdioma idiomaRequeridoDos= TipoIdioma.CHINO;
		
		Boolean valorEsperado = true;
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo, idiomaRequeridoUno, idiomaRequeridoDos, destino);
		Azafata azafata = new Azafata(nombre, apellido, pasaporte, dni, idioma, destino, disponibilidad);
		
		Boolean valorObtenido = vuelo.agregarAzafata(azafata);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	public void queNoSePuedaAgregarUnaAzafataQueNoHableAlgunIdiomaRequeridoYQueTengaDisponibilidadAUnVuelo() {
		String nombre="Mariana";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		TipoIdioma idioma = TipoIdioma.ALEMAN;
		DestinoVuelo destino = DestinoVuelo.ALEMANIA;
		Boolean disponibilidad = true;
		Integer numeroDeVuelo = 1;
		TipoIdioma idiomaRequeridoUno = TipoIdioma.ESPAÑOL;
		TipoIdioma idiomaRequeridoDos = TipoIdioma.INGLES;
		
		Boolean valorEsperado = false;
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo, idiomaRequeridoUno, idiomaRequeridoDos, destino);
		Azafata azafata = new Azafata(nombre, apellido, pasaporte, dni, idioma, destino, disponibilidad);
		
		Boolean valorObtenido = vuelo.agregarAzafata(azafata);
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	public void queNoSePuedaAgregarUnaAzafataQueHableAlgunIdiomaRequeridoYQueNoTengaDisponibilidadAUnVuelo() {
		String nombre="Mariana";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		TipoIdioma idioma = TipoIdioma.ALEMAN;
		DestinoVuelo destino = DestinoVuelo.ALEMANIA;
		Boolean disponibilidad = false;
		Integer numeroDeVuelo = 1;
		TipoIdioma idiomaRequeridoUno = TipoIdioma.ALEMAN;
		TipoIdioma idiomaRequeridoDos = TipoIdioma.INGLES;
		
		Boolean valorEsperado = false;
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo, idiomaRequeridoUno, idiomaRequeridoDos, destino);
		Azafata azafata = new Azafata(nombre, apellido, pasaporte, dni, idioma, destino, disponibilidad);
		
		Boolean valorObtenido = vuelo.agregarAzafata(azafata);
		assertEquals(valorEsperado, valorObtenido);
		assertFalse(valorObtenido);
	}
	@Test
	public void queNoSePuedaAgregarUnaAzafataQueHableAlgunIdiomaRequeridoQueTengaDisponibilidadYQueVayaAUnDestinoDistintoAUnVuelo() {
		String nombre="Mariana";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		TipoIdioma idiomaAzafata = TipoIdioma.ALEMAN;
		DestinoVuelo destinoAzafata = DestinoVuelo.JAPON;
		DestinoVuelo destino = DestinoVuelo.ALEMANIA;
		Boolean disponibilidad = true;
		Integer numeroDeVuelo = 1;
		TipoIdioma idiomaRequeridoUno = TipoIdioma.ALEMAN;
		TipoIdioma idiomaRequeridoDos = TipoIdioma.ALEMAN;
		
		Boolean valorEsperado = false;
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo, idiomaRequeridoUno, idiomaRequeridoDos, destino);
		Azafata azafata = new Azafata(nombre, apellido, pasaporte, dni, idiomaAzafata, destinoAzafata, disponibilidad);
		
		Boolean valorObtenido = vuelo.agregarAzafata(azafata);
		assertEquals(valorEsperado, valorObtenido);
		assertFalse(valorObtenido);
	}
	@Test
	public void queNoSePuedaAgregarMasAzafatasQueLasPermitidasAUnVuelo() {
		String nombre="Mariana";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		TipoIdioma idiomaAzafata = TipoIdioma.INGLES;
		DestinoVuelo destino = DestinoVuelo.ALEMANIA;
		Boolean disponibilidad = true;
		Integer numeroDeVuelo = 1;
		TipoIdioma idiomaRequeridoUno = TipoIdioma.ALEMAN;
		TipoIdioma idiomaRequeridoDos = TipoIdioma.INGLES;
		
		Boolean valorEsperado = false;
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo, idiomaRequeridoUno, idiomaRequeridoDos, destino);
		Azafata azafata = new Azafata(nombre, apellido, pasaporte, dni, idiomaAzafata, destino, disponibilidad);
		Azafata azafata2 = new Azafata(nombre, apellido, pasaporte, dni, idiomaAzafata, destino, disponibilidad);
		Azafata azafata3 = new Azafata(nombre, apellido, pasaporte, dni, idiomaAzafata, destino, disponibilidad);
		
		Boolean valorObtenido = vuelo.agregarAzafata(azafata);
		valorObtenido = vuelo.agregarAzafata(azafata2);
		valorObtenido = vuelo.agregarAzafata(azafata3);
		
		assertEquals(valorEsperado, valorObtenido);
		assertFalse(valorObtenido);
	}
	@Test
	public void queSePuedaBuscarUnaAzafataQueHableUnIdiomaDeterminado() {
		String nombre="Mariana";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		TipoIdioma idioma = TipoIdioma.ALEMAN;
		DestinoVuelo destino = DestinoVuelo.ALEMANIA;
		Boolean disponibilidad = true;
		Integer numeroDeVuelo = 1;
		TipoIdioma idiomaRequeridoUno = TipoIdioma.ALEMAN;
		TipoIdioma idiomaRequeridoDos = TipoIdioma.INGLES;
		TipoIdioma idiomaAzafata = TipoIdioma.ITALIANO;
		
		Boolean valorEsperado = true;
		Integer cantidadEsperada = 1;
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo, idiomaRequeridoUno, idiomaRequeridoDos, destino);
		Azafata azafata1 = new Azafata(nombre, apellido, pasaporte, dni, idioma, destino, disponibilidad);
		Azafata azafata2 = new Azafata(nombre, apellido, pasaporte, dni, idiomaAzafata, destino, disponibilidad);
	
		vuelo.agregarAzafata(azafata2);
		vuelo.agregarAzafata(azafata1);
		
		Boolean valorObtenido = vuelo.buscarAzafata(idioma);
		
		assertEquals(valorEsperado, valorObtenido);	
		assertEquals(cantidadEsperada, vuelo.getCantidadDeAzafatas());
	}

}
