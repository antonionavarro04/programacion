package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Constantes
		
		
		// Variables
		long numero;
		
		boolean rec;
		
		// Scanner
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// App
		System.out.print("Indtroduce un numero: ");
		numero = read.nextLong();
		
		// Calc
		numero %= 2;
		
		rec = numero == 0 ? true : false;
		
		// Resultado
		System.out.println("Es el numero par?");
		System.out.println(rec);
		
		
		read.close();
		
	}

}
