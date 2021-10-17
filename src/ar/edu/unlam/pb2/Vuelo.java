package ar.edu.unlam.pb2;

public class Vuelo {

	private Pasajero pasajeros[];
	//Esto puede variar al hacer el test en JUnit
	private final Integer CANT_MAXIMA_PASAJEROS = 3;
	private Integer cantidadActualDePasajeros;
	private Integer numeroDeVuelo;
	
	public Vuelo(Integer numeroDeVuelo) {
		pasajeros = new Pasajero[CANT_MAXIMA_PASAJEROS];
		this.cantidadActualDePasajeros = 0;
		this.numeroDeVuelo=numeroDeVuelo;
	}
	
	public Boolean agregarPasajero(Pasajero pasajero) {
		Boolean seAgrego= false;
		
		if(this.cantidadActualDePasajeros<this.pasajeros.length) {
			pasajeros[this.cantidadActualDePasajeros++] = pasajero;
			seAgrego=true;
		}
		return seAgrego;
	}

	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}

	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}
	
	
}

