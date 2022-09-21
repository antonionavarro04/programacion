package excersise10;
import java.util.Scanner;

public class Excersise10 {
	public static void main(String[] args) {
		double IVA = 21;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Precio del Producto sin IVA: ");
		double price = read.nextDouble();
		
		double parteIVA = price * (IVA / 100);
		double finalPrice = parteIVA + price;
		
		System.out.print("El precio final con el IVA aplicado es: " + Math.round(finalPrice * 100.0) / 100.0 + "€");
		
		read.close();
	}

}
