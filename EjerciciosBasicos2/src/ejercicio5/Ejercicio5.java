package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public void main (String[] args) {
		// Variables
		byte nota1, nota2, nota3;
		
		// Scanner
		final Scanner read = new Scanner(System.in);
		
		// App
		System.out.print("Introduce la nota del Primer Trimestre");
		nota1 = read.nextByte();
		
		System.out.print("Introduce la nota del Segundo Trimestre");
		nota2 = read.nextByte();
		
		System.out.print("Introduce la nota del Tercer Trimestre");
		nota3 = read.nextByte();
		
		System.out.println(nota1 + nota2 + nota3);
		
		read.close();
		
	}

}
