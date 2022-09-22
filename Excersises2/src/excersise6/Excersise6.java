package excersise6;
import java.util.Scanner;

public class Excersise6 {

	public static void main(String[] args) {
		// Variables
		double num1;
		double num2;
		double suma;
		double resta;
		double multiplicacion;
		double division;
		
		// Scanner Start
		Scanner read = new Scanner(System.in);
		
		// Recogida de Datos
		System.out.print("Introduce a number: ");
		num1 = read.nextDouble();
		//
		System.out.print("Introduce another number: ");
		num2 = read.nextDouble();
		
		// Calculos
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		
		// Resultados
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
		
		read.close();
		
		
	}

}
