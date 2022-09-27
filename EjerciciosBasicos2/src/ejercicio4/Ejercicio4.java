package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Constantes
		
		
		// Variables
		boolean lluvia, tareas, biblioteca, salir;
		
		String printer;
		
		// Scanner
		final Scanner read = new Scanner(System.in);
		
		// App
		System.out.print("Esta Lloviendo (True or False): ");
		lluvia = read.nextBoolean();
		
		System.out.print("Hiciste la Tarea (True or False): ");
		tareas = read.nextBoolean();
		
		System.out.print("Tenes que ir a la Biblioteca (True or False): ");
		biblioteca = read.nextBoolean();
		
		// Calculos
		salir = lluvia == false && tareas == true || biblioteca == true;
		printer = salir == true ? "Si" : "No";
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		
		System.out.println(printer + " puedes salir.");
		
		
		read.close();

	}

}
