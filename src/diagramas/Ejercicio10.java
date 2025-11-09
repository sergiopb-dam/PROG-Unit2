package diagramas;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Variables para horas, minutos y segundos
        int horas;
        int minutos;
        int segundos;

        // Preparamos el Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario las horas
        System.out.println("Introduce las horas: ");
        horas = sc.nextInt();

        // Pedimos al usuario los minutos
        System.out.println("Introduce los minutos: ");
        minutos = sc.nextInt();

        // Pedimos al usuario los segundos
        System.out.println("Introduce los segundos: ");
        segundos = sc.nextInt();

        // Aumentamos un segundo
        if (segundos < 59) {
            // Si los segundos son menores que 59, solo sumamos 1
            segundos++;
        } else {
            // Si los segundos son 59, volvemos a 0 y sumamos 1 minuto
            segundos = 0;

            if (minutos < 59) {
                // Si los minutos son menores que 59, sumamos 1
                minutos++;
            } else {
                // Si los minutos son 59, volvemos a 0 y sumamos 1 hora
                minutos = 0;

                if (horas < 23) {
                    // Si las horas son menores que 23, sumamos 1
                    horas++;
                } else {
                    // Si las horas son 23, volvemos a 0
                    horas = 0;
                }
            }
        }

        // Mostramos la hora actualizada
        System.out.println(horas + ":" + minutos + ":" + segundos);

        // Cerramos el Scanner
        sc.close();
    }

}
