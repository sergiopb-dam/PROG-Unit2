package diagramas;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		// Definimos las variables
		int edad;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca su edad
		System.out.println("Introduce tu edad: ");
		
		// Leemos la edad introducida por el usuario
		edad = reader.nextInt();
		
		// Comprobamos si la edad es mayor o igual a 18 y mostramos el mensaje
		// correspondiente
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");

		}
		
		// Cerramos el Scanner
		reader.close();
	}
}
