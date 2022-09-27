package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Constantes
		
		
		// Variables
		long numero;
		
		// Scanner
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// App
		numero = read.nextLong();
		
		read.close();
		
	}

}
