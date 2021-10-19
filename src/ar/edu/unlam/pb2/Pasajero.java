package ar.edu.unlam.pb2;

public class Pasajero extends Persona {

	private Integer pasaporte;
	private TipoDeVuelo tipo;
	private DestinoVuelo destino;
	

	public Pasajero(String nombre, String apellido, Integer pasaporte, Integer dni, TipoDeVuelo tipo,DestinoVuelo destino) {
		super(nombre, apellido, dni);
		this.pasaporte = pasaporte;
		this.tipo = tipo;
		this.destino=destino;
	}
	
	public DestinoVuelo getDestino() {
		return destino;
	}

	public void setDestino(DestinoVuelo destino) {
		this.destino = destino;
	}

	public Integer comprarBoletoDeAvion() {
		return 0;
	}

	

	public TipoDeVuelo getTipo() {
		return tipo;
	}
	
	
	public void setTipo(TipoDeVuelo tipo) {
		this.tipo = tipo;
	}

	public Integer getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Integer pasaporte) {
		this.pasaporte = pasaporte;
	}
	
	
	
	

}
