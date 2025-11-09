package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Preparamos el Scanner para leer lo que el usuario escriba
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número
		System.out.print("Introduce el número deseado: ");
		int num = sc.nextInt();

		// Comprobamos cuántas cifras tiene el número
		if (num < 10) {
			// Si es menor que 10, tiene una cifra
			System.out.println("El número es de una cifra");
		} else if (num < 100) {
			// Si es menor que 100, tiene dos cifras
			System.out.println("El número es de dos cifras");
		} else if (num < 1000) {
			// Si es menor que 1000, tiene tres cifras
			System.out.println("El número es de tres cifras");
		} else if (num < 10000) {
			// Si es menor que 10000, tiene cuatro cifras
			System.out.println("El número es de cuatro cifras");
		} else if (num < 100000) {
			// Si es menor que 100000, tiene cinco cifras
			System.out.println("El número es de cinco cifras");
		} else {
			// Si no cumple ninguna de las anteriores, tiene más de cinco cifras
			System.out.println("El número tiene más de cinco cifras");
		}

		// Cerramos el Scanner
		sc.close();
	}
}
