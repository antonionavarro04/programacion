package excersise3;
import java.util.Scanner;

public class Excersise3 {

	public static void main(String[] args) {
		// Variables
		int actualyear;
		int birthage;
		int age;
		
		// Scanner Start
		Scanner read = new Scanner(System.in);
		
		// Recogida de Datos
		System.out.print("Introduce the actual year: ");
		actualyear = read.nextInt();
		
		System.out.print("Introduce your age of birth: ");
		birthage = read.nextInt();
		
		// Calculos
		age = (actualyear - birthage);
		
		// Resultados
		System.out.println("You are "+ age + "years old");
		
		read.close();

	}

}
