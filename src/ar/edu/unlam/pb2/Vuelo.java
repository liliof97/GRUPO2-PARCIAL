package ar.edu.unlam.pb2;

public class Vuelo {

	private Pasajero pasajeros[];
	// Esto puede variar al hacer el test en JUnit
	private final Integer CANT_MAXIMA_PASAJEROS = 3;
	private Integer cantidadActualDePasajeros;
	private Integer numeroDeVuelo;

	private Pasajero turista[][];
	private Pasajero primeraClase[][];
	private Pasajero claseBusiness[][];

	public Vuelo(Integer numeroDeVuelo) {
		pasajeros = new Pasajero[CANT_MAXIMA_PASAJEROS];
		this.cantidadActualDePasajeros = 0;
		this.numeroDeVuelo = numeroDeVuelo;
	}

	public Boolean agregarPasajero(Pasajero pasajero) {
		Boolean seAgrego = false;

		if (this.cantidadActualDePasajeros < this.pasajeros.length) {
			pasajeros[this.cantidadActualDePasajeros++] = pasajero;
			seAgrego = true;
		}
		return seAgrego;
	}

	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}

	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}

	public Integer precioPasaje(Pasajero pasajero) {
		Integer precioDelPasaje = 0;
		switch (pasajero.getTipo()) {
		case PRIMERACLASE:
			precioDelPasaje = 10000;
			break;
		case CLASEBUSINESS:
			precioDelPasaje = 5000;
			break;
		case CLASETURISTA:
			precioDelPasaje = 2500;
			break;
		default:
			break;
		}
		return precioDelPasaje;
	}

}
