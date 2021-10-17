package ar.edu.unlam.pb2;

public class Vuelo {
	
	private DestinoVuelo destino;
	private Integer valorDestino = 0;
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
	
	public DestinoVuelo getDestino() {
		return destino;
	}
	
	public void setDestino(DestinoVuelo destino) {
		this.destino = destino;
	}
	
	public String verificarPrecioDestino(DestinoVuelo destino) {
		switch(destino) {
		case ITALIA:
			valorDestino = 3400;
			break;
		case FRANCIA:
			valorDestino = 3500;
			break;
		case ALEMANIA:
			valorDestino = 3100;
			break;
		case ESPAÑA:
			valorDestino = 3200;
			break;
		case RUSIA:
			valorDestino = 4000;
			break;
		case INGLATERRA:
			valorDestino = 4500;
			break;
		case NORUEGA:
			valorDestino = 4700;
			break;
		case CHINA:
			valorDestino = 6000;
			break;
		case JAPON:
			valorDestino = 8000;
			break;
		case COREA:
			valorDestino = 2500;
			break;
		}
		return "El valor de su destino es de " + valorDestino;		
	}
	
	public String verificarDestino(DestinoVuelo destino) {
		switch(destino) {
		case ITALIA:
			destino = DestinoVuelo.ITALIA;
			break;
		case FRANCIA:
			destino = DestinoVuelo.FRANCIA;
			break;
		case ALEMANIA:
			destino = DestinoVuelo.ALEMANIA;
			break;
		case ESPAÑA:
			destino = DestinoVuelo.ESPAÑA;
			break;
		case RUSIA:
			destino = DestinoVuelo.RUSIA;
			break;
		case INGLATERRA:
			destino = DestinoVuelo.INGLATERRA;
			break;
		case NORUEGA:
			destino = DestinoVuelo.NORUEGA;
			break;
		case CHINA:
			destino = DestinoVuelo.CHINA;
			break;
		case JAPON:
			destino = DestinoVuelo.JAPON;
			break;
		case COREA:
			destino = DestinoVuelo.COREA;
			break;
		}
		return "El destino de su vuelo es " + destino;		
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
