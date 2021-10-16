package ar.edu.unlam.pb2;

public class Vuelo {

	private Pasajero pasajeros[];
	//Esto puede variar al hacer el test en JUnit
	private final Integer CANT_MAXIMA_PASAJEROS = 100;
	private Integer cantidadActualDePasajeros;
	
	public Vuelo() {
		pasajeros = new Pasajero[CANT_MAXIMA_PASAJEROS];
		this.cantidadActualDePasajeros = 0;
	}
	
	public Boolean agregarPasajero(Pasajero pasajero) {
		Boolean seAgrego= false;
		
		if(this.cantidadActualDePasajeros<this.pasajeros.length) {
			pasajeros[this.cantidadActualDePasajeros++] = pasajero;
			seAgrego=true;
		}
		return seAgrego;
	}
	
}

