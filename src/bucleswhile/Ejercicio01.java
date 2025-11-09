package bucleswhile;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        // Variable para leer los números del usuario
        int numero;
        // Variable para ir acumulando la suma
        int suma = 0;

        // Preparamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos el primer número
        System.out.println("Introduce el número: ");
        numero = sc.nextInt();

        // Mientras el número sea mayor o igual a 0, seguimos sumando
        while (numero >= 0) {
            suma += numero; // Sumamos el número a la variable suma
            // Pedimos otro número
            System.out.println("Introduce el número: ");
            numero = sc.nextInt();
        }

        // Cuando el usuario introduce un número negativo, mostramos la suma total
        System.out.println("La suma es " + suma);

        // Cerramos el Scanner
        sc.close();
    }

}
