package switchex;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número del 1 al 7: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("Es lunes.");
			break;
		case 2:
			System.out.println("Es martes.");
			break;
		case 3:
			System.out.println("Es miércoles.");
			break;
		case 4:
			System.out.println("Es jueves.");
			break;
		case 5:
			System.out.println("Es viernes.");
			break;
		case 6:
			System.out.println("Es sábado.");
			break;
		case 7:
			System.out.println("Es domingo.");
			break;
		default:
			System.out.println("No es un día válido (debe ser entre 1 y 7).");
		}

		sc.close();
	}
}
