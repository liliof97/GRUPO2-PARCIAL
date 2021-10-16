package ar.edu.unlam.pb2;

public class Vuelo {

	private Pasajero pasajeros[];
	private Pasajero[][] asientos;
	private Pasajero[][] primeraClase;
	private Pasajero[][] claseTurista;
	private Pasajero[][] claseBusiness;
	private Integer cantPasajerosPrimeraClase;
	private Integer cantPasajerosClaseTurista;
	private Integer cantPasajerosClaseBusiness;

	// Esto puede variar al hacer el test en JUnit
	private final Integer CANT_MAXIMA_PASAJEROS = 100;
	private final Integer CANT_MAXIMA_PASAJEROS_PRIMERA_CLASE = 20;
	private final Integer CANT_MAXIMA_PASAJEROS_CLASE_TURISTA = 20;
	private final Integer CANT_MAXIMA_PASAJEROS_CLASE_BUSINESS = 30;
	private Integer cantidadActualDePasajeros;

	public Vuelo() {
		pasajeros = new Pasajero[CANT_MAXIMA_PASAJEROS];
		this.cantidadActualDePasajeros = 0;
		this.cantPasajerosPrimeraClase=0;
         this.cantPasajerosClaseTurista=0;
		 this.cantPasajerosClaseBusiness=0;
		
	}

	public Boolean agregarPasajero(Pasajero pasajero) {
		Boolean seAgrego = false;

		if (this.cantidadActualDePasajeros < this.pasajeros.length) {
			pasajeros[this.cantidadActualDePasajeros++] = pasajero;
			seAgrego = true;
		}
		return seAgrego;
	}

	public Boolean verificarDisponibilidadDeClase(Pasajero pasajero, TipoDeVuelo tipoDeVuelo, Destino destino) {
		
		switch(tipoDeVuelo){
		case PRIMERACLASE:
		
			
			
			break;
        case CLASEBUSINESS:
			
			break;
          case CLASETURISTA:
	
	    break;
			
			
		}

	return null;

}

}
