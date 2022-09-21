package excersise8;
import java.util.Scanner;

public class Excersise8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String name = read.next();
		
		System.out.print("Introduce tu edad: ");
		byte age = read.nextByte();
		
		System.out.println("Hola " + name + ", tienes " + age + " años, que mayor eres!");
		
		read.close();

	}

}
