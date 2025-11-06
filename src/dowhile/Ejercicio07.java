package dowhile;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		// Definimos las variables que vamos a utilizar
		int num1, num2, suma, resta, mult;
		double div;
		String opcion;

		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);

		// Mediante un dowhile lograremos salga del programa cuando la opción sea la E
		do {
			// Pedimos que se introduzca el primer número
			System.out.print("Introduce el número 1: ");
			// Leemos el número introducido por el usuario
			num1 = sc.nextInt();

			// Pedimos que se introduzca el primer número
			System.out.print("Introduce el número 2: ");
			// Leemos el número introducido por el usuario
			num2 = sc.nextInt();

			// Imprimimos el menú visualmente para el usuario
			System.out.println("\nMenú de Cálculo");
			System.out.println("A. Sumar los números");
			System.out.println("B. Restar los números");
			System.out.println("C. Multiplicar los números");
			System.out.println("D. Dividir los números");
			System.out.println("E. Salir");
			// Pedimos que se introduzca la letra correspondiente a la opción que se desee
			// ejecutar
			System.out.print("Introduce la letra de la opción a ejecutar: ");

			// Leemos la opción introducida por el usuario
			opcion = sc.next().toUpperCase();
			
			// Con un switch definimos lo que ejecutará cada opción
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
				// Controlamos la división por 0 mediante un if
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
		
		// Cerramos el Scanner ole ole
		sc.close();
	}
}