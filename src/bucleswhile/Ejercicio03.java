package bucleswhile;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {

		int numero;
		int suma = 0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Introduce un número entero positivo (o un número negativo para terminar): ");
			numero = sc.nextInt();

			if (numero < 0) {
				break;
			}

			suma += numero;
			contador++;
		}

		if (contador > 0) {
			double media = (double) suma / contador;
			System.out.println("La media de los números positivos es: " + media);
		} else {
			System.out.println("No se introdujeron números positivos.");
		}

		sc.close();
	}
}
