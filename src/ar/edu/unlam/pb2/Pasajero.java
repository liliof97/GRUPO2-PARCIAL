package ar.edu.unlam.pb2;

public class Pasajero extends Persona {

	private Integer pasaporte; 
	
	
	public Pasajero(String nombre, String apellido, Integer pasaporte) {
		super(nombre, apellido);
		
		this.pasaporte = pasaporte;
		
	}
	
	public Integer comprarBoletoDeAvion() {
		return 0;
	}
	
	

}
