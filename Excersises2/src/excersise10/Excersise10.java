package excersise10;
import java.util.Locale;
import java.util.Scanner;

public class Excersise10 {
	public static void main(String[] args) {
		// Variables
		double price;
		double parteIVA;
		double finalPrice;
		
		// Constantes
		final double IVA = 21;
		
		// Creacion y configuracion del Scanner
		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Introduccion del precio del producto sin IVA
		System.out.print("Precio del Producto sin IVA: ");
		price = read.nextDouble();
		
		// Calculo del IVA
		parteIVA = price * (IVA / 100);
		finalPrice = parteIVA + price;
		
		// Resultado por Consola
		System.out.println("El precio final con el IVA aplicado es: " + Math.round(finalPrice * 100.0) / 100.0 + "€");
		System.out.println("La parte aplicable de IVA es: " + Math.round(parteIVA * 100.0) / 100.0 + "€");
		
		read.close();
	}

}
