package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variable para guardar el número introducido
		int num;

		// Contador de números primos encontrados
		int cantidadPrimos = 0;

		// Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos un número positivo
		do {
			System.out.println("Introduce un número positivo: ");
			num = sc.nextInt();
			if (num <= 0) {
				System.out.println("Error. Se deben introducir números positivos.");
			}
		} while (num <= 0);

		// Recorremos todos los números entre 1 y num
		for (int i = 1; i <= num; i++) {

			boolean primo = true; // suponemos que i es primo

			// comprobamos si i tiene algún divisor
			for (int divisor = 2; divisor <= i - 1; divisor++) {
				if (i % divisor == 0) {
					primo = false; // si tiene divisor, no es primo
				}
			}

			// si primo sigue siendo true, entonces i es primo
			if (primo && i > 1) {
				cantidadPrimos++; // aumentamos el contador
			}
		}

		// Mostramos el resultado
		System.out.println("Hay " + cantidadPrimos + " números primos entre 1 y " + num + ".");

		// Cerramos el scanner
		sc.close();
	}
}
