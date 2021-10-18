package ar.edu.unlam.pb2;

public class Piloto extends Personal{
	
	private Integer cantidadHorasDeVuelo;
	private final Integer CANT_HS_MIN_REQUERIDAS = 200;

	public Piloto(String nombre, String apellido, Integer dni, Integer legajo, Boolean disponibilidad, Integer cantidadHorasDeVuelo) {
		super(nombre, apellido, dni, legajo, disponibilidad);
		
		this.cantidadHorasDeVuelo = cantidadHorasDeVuelo;
	}
	
	public Boolean esApto() {
		Boolean resultado = false;
		if(this.cantidadHorasDeVuelo > this.CANT_HS_MIN_REQUERIDAS && this.getDisponibilidad()) {
			resultado = true;
		}
		return resultado;
	}
	
	public Integer getCantidadHorasDeVuelo() {
		return cantidadHorasDeVuelo;
	}

	public void setCantidadHorasDeVuelo(Integer cantidadHorasDeVuelo) {
		this.cantidadHorasDeVuelo = cantidadHorasDeVuelo;
	}

}
