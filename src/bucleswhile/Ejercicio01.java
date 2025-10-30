package bucleswhile;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Definimos las variables
		int numero;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		numero = sc.nextInt();

		while (numero >= 0) {
			suma += numero;
			System.out.println("Introduce el número: ");
			numero = sc.nextInt();
		}
		System.out.println("La suma es " + suma);

		sc.close();
	}
}
