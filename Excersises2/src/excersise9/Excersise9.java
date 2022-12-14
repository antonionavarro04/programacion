package excersise9;
import java.util.Scanner;

public class Excersise9 {

	public static void main(String[] args) {
		// Variables
		double pesetas;
		double euros;
		
		// Constantes
		final float CAMBIO_A_PESETAS = 166.386f;
		
		// Inicializacion del Scanner
		Scanner read = new Scanner(System.in);
		
		// Recogida de Datos
		System.out.print("Introduce el valor en pesetas: ");
		pesetas = read.nextFloat();
		
		// Calculo
		euros = pesetas / CAMBIO_A_PESETAS;
		
		// Resultado
		System.out.println(pesetas + "pts son " + Math.round(euros * 100.0) / 100.0 + "€");
		System.out.println("Valor sin redondear: " + euros + "€");
		
		read.close();

	}

}
