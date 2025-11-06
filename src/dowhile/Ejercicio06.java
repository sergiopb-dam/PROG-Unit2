package dowhile;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {

		// Definimos las variables que usaremos en el programa
		String jugada1;
		String jugada2;
		String seguir;
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";

		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		// Mediante un do while haremos que se pueda volver a jugar si se escribe "S"
		do {
			// Aseguraremos que la opción introducida sea correcta, sino no sigue ejecutando
			// el programa
			do {
				System.out.print("Jugada del jugador 1 (PIEDRA, PAPEL o TIJERAS): ");
				jugada1 = sc.next().toUpperCase();
				// Controlamos que se introduzca una opción válida
				if (!jugada1.equals(PIEDRA) && !jugada1.equals(PAPEL) && !jugada1.equals(TIJERAS)) {
					System.out.println("Jugada 1 errónea. Intenta de nuevo.");
				}
			} while (!jugada1.equals(PIEDRA) && !jugada1.equals(PAPEL) && !jugada1.equals(TIJERAS));

			// Aseguraremos que la opción introducida sea correcta, sino no sigue ejecutando
			// el programa
			do {
				System.out.print("Jugada del jugador 2 (PIEDRA, PAPEL o TIJERAS): ");
				jugada2 = sc.next().toUpperCase();
				// Controlamos que se introduzca una opción válida
				if (!jugada2.equals(PIEDRA) && !jugada2.equals(PAPEL) && !jugada2.equals(TIJERAS)) {
					System.out.println("Jugada 2 errónea. Intenta de nuevo.");
				}
			} while (!jugada2.equals(PIEDRA) && !jugada2.equals(PAPEL) && !jugada2.equals(TIJERAS));

			// Calculamos el resultado de la partida con el uso de if e ifelse
			if (jugada1.equals(jugada2)) {
				System.out.println("¡Empate!");
			} else if ((jugada1.equals(PIEDRA) && jugada2.equals(TIJERAS))
					|| (jugada1.equals(PAPEL) && jugada2.equals(PIEDRA))
					|| (jugada1.equals(TIJERAS) && jugada2.equals(PAPEL))) {
				System.out.println("Gana el jugador 1");
			} else {
				System.out.println("Gana el jugador 2");
			}

			// Preguntar si se quiere seguir jugando
			System.out.print("¿Quieres jugar otra vez? (S para sí, cualquier otra tecla para salir): ");
			seguir = sc.next().toUpperCase();
		} while (seguir.equals("S"));

		// Imprimimos que se está saliendo del programa
		System.out.println("Saliendo...");

		// Cerramos el Scanner :)
		sc.close();
	}
}