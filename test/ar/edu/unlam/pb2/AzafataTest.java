package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AzafataTest {

	@Test
	public void queSePuedaVerificarQueUnaAzafataTengaDisponibilidadParaSerAgregadaAUnVuelo() {
		String nombre = "Luna";
		String apellido = "Perez";
		Integer dni = 35666000;
		Integer legajo = 300;
		TipoIdioma idioma = TipoIdioma.COREANO;
		DestinoVuelo destino = DestinoVuelo.COREA;
		Boolean disponibilidad = false;
		Boolean valorEsperado = false;
		
		//Polimorfismo
		Personal azafata = new Azafata(nombre, apellido, dni, legajo, idioma, destino, disponibilidad);
		
		Boolean valorObtenido = azafata.esApto();
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
