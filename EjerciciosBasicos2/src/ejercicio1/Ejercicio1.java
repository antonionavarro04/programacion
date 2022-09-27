package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Constantes
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		
		// Variables
		double manzanas;
		double peras;
		double beneficio;
		
		// Scanner
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// App
		System.out.print("Cuantos kilos de Manzanas se ha vendido?: ");
		manzanas = read.nextDouble();
		
		System.out.print("Cuantos kilos de Peras se ha vendido?: ");
		peras = read.nextDouble();
		
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println();
		
		// Calculos
		peras *= PRECIO_PERAS;
		manzanas *= PRECIO_MANZANAS;
		
		beneficio = peras + manzanas;
		
		// Resultados		
		System.out.println("El beneficio total es de: " + Math.round(beneficio * 100.0) / 100.0 + "€");
		System.out.println("El beneficio de las manzanas fue de: " + Math.round(manzanas * 100.0) / 100.0 + "€");
		System.out.println("El beneficio de las peras fue de: " + Math.round(peras * 100.0) / 100.0 + "€");
		
		// Cerramos el Scanner
		read.close();

	}

}
