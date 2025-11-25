package bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos el primer número
		System.out.print("Introduce el primer número: ");
		int a = sc.nextInt();

		// Pedimos el segundo número
		System.out.print("Introduce el segundo número: ");
		int b = sc.nextInt();

		// Determinamos el mayor de los dos números
		int mayor = (a > b) ? a : b;

		// Inicializamos el mínimo común múltiplo con el mayor
		int mcm = mayor;

		// Recorremos hasta encontrar un múltiplo común
		while (mcm % a != 0 || mcm % b != 0) {
			// Si no es divisible por ambos, aumentamos en 1
			mcm++;
		}

		// Mostramos el resultado
		System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);

		// Cerramos el scanner
		sc.close();
	}
}
