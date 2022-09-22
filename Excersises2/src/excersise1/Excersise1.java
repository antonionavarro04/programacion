package excersise1;
import java.util.Scanner;

public class Excersise1 {

	public static void main(String[] args) {
		// Variables
		int num1;
		
		// Scanner Start
		Scanner read = new Scanner(System.in);
		
		// Recogida de Datos
		System.out.print("Introduce a number: ");
		num1 = read.nextInt();
		
		// Resultados
		System.out.print("Your number is: " + num1);
		
		read.close();
		

	}

}
