package bucleswhile;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        // Variable para leer los números del usuario
        int numero;
        // Variable para contar cuántos números positivos se introducen
        int contador = 0;

        // Preparamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos el primer número
        System.out.println("Introduce el número: ");
        numero = sc.nextInt();

        // Mientras el número sea mayor o igual a 0, seguimos contando
        while (numero >= 0) {
            contador++; // Incrementamos el contador
            // Pedimos otro número
            System.out.println("Introduce el número: ");
            numero = sc.nextInt();
        }

        // Cuando el usuario introduce un número negativo, mostramos la cantidad de positivos introducidos
        System.out.println("Has introducido " + contador + " números positivos.");

        // Cerramos el Scanner
        sc.close();
    }

}
