package ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Creamos una variable para guardar el número que va a escribir el usuario
		double num;

		// Preparamos el Scanner para leer lo que el usuario escriba
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduce un número: ");

		// Guardamos el número que escribió el usuario
		num = sc.nextDouble();

		// Revisamos si el número está entre -1 y 1
		if (num > -1 && num < 1) {
			// Si lo está, mostramos que es "casi 0"
			System.out.println("El número es casi 0");
		} else {
			// Si no, mostramos que es cualquier otro número
			System.out.println("El número es cualquiera");
		}

		// Cerramos el Scanner
		sc.close();
	}

}
