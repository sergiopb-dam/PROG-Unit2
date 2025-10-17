package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el número deseado: ");
		int num = sc.nextInt();

		if (num < 10) {
			System.out.println("El número es de una cifra");
		} else if (num < 100) {
			System.out.println("El número es de dos cifras");
		} else if (num < 1000) {
			System.out.println("El número es de tres cifras");
		} else if (num < 10000) {
			System.out.println("El número es de cuatro cifras");
		} else if (num < 100000) {
			System.out.println("El número es de cinco cifras");
		} else {
			System.out.println("El número tiene más de cinco cifras");
		}

		sc.close();
	}
}
