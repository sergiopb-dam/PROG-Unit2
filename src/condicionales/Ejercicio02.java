package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Definimos las variables del número y del valor absoluto
		int num;
		int valorAbsoluto;
		// Inicializamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca el número a evaluar
		System.out.println("Introduce el numero: ");
		// Recibimos el número escrito por el usuario
		num = sc.nextInt();
		// Calculamos el valor absoluto del número
		valorAbsoluto = (num < 0) ? (num * -1) : num ;
		// Imprimimos el valor absoluto del número
		System.out.println("El valor absoluto de " + num + " es " + valorAbsoluto + ".");
		// Cerramos el escáner
		sc.close();
	}

}
