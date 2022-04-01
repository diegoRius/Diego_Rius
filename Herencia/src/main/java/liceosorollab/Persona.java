package main.java.liceosorollab;

public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private char genero;
	
	public Persona(String nombre, String apellido, int edad, char genero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	public void dormir() {
		System.out.println("zzzz");
	}
	
	public void comer() {
		System.out.println("mmmm");
	}
	
	public void caminar() {
		System.out.println("pat pat pat");
	}
	
	@Override
	public String toString() {
		return "nombre=" + this.nombre + 
				" apellido=" + this.apellido + 
				" edad=" + this.edad +
				" genero=" + this.genero
				;
	}
	
}
