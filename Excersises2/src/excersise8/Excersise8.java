package excersise8;
import java.util.Scanner;

public class Excersise8 {

	public static void main(String[] args) {
		// Variables
		byte age;
		String name;
		
		// Inicializacion del Scanner
		Scanner read = new Scanner(System.in);
		
		// Recogida de Datos
		System.out.print("Introduce tu nombre: ");
		name = read.nextLine();
		
		System.out.print("Introduce tu edad: ");
		age = read.nextByte();
		
		// Resultado
		System.out.println("Hola " + name + ", tienes " + age + " años, que mayor eres!");
		
		read.close();

	}

}
