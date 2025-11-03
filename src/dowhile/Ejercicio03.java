package dowhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Definimos las variables
		int suma = 0;
		int contador = 1;
		int numero;
		// Inicializamos el Scanner para leer el número del usuario
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número: ");
		// Asignamos a la variable número el valor introducido por el usuario
		numero = sc.nextInt();
		/*
		 * Mediante un bucle doWhile controlaremos que se sume un número que se irá
		 * incrementando en 1 hasta que el contador sea menor o igual a el número del
		 * usuario
		 */
		do {
			suma += contador;
			contador++;
		} while (contador <= numero);
		// Mostramos el resultado al usuario
		System.out.println("La suma total es: " + suma);
		// Cerramos el Scanner
		sc.close();
	}

}
