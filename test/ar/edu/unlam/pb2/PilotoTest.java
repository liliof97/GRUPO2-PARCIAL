package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PilotoTest {

	@Test
    public void queSePuedaVerificarQueUnPilotoTengaDisponibilidadYCumplaConLaCantidadDeHorasMinimasParaSerAgregadoAUnVuelo() {
        String nombre = "Cristian";
        String apellido = "Rodriguez";
        Integer dni = 35666000;
        Integer legajo = 300;
        Boolean disponibilidad = true;
        Integer horasVuelo = 300;
        Boolean valorEsperado = true;

        Personal piloto = new Piloto(nombre, apellido, dni, legajo, disponibilidad, horasVuelo);
        Boolean valorObtenido = piloto.esApto();

        assertEquals(valorEsperado, valorObtenido);
    }

}
