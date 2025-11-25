package bucles;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ultimoValido = 0; // Último número válido introducido
		int totalIntroducidos = 0; // Contador de números válidos
		int totalFallados = 0; // Contador de números rechazados
		boolean primerNumero = true; // Para aceptar siempre el primer número

		int numero;

		System.out.print("Introduce un número: ");
		numero = sc.nextInt();

		while (numero >= ultimoValido) {

			if (primerNumero) {
				// El primer número siempre se acepta
				ultimoValido = numero;
				totalIntroducidos++;
				primerNumero = false;
			} else if (numero > ultimoValido) {
				ultimoValido = numero;
				totalIntroducidos++;
			} else {
				totalFallados++;
			}

			System.out.print("Introduce un número: ");
			numero = sc.nextInt();
		}

		System.out.println("Total de números introducidos (válidos): " + totalIntroducidos);
		System.out.println("Total de números fallados: " + totalFallados);

		sc.close();
	}
}
