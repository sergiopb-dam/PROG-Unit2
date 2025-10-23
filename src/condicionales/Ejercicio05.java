package condicionales;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		// Definimos todas las variables necesarias
		double distancia;
		int dias;
		double precioTotal;
		double descuento;
		final double precioPorKm = 2.5; // Constante ya que es el precio por kilómetro

		// Creamos el objeto Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario la distancia a recorrer
		System.out.print("Introduce la distancia a recorrer (en km): ");
		// Leemos la distancia introducida por el usuario
		distancia = sc.nextDouble();

		// Pedimos al usuario el número de días de estancia
		System.out.print("Introduce el número de días de estancia: ");
		// Leemos los días introducidos por el usuario
		dias = sc.nextInt();

		// Calculamos el precio total sin descuento
		precioTotal = distancia * precioPorKm;

		// Comprobamos si se cumple la condición del descuento
		if (dias > 7 && distancia > 800) {
			// Calculamos el descuento del 30%
			descuento = precioTotal * 0.3;
			// Aplicamos el descuento al precio total
			precioTotal = precioTotal - descuento;
			// Mostramos el precio con descuento
			System.out.println("Se aplica un descuento del 30%.");
		}

		// Mostramos el precio final del billete
		System.out.println("El precio final del billete es: " + precioTotal + " €");
		// Cerramos el Scanner
		sc.close();
	}
}
