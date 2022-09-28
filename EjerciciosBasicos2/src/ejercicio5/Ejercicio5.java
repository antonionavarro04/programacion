package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables
		byte nota1, nota2, nota3;
		
		float notamedia;

		// Scanner
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		

		// App
		System.out.print("Introduce la nota del Primer Trimestre: ");
		nota1 = read.nextByte();

		System.out.print("Introduce la nota del Segundo Trimestre: ");
		nota2 = read.nextByte();

		System.out.print("Introduce la nota del Tercer Trimestre: ");
		nota3 = read.nextByte();

		// Calculos
		notamedia = (nota1 + nota2 + nota3) / 3.0f;
		
		System.out.println(notamedia);

		read.close();

	}

}
