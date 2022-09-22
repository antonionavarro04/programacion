package excersise2;
import java.util.Scanner;

public class Excersise2 {

	public static void main(String[] args) {
		// Variables
		byte age;
		
		// Start Scanner
		Scanner read = new Scanner(System.in);
		
		// Recogida de Datos
		System.out.print("Introduce your Age: ");
		age = read.nextByte();
		
		// Calculos
		age++;
		
		// Resultado
		System.out.println("In the next year you'll have " + age + " years");
		
		read.close();
		

	}

}
