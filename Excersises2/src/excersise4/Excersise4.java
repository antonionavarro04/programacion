package excersise4;
import java.util.Scanner;

public class Excersise4 {

	public static void main(String[] args) {
		// Variables
		double mark1;
		double mark2;
		double finalmark;
		
		// Start Scanner
		Scanner read = new Scanner(System.in);
		
		// Recogida de datos
		System.out.print("Introduce the first Mark: ");
		mark1 = read.nextDouble();
		//
		System.out.print("Introduce the second Mark: ");
		mark2 = read.nextDouble();
		
		// Calculos
		finalmark = (mark1 + mark2) / 2;
		
		// Resultados
		System.out.print(finalmark);
		
		read.close();

	}

}
