package boletinfor;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		// Definimos la variable num
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
		for (int contador = 3; contador <= num; contador += 3) {
			System.out.println(contador);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
}
