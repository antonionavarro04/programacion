package excersise5;
import java.util.Scanner;

public class Excersise5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce the Circunference Radius: ");
		double radius = read.nextFloat();
		
		double longitude = Math.PI * (radius * 2);
		double area = Math.PI * (Math.pow(radius, 2));
		
		System.out.println("Longitude is: " + longitude);
		System.out.println("Area is: " + area);
		
		read.close();

	}

}
