package ifelse;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        // Variables para guardar la jugada de cada jugador
        String jugada1;
        String jugada2;

        // Constantes para las posibles jugadas
        final String PIEDRA = "PIEDRA";
        final String PAPEL = "PAPEL";
        final String TIJERAS = "TIJERAS";

        // Creamos el Scanner para leer lo que escribe el usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos la jugada del jugador 1 y la convertimos a mayúsculas
        System.out.println("Jugada del jugador 1: ");
        jugada1 = sc.next().toUpperCase();

        // Pedimos la jugada del jugador 2 y la convertimos a mayúsculas
        System.out.println("Jugada del jugador 2: ");
        jugada2 = sc.next().toUpperCase();

        // Comprobamos si la jugada 1 es válida
        if (!jugada1.equals(PIEDRA) && !jugada1.equals(PAPEL) && !jugada1.equals(TIJERAS)) {
            System.out.println("Jugada 1 errónea");
        } 
        // Comprobamos si la jugada 2 es válida
        else if (!jugada2.equals(PIEDRA) && !jugada2.equals(PAPEL) && !jugada2.equals(TIJERAS)) {
            System.out.println("Jugada 2 errónea");
        } 
        // Comprobamos si ambas jugadas son iguales (empate)
        else if (jugada1.equals(jugada2)) {
            System.out.println("¡Empate!");
        } 
        // Comprobamos las combinaciones en las que gana el jugador 1
        else if (jugada1.equals(PIEDRA) && jugada2.equals(TIJERAS)
                || jugada1.equals(PAPEL) && jugada2.equals(PIEDRA)
                || jugada1.equals(TIJERAS) && jugada2.equals(PAPEL)) {
            System.out.println("Gana el jugador 1");
        } 
        // Si ninguna de las anteriores se cumple, gana el jugador 2
        else {
            System.out.println("Gana el jugador 2");
        }

        // Cerramos el Scanner
        sc.close();
    }
}
