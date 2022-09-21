package excersise4;
import java.util.Scanner;

public class Excersise4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce the first Mark: ");
		double mark1 = read.nextDouble();
		
		System.out.print("Introduce the second Mark: ");
		double mark2 = read.nextDouble();
		
		double finalmark = (mark1 + mark2) / 2;
		System.out.print(finalmark);
		
		read.close();

	}

}
