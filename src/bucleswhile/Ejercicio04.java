package bucleswhile;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        // Creamos el Scanner para leer lo que escriba el usuario
        Scanner reader = new Scanner(System.in);

        // Variable para guardar el número introducido
        int numero = 0;

        // Mensaje inicial
        System.out.println("Introduce un número entero (un número negativo terminará el programa): ");

        // Bucle que sigue pidiendo números mientras sean mayores o iguales a 0
        while (numero >= 0) {
            numero = reader.nextInt(); // Leemos el número

            // Si es negativo, salimos del bucle
            if (numero < 0) {
                System.out.println("Número negativo introducido. Fin del programa.");
                break;
            }

            // Podemos hacer algo con el número positivo, por ejemplo mostrarlo
            System.out.println("Número introducido: " + numero);
            System.out.println("Introduce otro número entero (o un número negativo para terminar): ");
        }

        // Cerramos el Scanner
        reader.close();
    }

}
