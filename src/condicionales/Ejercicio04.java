package condicionales;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		// Generamos dos variables que serán números aleatorios entre 1 y 99
		int num1 = (int) (Math.random() * 99) + 1;
		int num2 = (int) (Math.random() * 99) + 1;
		int respuesta;
		int resultado;

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Mostramos los números
		System.out.println("¿Cuánto es " + num1 + " + " + num2 + "?");

		// Pedimos la respuesta del usuario
		System.out.print("Introduce tu respuesta: ");
		// Recibimos la respuesta del usuario
		respuesta = sc.nextInt();

		// Calculamos el resultado real
		resultado = num1 + num2;

		// Comprobamos si la respuesta es correcta
		if (respuesta == resultado) {
			System.out.println("Correcto.");
		} else {
			System.out.println("Incorrecto. La respuesta era " + resultado);
		}
		// Cerramos el scanner
		sc.close();
	}
}
