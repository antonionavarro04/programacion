package excersise4;
import java.util.Scanner;

public class Excersise4 {

	public static void main(String[] args) {
		// declare variables
		int x, y, z;
		final Scanner keyboard = new Scanner(System.in); 
		// enter values
		System.out.print("Enter value for x ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		// code attempting to swap two variables
		z = x;
		x = y;
		y = z;
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		keyboard.close();

	}

}
