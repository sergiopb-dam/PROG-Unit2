package switchex;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        // Preparamos el Scanner para leer la nota del usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos la nota al usuario
        System.out.print("Introduce tu nota (0-10): ");
        int nota = sc.nextInt();

        // Evaluamos la nota usando un switch
        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                // Si la nota está entre 0 y 4
                System.out.println("Insuficiente");
                break;

            case 5:
                // Si la nota es 5
                System.out.println("Suficiente");
                break;

            case 6:
                // Si la nota es 6
                System.out.println("Bien");
                break;

            case 7: case 8:
                // Si la nota es 7 u 8
                System.out.println("Notable");
                break;

            case 9: case 10:
                // Si la nota es 9 o 10
                System.out.println("Sobresaliente");
                break;

            default:
                // Si la nota está fuera del rango 0-10
                System.out.println("La nota introducida no es correcta.");
                break;
        }

        // Cerramos el Scanner
        sc.close();
    }
}
