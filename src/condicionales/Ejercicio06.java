package condicionales;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		// Definimos las variables necesarias
		int mes;
		int year;
		int dias = 0;
		boolean bisiesto;
		boolean mesValido = true;

		// Creamos el objeto Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos el número del mes al usuario
		System.out.print("Introduce el número del mes (1-12): ");
		mes = sc.nextInt();

		// Pedimos el año al usuario
		System.out.print("Introduce el año: ");
		// Leemos el año introducido por el usuario
		year = sc.nextInt();

		// Comprobamos si el año es bisiesto
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			bisiesto = true;
		} else {
			bisiesto = false;
		}

		// Determinamos el número de días del mes según su número
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			dias = 31;
			break;
		case 4, 6, 9, 11:
			dias = 30;
			break;
		case 2:
			// Si es febrero, depende de si el año es bisiesto o no
			if (bisiesto) {
				dias = 29;
			} else {
				dias = 28;
			}
			break;
		default:
			// Si el mes no está entre 1 y 12, marcamos el mes como no válido
			mesValido = false;
			break;
		}

		// Mostramos el resultado final solo si el mes es válido
		if (mesValido) {
			System.out.println("El mes " + mes + " del año " + year + " tiene " + dias + " días.");
		} else {
			System.out.println("Mes no válido.");
		}

		// Cerramos el scanner
		sc.close();
	}
}
