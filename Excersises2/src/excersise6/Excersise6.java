package excersise6;
import java.util.Scanner;

public class Excersise6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce a number: ");
		double num1 = read.nextDouble();
		
		System.out.print("Introduce another number: ");
		double num2 = read.nextDouble();
		
		double suma = num1 + num2;
		double resta = num1 - num2;
		double multiplicacion = num1 * num2;
		double division = num1 / num2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
		
		read.close();
		
		
	}

}
