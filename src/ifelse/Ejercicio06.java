package ifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variables para guardar los tres números que va a introducir el usuario
		int num1;
		int num2;
		int num3;

		// Preparamos el Scanner para leer lo que escriba el usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos el primer número
		System.out.print("Introduce el primer número entero: ");
		num1 = sc.nextInt();

		// Pedimos el segundo número
		System.out.print("Introduce el segundo número entero: ");
		num2 = sc.nextInt();

		// Pedimos el tercer número
		System.out.print("Introduce el tercer número entero: ");
		num3 = sc.nextInt();

		// Comprobamos si la suma de num1 y num2 es igual a num3
		if (num1 + num2 == num3) {
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);
		}
		// Comprobamos si la suma de num1 y num3 es igual a num2
		else if (num1 + num3 == num2) {
			System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);
		}
		// Comprobamos si la suma de num2 y num3 es igual a num1
		else if (num2 + num3 == num1) {
			System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);
		}
		// Si ninguna suma da como resultado el otro número
		else {
			System.out.println("Ninguna suma de dos números da como resultado el otro.");
		}

		// Cerramos el Scanner
		sc.close();
	}

}
