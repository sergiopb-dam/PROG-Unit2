package diagramas;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Definimos las variables
		double num1;
		double num2;
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		// Pedimos al usuario que introduzca el primer número
		System.out.println("Introduce el número 1: ");
		// Lee el primer número introducido por el usuario
		num1 = reader.nextDouble();
		// Pedimos al usuario que introduzca el segundo número
		System.out.println("Introduce el número 2: ");
		// Lee el segundo número introducido por el usuario
		num2 = reader.nextDouble();
		// Vemos qué numero es el mayor y mostramos el resultado
		if (num1 > num2) {
			System.out.println("El número 1 es mayor que el número 2");
		}
		else {
			System.out.println("El número 2 es mayor que el número 1");
		}
		// Cerramos el Scanner
		reader.close();
	}

}
