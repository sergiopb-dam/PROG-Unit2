package boletinfor;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable para guardar la nota introducida por el usuario
		int nota;
		// Contador de suspensos
		int suspensos = 0;
		// Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle para pedir 5 notas
		for (int contador = 1; contador <= 5; contador++) {
			// Pedimos la nota y validamos que esté entre 0 y 10
			do {
				System.out.print("Introduce una nota: ");
				nota = sc.nextInt();
				if (nota < 0 || nota > 10) {
					System.out.println("Nota no válida. Debe estar entre 0 y 10.");
				}
			} while (nota < 0 || nota > 10);

			// Si la nota es menor que 5, contamos un suspenso
			if (nota < 5) {
				suspensos++;
			}
		}

		// Mostramos si hay algún suspenso o no
		if (suspensos > 0) {
			System.out.println("Hay suspensos.");
		} else {
			System.out.println("No hay suspensos.");
		}

		// Cerramos el scanner
		sc.close();
	}
}
