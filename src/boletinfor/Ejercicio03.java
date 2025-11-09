package boletinfor;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Definimos las increíbles variables que usaremos :)
		int num;
		int suma = 0;
		double media;
		
		// Abrimos el Scanner osi osi
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Mediante un bucle for lograremos que se pregunte por 10 números al usuario y
		 * se vayan sumando dentro de la variable suma
		 */
		for (int contador = 1; contador <= 10; contador++) {
			System.out.print("Introduce un numerito: ");
			num = sc.nextInt();
			suma += num;
		}
		
		// Calculamos la media
		media = suma / 10.0;
		
		// Imprimimos el resultado del cálculo de la media
		System.out.println("La media es: " + media);
		
		// Cerramos el Scanner, que no se olvide
		sc.close();
	}
}
