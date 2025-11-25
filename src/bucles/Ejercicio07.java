package bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Escribe un programa que lea un numero n e imprima una pirámide den números
		// con n filas
		int filas;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas de la pirámide: ");
		filas = sc.nextInt();

		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i-1; k >= i; k--) {
				System.out.println(k);
			}
			System.out.println();
		}

		sc.close();

	}

}
