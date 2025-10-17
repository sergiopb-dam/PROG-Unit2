package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double c;

		System.out.println("Ecuación de segundo grado: ax² + bx + c = 0");

		System.out.print("Introduce el valor de a: ");
		a = sc.nextDouble();

		System.out.print("Introduce el valor de b: ");
		b = sc.nextDouble();

		System.out.print("Introduce el valor de c: ");
		c = sc.nextDouble();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("La ecuación tiene infinitas soluciones.");
				} else {
					System.out.println("La ecuación no tiene solución.");
				}
			} else {
				double x = -c / b;
				System.out.println("La ecuación es de primer grado. Su solución es: x = " + x);
			}
		} else {
			double discriminante = b * b - 4 * a * c;

			if (discriminante > 0) {
				double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("La ecuación tiene dos soluciones reales:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if (discriminante == 0) {
				double x = -b / (2 * a);
				System.out.println("La ecuación tiene una única solución real:");
				System.out.println("x = " + x);
			} else {
				System.out.println("La ecuación no tiene soluciones reales.");
			}
		}

		sc.close();

	}

}