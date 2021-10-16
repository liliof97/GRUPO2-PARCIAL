package ar.edu.unlam.pb2;

public class Avion {
	
	private String fabricante;
	private Integer numero;
	private String modelo;
	private Integer capacidad;
	
	
	public Avion(String fabricante, Integer numero, String modelo, Integer capacidad) {
	
		this.fabricante = fabricante;
		this.numero = numero;
		this.modelo = modelo;
		this.capacidad = capacidad;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Integer getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	
	
	

}
