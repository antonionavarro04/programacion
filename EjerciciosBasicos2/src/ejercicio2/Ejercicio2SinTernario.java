package ejercicio2;

import java.util.Scanner;

public class Ejercicio2SinTernario {

	public static void main(String[] args) {
		// Variables
		byte age;
		boolean rec;
		String printer;
		
		// Scanner
		final Scanner read = new Scanner(System.in);
		
		// App
		System.out.print("Introduce tu edad: ");
		age = read.nextByte();
		
		// Calculos
		rec = age >= 18;
		printer = rec == true ? "Eres mayor de Edad" : "Eres menor de Edad";
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		//Resultados
		System.out.println(rec);
		System.out.println(printer);
		
		
		read.close();
		

	}

}
