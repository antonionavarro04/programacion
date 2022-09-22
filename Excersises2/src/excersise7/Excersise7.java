package excersise7;
import java.util.Scanner;

public class Excersise7 {

	public static void main(String[] args) {
		// Variables
		String name;
		String address;
		int telephone;
		
		// Scanner Start
		Scanner read = new Scanner(System.in);
		
		// Recogida de Datos
		System.out.print("Introduce tu nombre: ");
		name = read.nextLine();
		//
		System.out.print("Introduce tu direccion: ");
		address = read.nextLine();
		//
		System.out.print("Introduce tu numero de telefono: ");
		telephone = read.nextInt();
		
		// Resultado
		System.out.println("Nombre: " + name);
		System.out.println("Direccion: " + address);
		System.out.println("Telefono: " + telephone);
		
		read.close();

	}

}
