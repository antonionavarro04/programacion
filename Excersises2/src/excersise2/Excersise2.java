package excersise2;
import java.util.Scanner;

public class Excersise2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce your Age: ");
		int age = read.nextInt();
		
		int agenextyear = age + 1;
		
		System.out.println("In the next year you'll have " + agenextyear + " years");
		read.close();
		

	}

}
