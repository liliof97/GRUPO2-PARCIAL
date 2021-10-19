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
		if (pasajero.getDestino() == this.destino) {
			return destinoCorrecto = true;

		}
		return destinoCorrecto;

	}
	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}

	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}

	
	
	public Integer verificarPrecioDestino(Pasajero pasajero) {
		Integer valorDestino=0;
		switch(pasajero.getDestino()) {
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
		return valorDestino;		
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
	

	public Integer precioTipoVuelo(Pasajero pasajero) {
		Integer precioTipoVuelo = 0;
		switch (pasajero.getTipo()) {
		case PRIMERACLASE:
			precioTipoVuelo = 10000;
			break;
		case CLASEBUSINESS:
			precioTipoVuelo = 5000;
			break;
		case CLASETURISTA:
			precioTipoVuelo = 2500;
			break;
		default:
			break;
		}
		return precioTipoVuelo;
	}

	public Integer precioPasaje(Pasajero pasajero) {
	Integer precioPasaje=precioTipoVuelo(pasajero)+verificarPrecioDestino(pasajero);
	return precioPasaje;
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
