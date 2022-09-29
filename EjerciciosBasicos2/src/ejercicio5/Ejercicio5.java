package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaramos las variables para las 3 notas así como para la notaMedia que va a ser calculada.
		int nota1, nota2, nota3;
		float notaMedia;

		// Declaramos la variable read la caul va a contener el Scanner, tambien vamos a cambiarle
		// la localizacion al Scanner de ES a US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		

		// Pedimos que el usuario introduzca las 3 notas y las guardamos en las variables correspondientes
		System.out.print("Introduce la nota del Primer Trimestre: ");
		nota1 = read.nextByte();

		System.out.print("Introduce la nota del Segundo Trimestre: ");
		nota2 = read.nextByte();

		System.out.print("Introduce la nota del Tercer Trimestre: ");
		nota3 = read.nextByte();

		// Calculamos la nota media en base a las 3 notas que han sido proporcionadas
		notaMedia = (nota1 + nota2 + nota3) / 3.0f;
		
		// Imprimimos los resultados por consola
		System.out.println();System.out.println("==============================");System.out.println();
		
		System.out.println("La nota media fue de: " + notaMedia);
		System.out.println("La nota media en el boletin es de: " + (byte) notaMedia);  // Con (byte) hacemos que la nota pase a ser un numero entero

		read.close();

	}

}
