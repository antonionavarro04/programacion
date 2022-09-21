package excersise3;
import java.util.Scanner;

public class Excersise3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce the actual year: ");
		int actualyear = read.nextInt();
		
		System.out.print("Introduce your age of birth: ");
		int birthage = read.nextInt();
		
		int age = (actualyear - birthage);
		System.out.println("You are "+ age + "yo");
		
		read.close();

	}

}
