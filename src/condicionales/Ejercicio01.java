package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Definimos la variable que guardará el número a introducir
		int num;
		// Abrimos un escaner para recibir el número del usuario
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca el número
		System.out.println("Introduce un número entre 0 y 9999: ");
		// Asignamos el valor introducido por el usuario a la variable num
		num = sc.nextInt();
		// Creamos un condicional para que controle si es menor o mayor a nuestro rango
		if (num < 0 || num > 9999) {
			System.out.println("Error, el número introducido es inválido");
		// Si todo está correcto comenzaremos con nuestras operaciones
		} else {
			// Definimos las variables que utilizaremos para los rangos de números
			int unidades = num % 10;
			int decenas = (num / 10) % 10;
			int centenas = (num / 100) % 10;
			int miles = (num / 1000) % 10;
			// Definimos el booleano que nos dará el resultado final
			boolean esCapicua = false;
			// Mediante el uso de un condicional if comprobamos y asignamos valores para los rangos
			if (num < 10) {
				esCapicua = true;
			} else if (num < 100) {
				esCapicua = (unidades == decenas);
			} else if (num < 1000) {
				esCapicua = (unidades == centenas);
			} else {
				esCapicua = (unidades == miles) && (decenas == centenas);
			}
			// En función del valor final del booleano imprimiremos si es capicúa o no. 
			if (esCapicua) {
				System.out.println("El número " + num + " es capicúa.");
			} else {
				System.out.println("El número " + num + " no es capicúa.");
			}
		}
		// Cerramos el Scanner
		sc.close();
	}

}
