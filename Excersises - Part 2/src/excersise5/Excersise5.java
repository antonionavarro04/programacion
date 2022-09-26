package excersise5;
import java.util.Scanner;

public class Excersise5 {

	public static void main(String[] args) {
		// Variables y Scanner
		double length, height, area, perimeter;
		final Scanner read = new Scanner(System.in);
		
		// Preguntamos a el usuario que introduzca el ancho y el alto
		System.out.print("Introduzca el ancho del Rectangulo: ");
		length = read.nextDouble();
		
		System.out.print("Introduzca el alto del Rectangulo: ");
		height = read.nextDouble();
		
		// Calculamos los datos
		area = length * height;
		perimeter = (length + height) * 2;
		
		// Imprimimos los Datos
		System.out.println("-------------------------------------");
		System.out.println("El area es " + area);
		System.out.println("El perimetro es " + perimeter);
		
		read.close();

	}

}
