package dowhile;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		int num1, num2, suma, resta, mult;
		double div;
		String opcion;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce el número 1: ");
			num1 = sc.nextInt();

			System.out.print("Introduce el número 2: ");
			num2 = sc.nextInt();

			System.out.println("\nMenú de Cálculo");
			System.out.println("A. Sumar los números");
			System.out.println("B. Restar los números");
			System.out.println("C. Multiplicar los números");
			System.out.println("D. Dividir los números");
			System.out.println("E. Salir");
			System.out.print("Introduce la letra de la opción a ejecutar: ");
			opcion = sc.next().toUpperCase();

			switch (opcion) {
			case "A":
				suma = num1 + num2;
				System.out.println("La suma de " + num1 + " + " + num2 + " es " + suma + ".\n");
				break;
			case "B":
				resta = num1 - num2;
				System.out.println("La resta de " + num1 + " - " + num2 + " es " + resta + ".\n");
				break;
			case "C":
				mult = num1 * num2;
				System.out.println("La multiplicación de " + num1 + " x " + num2 + " es " + mult + ".\n");
				break;
			case "D":
				if (num2 == 0) {
					System.out.println("Error: No se puede dividir por 0.\n");
				} else {
					div = (double) num1 / num2;
					System.out.println("La división de " + num1 + " / " + num2 + " es " + div + ".\n");
				}
				break;
			case "E":
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Error. Opción inválida.\n");
			}
		} while (!opcion.equals("E"));

		sc.close();
	}
}