package ar.edu.unlam.pb2;

public class Vuelo {

	private Azafata azafatas[];
	private final Integer CANTIDAD_MAX_AZAFATAS = 2;
	private Integer cantidadActualDeAzafatas;
	
	private Piloto pilotos[];
	private final Integer CANTIDAD_MAX_PILOTOS = 3;
	private Integer cantidadActualDePilotos;
	
	private Pasajero pasajeros[];
	private final Integer CANT_MAXIMA_PASAJEROS = 100;
	private Integer cantidadActualDePasajeros;
	
	private Integer numeroDeVuelo;
	private TipoIdioma idiomaRequeridoUno;
	private TipoIdioma idiomaRequeridoDos;
	private DestinoVuelo destino;
	
	private Integer cantidadDeAzafatas;
	
	public Vuelo(Integer numeroDeVuelo, TipoIdioma idiomaRequeridoUno, TipoIdioma idiomaRequeridoDos, DestinoVuelo destino) {
		pasajeros = new Pasajero[CANT_MAXIMA_PASAJEROS];
		this.cantidadActualDePasajeros = 0;
		this.numeroDeVuelo=numeroDeVuelo;
		azafatas = new Azafata[CANTIDAD_MAX_AZAFATAS];
		this.cantidadActualDeAzafatas = 0;
		pilotos = new Piloto[CANTIDAD_MAX_PILOTOS];
		this.cantidadActualDeAzafatas = 0;
		
		this.idiomaRequeridoUno = idiomaRequeridoUno;
		this.idiomaRequeridoDos = idiomaRequeridoDos;
		this.destino = destino;
		
		this.cantidadDeAzafatas = 0;
	}
	
	public Boolean agregarPasajero(Pasajero pasajero) {
		Boolean seAgrego= false;
		if(this.cantidadActualDePasajeros<this.pasajeros.length) {
			pasajeros[this.cantidadActualDePasajeros++] = pasajero;
			seAgrego=true;
		}
		return seAgrego;
	}

	public Boolean agregarPiloto(Piloto piloto) {
		Boolean seAgregoPiloto = false;
			if(piloto.esApto() && this.cantidadActualDePilotos<this.pilotos.length) {
				pilotos[this.cantidadActualDePilotos++] = piloto;
				seAgregoPiloto = true;
			}
		return seAgregoPiloto;
	}
	
	public Boolean agregarAzafata(Azafata azafata) {
		Boolean seAgrego= false;
		
		if(azafata.esApto() && this.cantidadActualDeAzafatas<this.azafatas.length) {
			if(azafata.getDestino().equals(this.destino) && (azafata.getIdioma().equals(this.idiomaRequeridoUno) || azafata.getIdioma().equals(this.idiomaRequeridoDos))){
				azafatas[this.cantidadActualDeAzafatas++] = azafata;
				seAgrego=true;
			}
		}	
		return seAgrego;
	}
	
	public Boolean buscarAzafata(TipoIdioma idioma) {
		Boolean seEncontro = false;
		for(int i=0;i<this.cantidadActualDeAzafatas;i++) {
			if(azafatas[i].getIdioma().equals(idioma)) {
				seEncontro = true;
				cantidadDeAzafatas++;
			}
		}
		return seEncontro;
	}
	
	public Integer getCantidadDeAzafatas() {
		return cantidadDeAzafatas;
	}

	public void setCantidadDeAzafatas(Integer cantidadDeAzafatas) {
		this.cantidadDeAzafatas = cantidadDeAzafatas;
	}

	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}

	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}

	public TipoIdioma getIdiomaRequeridoUno() {
		return idiomaRequeridoUno;
	}

	public void setIdiomaRequeridoUno(TipoIdioma idiomaRequeridoUno) {
		this.idiomaRequeridoUno = idiomaRequeridoUno;
	}

	public TipoIdioma getIdiomaRequeridoDos() {
		return idiomaRequeridoDos;
	}

	public void setIdiomaRequeridoDos(TipoIdioma idiomaRequeridoDos) {
		this.idiomaRequeridoDos = idiomaRequeridoDos;
	}

	public DestinoVuelo getDestino() {
		return destino;
	}

	public void setDestino(DestinoVuelo destino) {
		this.destino = destino;
	}
	
}

