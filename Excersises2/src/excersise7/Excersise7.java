package excersise7;
import java.util.Scanner;

public class Excersise7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String name = read.next();
		
		System.out.print("Introduce tu direccion: ");
		String address = read.next();
		
		System.out.print("Introduce tu numero de telefono: ");
		int telephone = read.nextInt();
		
		System.out.println("Nombre: " + name);
		System.out.println("Direccion: " + address);
		System.out.println("Telefono: " + telephone);
		
		read.close();

	}

}
