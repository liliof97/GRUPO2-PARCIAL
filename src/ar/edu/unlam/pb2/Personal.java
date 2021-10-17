package ar.edu.unlam.pb2;

public class Personal extends Persona{

	private Integer legajo;
	
	public Personal(String nombre, String apellido, Integer dni, Integer legajo) {
		super(nombre, apellido, dni);
		this.legajo = legajo;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

}
