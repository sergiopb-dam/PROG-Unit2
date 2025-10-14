package diagramas;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
    	// Definimos las variables
        double num1;
        double num2;
        double division = 0;
        double multiplicacion;
        double suma;
        double resta;
        // Creamos el Scanner
        Scanner reader = new Scanner(System.in);
        // Pedimos al usuario que introduzca el valor del primer numero
        System.out.println("Introduce el número 1: ");
        // Leemos el valor del primer número
        num1 = reader.nextDouble();
        // Pedimos al usuario que introduzca el valor del segundo numero
        System.out.println("Introduce el número 2: ");
        // Leemos el valor del segundo número
        num2 = reader.nextDouble();
        // Hacemos los cálculos correspondientes y mostramos sus resultados
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        
        if (num2 == 0) {
            System.out.println("No se puede dividir por 0.");
        } else {
            division = num1 / num2;
            System.out.println("El resultado de la division es: " + division);
        }
        // Cerramos el Scanner
        reader.close();
    }
}
