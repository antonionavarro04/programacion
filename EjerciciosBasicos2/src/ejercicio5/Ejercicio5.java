package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables
		int nota1, nota2, nota3;
		float notaMedia;

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
		notaMedia = (nota1 + nota2 + nota3) / 3.0f;
		
		// Resultados
		System.out.println();System.out.println("==============================");System.out.println();
		
		System.out.println("La nota media fue de: " + notaMedia);
		System.out.println("La nota media en el boletin es de: " + (byte) notaMedia);

		read.close();

	}

}
