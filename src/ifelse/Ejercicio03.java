package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        // Preparamos el Scanner para leer lo que el usuario escriba
        Scanner sc = new Scanner(System.in);

        // Creamos variables para los coeficientes de la ecuación
        double a;
        double b;
        double c;

        // Mostramos al usuario la forma de la ecuación
        System.out.println("Ecuación de segundo grado: ax² + bx + c = 0");

        // Pedimos al usuario que introduzca el valor de 'a'
        System.out.print("Introduce el valor de a: ");
        a = sc.nextDouble();

        // Pedimos al usuario que introduzca el valor de 'b'
        System.out.print("Introduce el valor de b: ");
        b = sc.nextDouble();

        // Pedimos al usuario que introduzca el valor de 'c'
        System.out.print("Introduce el valor de c: ");
        c = sc.nextDouble();

        // Si 'a' es 0, la ecuación no es de segundo grado
        if (a == 0) {
            // Si también 'b' es 0
            if (b == 0) {
                // Si además 'c' es 0, la ecuación tiene infinitas soluciones
                if (c == 0) {
                    System.out.println("La ecuación tiene infinitas soluciones.");
                } else {
                    // Si 'c' no es 0, la ecuación no tiene solución
                    System.out.println("La ecuación no tiene solución.");
                }
            } else {
                // Si 'b' no es 0, es una ecuación de primer grado
                double x = -c / b;
                System.out.println("La ecuación es de primer grado. Su solución es: x = " + x);
            }
        } else {
            // Si 'a' no es 0, calculamos el discriminante
            double discriminante = b * b - 4 * a * c;

            // Si el discriminante es positivo, hay dos soluciones reales
            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } 
            // Si el discriminante es 0, hay una única solución real
            else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución real:");
                System.out.println("x = " + x);
            } 
            // Si el discriminante es negativo, no hay soluciones reales
            else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }

        // Cerramos el Scanner
        sc.close();
    }

}
