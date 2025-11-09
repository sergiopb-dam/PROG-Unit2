package switchex;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        // Variables para guardar los números de cada tirada
        int num1 = 0;
        int num2 = 0;
        int suma;

        // Variables para leer la tirada como texto
        String tirada1;
        String tirada2;

        // Preparamos el Scanner
        Scanner sc = new Scanner(System.in);

        boolean valido = true; // Variable para controlar si las entradas son válidas

        // Pedimos la primera tirada
        System.out.print("¿Cuánto has sacado en la primera tirada? ");
        tirada1 = sc.next().toUpperCase();

        // Convertimos la tirada en número usando switch
        switch (tirada1) {
            case "UNO": num1 = 1; break;
            case "DOS": num1 = 2; break;
            case "TRES": num1 = 3; break;
            case "CUATRO": num1 = 4; break;
            case "CINCO": num1 = 5; break;
            case "SEIS": num1 = 6; break;
            default:
                System.out.println("El primer valor introducido es inválido.");
                valido = false;
        }

        // Pedimos la segunda tirada solo si la primera fue válida
        if (valido) {
            System.out.print("¿Cuánto has sacado en la segunda tirada? ");
            tirada2 = sc.next().toUpperCase();

            switch (tirada2) {
                case "UNO": num2 = 1; break;
                case "DOS": num2 = 2; break;
                case "TRES": num2 = 3; break;
                case "CUATRO": num2 = 4; break;
                case "CINCO": num2 = 5; break;
                case "SEIS": num2 = 6; break;
                default:
                    System.out.println("El segundo valor introducido es inválido.");
                    valido = false;
            }
        }

        // Si ambas tiradas son válidas, mostramos la suma
        if (valido) {
            suma = num1 + num2;
            System.out.println("La suma de las dos tiradas es " + suma + ".");
        }

        // Cerramos el Scanner
        sc.close();
    }
}
