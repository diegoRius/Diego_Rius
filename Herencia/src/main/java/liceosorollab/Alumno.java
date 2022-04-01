package main.java.liceosorollab;

public class Alumno extends Persona{
	
	private float nota;
	
	public Alumno(String nombre, String apellido, int edad, char genero) {
		super(nombre, apellido, edad, genero);	
	}

	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public void dormir() {
		System.out.println("No puedo dormir, mañana hay examen");
	}

	@Override
	public String toString() {
		return "nota=" + nota
				;
	}
	
	
}
