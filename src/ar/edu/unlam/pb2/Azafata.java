package ar.edu.unlam.pb2;

public class Azafata extends Personal{
	
	private TipoIdioma idioma;
	private DestinoVuelo destino;
	//origen

	public Azafata(String nombre, String apellido, Integer dni, Integer legajo, TipoIdioma idioma, DestinoVuelo destino, Boolean disponibilidad) {
		super(nombre, apellido, dni, legajo, disponibilidad);
		
		this.idioma = idioma;
		this.destino = destino;
	}
	
	public Boolean esApto() {
		Boolean resultado = false;
		if(this.getDisponibilidad()) {
			resultado = true;
		}
		return resultado;
	}
	
	public TipoIdioma getIdioma() {
		return idioma;
	}

	public void setIdioma(TipoIdioma idioma) {
		this.idioma = idioma;
	}

	public DestinoVuelo getDestino() {
		return destino;
	}

	public void setDestino(DestinoVuelo destino) {
		this.destino = destino;
	}
}
