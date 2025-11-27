package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable para el número
		int num;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.print("Introduzca un número entero entre 0 y 20: ");
		num = sc.nextInt();

		// El valor debe estar entre 0 y 20, sino imprime un mensaje de que el valor
		// introducido no es válido
		if (num > 0 && num <= 20) {
			// Bucle de la columna de números
			for (int i = 1; i <= num; i++) {
				// Bucle de la fila de números
				for (int j = i; j != 0; j--) {
					System.out.print(i);
				}
				System.out.println();
			}
		} else {
			System.out.println("El valor introducido no es válido.");
		}

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
