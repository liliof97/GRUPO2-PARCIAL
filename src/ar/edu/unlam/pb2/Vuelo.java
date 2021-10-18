package ar.edu.unlam.pb2;

public class Vuelo {

	private Pasajero[][] primeraClase;
	private Pasajero[][] claseTurista;
	private Pasajero[][] claseBusiness;
	private Integer cantPasajerosPrimeraClase;
	private Integer cantPasajerosClaseTurista;
	private Integer cantPasajerosClaseBusiness;
	private final Integer CANT_MAXIMA_PASAJEROS = 12;
	private final Integer CANT_MAXIMA_PASAJEROS_PRIMERA_CLASE = 4;
	private final Integer CANT_MAXIMA_PASAJEROS_CLASE_TURISTA = 4;
	private final Integer CANT_MAXIMA_PASAJEROS_CLASE_BUSINESS = 4;
	private final Double PORCENTAJE_DE_PERMISO_DE_DESPEGUE=0.50;

	private Integer numeroDeVuelo;
	private DestinoVuelo destino;

	public Vuelo(Integer numeroDeVuelo, DestinoVuelo destino) {
		this.numeroDeVuelo = numeroDeVuelo;
		this.destino = destino;

		this.cantPasajerosPrimeraClase = 0;
		this.cantPasajerosClaseTurista = 0;
		this.cantPasajerosClaseBusiness = 0;
		this.primeraClase = new Pasajero[2][2];
		this.claseBusiness = new Pasajero[2][2];
		this.claseTurista = new Pasajero[2][2];

	}

	public Boolean verificarDestino(Pasajero pasajero) {
		Boolean destinoCorrecto = false;
		if (pasajero.getdestino() == this.destino) {
			return destinoCorrecto = true;

		}
		return destinoCorrecto;

	}

	public Boolean agregarPasajero(Pasajero pasajero, Integer fila, Integer columna) {
		Boolean disponibilidad = false;
		switch (pasajero.getTipo()) {
		case PRIMERACLASE:
			if (this.cantPasajerosPrimeraClase <= this.CANT_MAXIMA_PASAJEROS_PRIMERA_CLASE
					&& this.primeraClase[fila][columna] == null && verificarDestino(pasajero)) {
				this.primeraClase[fila][columna] = pasajero;
				cantPasajerosPrimeraClase++;
				disponibilidad = true;
			}

			break;
		case CLASEBUSINESS:

			if (this.cantPasajerosClaseBusiness <= this.CANT_MAXIMA_PASAJEROS_CLASE_BUSINESS
					&& this.claseBusiness[fila][columna] == null && verificarDestino(pasajero)) {
				this.claseBusiness[fila][columna] = pasajero;
				this.cantPasajerosClaseBusiness++;
				disponibilidad = true;
			}
			break;
		case CLASETURISTA:
			if (this.cantPasajerosClaseTurista <= this.CANT_MAXIMA_PASAJEROS_CLASE_TURISTA
					&& this.claseTurista[fila][columna] == null && verificarDestino(pasajero)) {
				this.claseTurista[fila][columna] = pasajero;
				this.cantPasajerosClaseTurista++;
				disponibilidad = true;
			}
			break;

		}

		return disponibilidad;

	}

	public Boolean verificacionDelPermisoAvolar() {
		Boolean permitidoVolar = false;
		Integer cantidadActualDePasajeros = 0;
		Integer pasajerosRequeridosParaElDespegue = 0;
		cantidadActualDePasajeros = (this.cantPasajerosClaseBusiness + this.cantPasajerosPrimeraClase
				+ this.cantPasajerosClaseTurista);
		pasajerosRequeridosParaElDespegue = (int) (this.CANT_MAXIMA_PASAJEROS * this.PORCENTAJE_DE_PERMISO_DE_DESPEGUE);
		if (cantidadActualDePasajeros >= pasajerosRequeridosParaElDespegue) {
			permitidoVolar = true;
		}
		return permitidoVolar;

	}
}
