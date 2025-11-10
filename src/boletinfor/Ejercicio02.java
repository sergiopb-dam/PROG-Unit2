package boletinfor;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		// Definimos las variables
		int contMult = 0;
		int num;
		/*
		 * Abrimos el Scanner para recibir el número hasta el que se mostrarán los
		 * múltiplos de 3
		 */
		Scanner sc = new Scanner(System.in);

		// Pedimos que se introduzca el número mencionado
		System.out.println("Introduce el número: ");

		// Leemos el numerito
		num = sc.nextInt();

		/*
		 * Usando un bucle for sumaremos 3 progresivamente hasta el número que introdujo
		 * el usuario, mostrando así los múltiplos de 3 únicamente.
		 */
		for (int contador = 1; contador <= num; contador++) {
			if (contador % 3 == 0) {
				contMult++;
			}
			
		}
		System.out.println("Hay " + contMult + " múltiplos de 3 en el rango introducido.");
		// Cerramos el Scanner
		sc.close();
	}
}
