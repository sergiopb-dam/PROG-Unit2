package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// declaramos la variable para las horas
		int horas;
		// declaramos la variable para los minutos
		int minutos;
		// declaramos la variable para los segundos
		int segundos;
		// declaramos la variable para los segundos a incrementar
		int cantidadSeg;

		// creamos el escáner para leer datos del teclado
		Scanner sc = new Scanner(System.in);

		// pedimos las horas y validamos que estén entre 0 y 23
		do {
			System.out.print("Introduce el número de horas: ");
			horas = sc.nextInt();
			// avisamos si el valor no es válido
			if (!(horas >= 0 && horas <= 23)) {
				System.out.println("Error, debes introducir un valor entre 0-23.");
			}
		} while (!(horas >= 0 && horas <= 23));

		// pedimos los minutos y validamos que estén entre 0 y 59
		do {
			System.out.print("Introduce el número de minutos: ");
			minutos = sc.nextInt();
			// avisamos si el valor no es válido
			if (!(minutos >= 0 && minutos <= 59)) {
				System.out.println("Error, debes introducir un valor entre 0-59.");
			}
		} while (!(minutos >= 0 && minutos <= 59));

		// pedimos los segundos y validamos que estén entre 0 y 59
		do {
			System.out.print("Introduce el número de segundos: ");
			segundos = sc.nextInt();
			// avisamos si el valor no es válido
			if (!(segundos >= 0 && segundos <= 59)) {
				System.out.println("Error, debes introducir un valor entre 0-59.");
			}
		} while (!(segundos >= 0 && segundos <= 59));

		// pedimos la cantidad de segundos a incrementar
		System.out.print("Introduce la cantidad de segundos a incrementar: ");
		cantidadSeg = sc.nextInt();

		// hacemos un bucle que suma segundo a segundo
		for (int i = 0; i < cantidadSeg; i++) {
			// sumamos un segundo al reloj
			segundos++;

			// si los segundos llegan a 60, reiniciamos y sumamos un minuto
			if (segundos == 60) {
				segundos = 0;
				minutos++;
			}

			// si los minutos llegan a 60, reiniciamos y sumamos una hora
			if (minutos == 60) {
				minutos = 0;
				horas++;
			}

			// si las horas llegan a 24, volvemos a 0
			if (horas == 24) {
				horas = 0;
			}
		}

		// mostramos la hora final en formato hh:mm:ss
		System.out.printf("La hora resultante es: " + horas + ":" + minutos + ":" + segundos);

		// cerramos el escáner
		sc.close();
	}
}
