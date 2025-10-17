package ifelse;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        String jugada1;
        String jugada2;
        final String PIEDRA = "PIEDRA";
        final String PAPEL = "PAPEL";
        final String TIJERAS = "TIJERAS";

        Scanner sc = new Scanner(System.in);

        System.out.println("Jugada del jugador 1: ");
        jugada1 = sc.next().toUpperCase();

        System.out.println("Jugada del jugador 2: ");
        jugada2 = sc.next().toUpperCase();

        if (!jugada1.equals(PIEDRA) && !jugada1.equals(PAPEL) && !jugada1.equals(TIJERAS)) {
            System.out.println("Jugada 1 errónea");
        } else if (!jugada2.equals(PIEDRA) && !jugada2.equals(PAPEL) && !jugada2.equals(TIJERAS)) {
            System.out.println("Jugada 2 errónea");
        } else if (jugada1.equals(jugada2)) {
            System.out.println("¡Empate!");
        } else if (jugada1.equals(PIEDRA) && jugada2.equals(TIJERAS)
                || jugada1.equals(PAPEL) && jugada2.equals(PIEDRA)
                || jugada1.equals(TIJERAS) && jugada2.equals(PAPEL)) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }

        sc.close();
    }
}
