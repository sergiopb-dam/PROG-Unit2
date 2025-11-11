package boletinfor;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variable para guardar el número introducido
		int num;
		// Variable para indicar si el número es primo (inicialmente true)
		boolean primo = true;

		// Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Con un dowhile controlamos que el número introducido no sea ni 0 ni negativo
		do {
			System.out.println("Introduce un número positivo para saber si es primo: ");
			num = sc.nextInt();
			if (num <= 0) {
				System.out.println("Error. Se deben introducir números positivos.");
			}
		} while (num <= 0);

		// Comprobamos si hay algún divisor entre 2 y num-1
		for (int contador = 2; contador < num; contador++) {
			if (num % contador == 0) {
				// Si encontramos un divisor, el número no es primo
				primo = false;
			}
		}

		// Mostramos el resultado
		if (primo) {
			System.out.println("El número " + num + " es primo.");
		} else {
			System.out.println("El número " + num + " no es primo.");
		}

		// Cerramos el scanner
		sc.close();
	}

}
