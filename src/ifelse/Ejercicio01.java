package ifelse;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {

		// Creamos una variable para guardar el número que va a poner el usuario
		int num;

		// Preparamos el Scanner para leer lo que el usuario escriba
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que escriba un número
		System.out.println("Introduce un número");

		// Guardamos el número que escribió el usuario
		num = sc.nextInt();

		// Revisamos si el número es divisible entre 2
		if (num % 2 == 0) {
			// Si lo es, mostramos que es par
			System.out.println("El número es par");
		} else {
			// Si no, mostramos que es impar
			System.out.println("El número es impar");
		}

		// Cerramos el Scanner
		sc.close();
	}
}
