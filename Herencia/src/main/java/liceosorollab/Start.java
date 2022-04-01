package main.java.liceosorollab;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
	
	public static ArrayList<Profesor> generarProfesor(ArrayList<Profesor> profesores) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Vamos a rellenar los datos de Profesor:");
		
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduce el apellido");
		String apellido = teclado.nextLine();
		
		System.out.println("Introduce la edad");
		int edad = teclado.nextInt();
		
		System.out.println("Introduce el genero\nH - Hombre\nM-Mujer");
		char genero = teclado.next().charAt(0);
		
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Introduce la asignatura que imparte");
		String asignatura = teclado2.nextLine();

		profesores.add(new Profesor(nombre, apellido, edad, genero, asignatura));
		
		return profesores;
	}
	
	public static ArrayList<Alumno> generarAlumnos(ArrayList<Alumno> alumnos) {
		
		System.out.println("Vamos a añadir 10 alumnos:");
		
		for(int i=0;i<=10;i++) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Introduce el nombre");
			String nombre = teclado.nextLine();
			
			System.out.println("Introduce el apellido");
			String apellido = teclado.nextLine();
			
			System.out.println("Introduce la edad");
			int edad = teclado.nextInt();
			
			System.out.println("Introduce el genero\nH - Hombre\nM-Mujer");
			char genero = teclado.next().charAt(0);
			
			alumnos.add(new Alumno(nombre, apellido, edad, genero));
		}
		
		return alumnos;
	}
	
	public static void corregirExamenes(ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores) {
		
		for(int i=0;i<alumnos.size();i++) {

			for(int j=0;j<profesores.size();j++) {
				alumnos.get(i).setNota(profesores.get(j).corregir());
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Profesor> profesores = new ArrayList<>();
		ArrayList<Alumno> alumnos = new ArrayList<>();
		
		profesores = generarProfesor(profesores);
		alumnos = generarAlumnos(alumnos);
		
		corregirExamenes(alumnos, profesores);
		
		System.out.println(alumnos);
	}

}
