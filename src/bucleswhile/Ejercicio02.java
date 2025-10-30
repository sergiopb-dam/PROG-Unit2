package bucleswhile;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		// Definimos las variables
		int numero;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		numero = sc.nextInt();

		while (numero >= 0) {
			contador ++;
			System.out.println("Introduce el número: ");
			numero = sc.nextInt();
		}
		System.out.println("Has introducido " + contador + " números positivos.");

		sc.close();
	}
}
