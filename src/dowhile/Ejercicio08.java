package dowhile;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		// Definimos las variables a utilizar
		int num1 = 0;
		int num2 = 0;
		int suma;
		String tirada1;
		String tirada2;
		
		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);

		// Primera tirada
		// Mediante un do while pasaremos a la siguiente jugada cuando el número no sea 0
		do {
			System.out.print("¿Cuánto has sacado en la primera tirada? ");
			tirada1 = sc.next().toUpperCase();
			// Ahora con un switch pasaremos a número la tirada
			switch (tirada1) {
			case "UNO":
				num1 = 1;
				break;
			case "DOS":
				num1 = 2;
				break;
			case "TRES":
				num1 = 3;
				break;
			case "CUATRO":
				num1 = 4;
				break;
			case "CINCO":
				num1 = 5;
				break;
			case "SEIS":
				num1 = 6;
				break;
			default:
				System.out.println("El primer valor introducido es inválido.");
			}
		} while (num1 == 0);

		// Segunda tirada
		// Mediante un do while pasaremos a la siguiente jugada cuando el número no sea 0
		do {
			System.out.print("¿Cuánto has sacado en la segunda tirada? ");
			tirada2 = sc.next().toUpperCase();
			// Ahora con un switch pasaremos a número la tirada
			switch (tirada2) {
			case "UNO":
				num2 = 1;
				break;
			case "DOS":
				num2 = 2;
				break;
			case "TRES":
				num2 = 3;
				break;
			case "CUATRO":
				num2 = 4;
				break;
			case "CINCO":
				num2 = 5;
				break;
			case "SEIS":
				num2 = 6;
				break;
			default:
				System.out.println("El segundo valor introducido es inválido.");
			}
		} while (num2 == 0);
		
		// Realizamos la suma
		suma = num1 + num2;
		
		// Mostramos el resultado de la suma
		System.out.println("La suma de las dos tiradas es " + suma + ".");
		
		// Cerramos el maravilloso Scanner
		sc.close();
	}
}