package excersise9;
import java.util.Scanner;

public class Excersise9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce el valor en pesetas: ");
		double pesetas = read.nextFloat();
		
		double euros = pesetas / 166.386;
		
		System.out.println(pesetas + "pts son " + Math.round(euros * 100.0) / 100.0 + "€");
		System.out.println("Valor sin redondear: " + euros + "€");
		
		read.close();

	}

}
