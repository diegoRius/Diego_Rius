package main.java.liceosorollab;

public class Profesor extends Persona{
	
	private String asignaturas;
	
	public Profesor(String nombre, String apellido, int edad, char genero, String asignaturas) {
		super(nombre, apellido, edad, genero);
		this.asignaturas = asignaturas;
	}

	public String getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public float corregir() {
		return (float) Math.random()*10;
	}
	
	@Override
	public String toString() {
		return "asignaturas=" + asignaturas
				;
	}
	
	
	
}
