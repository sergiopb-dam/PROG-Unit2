package bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos el primer número
		System.out.print("Introduce el primer número: ");
		int a = sc.nextInt();

		// Pedimos el segundo número
		System.out.print("Introduce el segundo número: ");
		int b = sc.nextInt();

		// Inicializamos el máximo común divisor
		int mcd = 1;

		// Determinamos el menor de los dos números
		int menor = (a < b) ? a : b;

		// Recorremos desde 1 hasta el menor número
		for (int i = 1; i <= menor; i++) {
			// Si i divide a ambos números, lo guardamos como posible MCD
			if (a % i == 0 && b % i == 0) {
				mcd = i; // siempre se guardará el mayor hasta ese punto
			}
		}

		// Mostramos el resultado
		System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);

		// Cerramos el scanner
		sc.close();
	}
}
