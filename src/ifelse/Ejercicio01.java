package ifelse;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");

		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");

		}

		sc.close();
	}
}
