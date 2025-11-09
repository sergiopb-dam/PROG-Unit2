package boletinfor;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Definimos la variable num
		int num;

		// Abrimos el maravilloso Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca el número hasta el que se contará
		System.out.println("Introduce el número hasta el que se contará: ");

		// Leemos el número y asignamos su valor a num
		num = sc.nextInt();

		/*
		 * Con un bucle for mostraremos cada numerito mientras se le suma 1 mientras sea
		 * menor o igual al número introducido por el usuario
		 */
		for (int contador = 1; contador <= num; contador++) {
			System.out.println(contador);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
}
