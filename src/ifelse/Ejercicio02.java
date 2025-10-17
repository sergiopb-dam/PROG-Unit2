package ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		double num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");

		num = sc.nextDouble();

		if (num > -1 && num < 1) {
			System.out.println("El número es casi 0");
		} else {
			System.out.println("El número es cualquiera");
		}

		sc.close();
	}

}