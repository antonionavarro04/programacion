package excersise5;
import java.util.Scanner;

public class Excersise5 {

	public static void main(String[] args) {
		// Variables
		double radius;
		double longitude;
		double area;
		
		// Scanner Start
		Scanner read = new Scanner(System.in);
		
		// Recogida de Datos
		System.out.print("Introduce the Circunference Radius: ");
		radius = read.nextFloat();
		
		// Calculos
		longitude = Math.PI * (radius * 2);
		area = Math.PI * (Math.pow(radius, 2));
		
		// Resultados
		System.out.println("Longitude is: " + longitude);
		System.out.println("Area is: " + area);
		
		read.close();

	}

}
