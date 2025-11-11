package boletinfor;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Variables para guardar los números introducidos
		int numA, numB;

		// Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos el número A
		System.out.print("Introduce el número A: ");
		numA = sc.nextInt();

		// Pedimos el número B
		System.out.print("Introduce el número B: ");
		numB = sc.nextInt();

		// Si A es menor que B, mostramos los números de A hasta B
		if (numA < numB) {
			for (int contador = numA; contador <= numB; contador++) {
				System.out.print(contador + " ");
			}
		}
		// Si A es mayor que B, mostramos los números de B hasta A
		else if (numA > numB) {
			for (int contador = numB; contador <= numA; contador++) {
				System.out.print(contador + " ");
			}
		}
		// Si A y B son iguales, avisamos al usuario
		else {
			System.out.println("Los números introducidos son iguales.");
		}

		// Cerramos el scanner
		sc.close();
	}
}
