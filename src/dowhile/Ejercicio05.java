package dowhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Definimos las variables que vamos a utilizar
		int max = 100;
		int min = 1;
		int numAleatorio;
		String respuesta;
		
		// Abrimos el Scanner para recibir la información del usuario
		Scanner sc = new Scanner(System.in);
		
		// Decimos al usuario que piense en un número del 1 al 100
		System.out.println("Piensa en un número del 1 al 100...");
		
		// Mediante un bucle haremos lo siguiente:
		do {
			// Generamos un número aleatorio dentro del rango de las variables min y max
			numAleatorio = (int) (Math.random() * (max - min + 1)) + min;
			
			// Preguntamos si el número aleatorio coincide con el que pensó el usuario
			System.out.println("¿Tu número es " + numAleatorio + "?");
			
			// Bucle para asegurarnos de que el usuario introduce una respuesta válida
			do {
				System.out.print("Responde solo con 'mayor', 'menor' o 'igual': ");
				respuesta = sc.next().toLowerCase();
			} while (!respuesta.equals("mayor") && !respuesta.equals("menor") && !respuesta.equals("igual"));

			// Ahora cambiamos los valores de las variables min y max en función de la respuesta del usuario
			if (respuesta.equals("mayor")) {
				min = numAleatorio + 1; // Si el número del usuario es mayor
			} else if (respuesta.equals("menor")) {
				max = numAleatorio - 1; // Si el número del usuario es menor
			}
		} while (!respuesta.equals("igual"));
		
		// Decimos que somos unos genios porque es verdad jejeje
		System.out.println("Soy realmente un genio, que facilito.");
		
		// Muy importante, cerramos el Scanner
		sc.close();
	}
}
