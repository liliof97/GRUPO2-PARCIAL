package ar.edu.unlam.pb2;

public abstract class Personal extends Persona{
	 
    private Integer legajo;
    private Boolean disponibilidad = true;

    public Personal(String nombre, String apellido, Integer dni, Integer legajo, Boolean disponibilidad) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.disponibilidad = disponibilidad;
    }

    public abstract Boolean esApto();

    public Integer getLegajo() {
        return legajo;
    }
 
    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
 
    public Boolean getDisponibilidad() {
        return disponibilidad;
    }
 
    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
 
}
