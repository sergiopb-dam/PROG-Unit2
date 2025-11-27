package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num;
		int numRev = 0;
		int ayuda;
		int cifra;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número mayor o igual a 0: ");
		num = sc.nextInt();

		if (num >= 0) {
			ayuda = num;
			while (ayuda > 0) {
				cifra = ayuda % 10;
				numRev = (numRev * 10) + cifra;
				ayuda = ayuda / 10;
			}

			if (num == numRev) {
				System.out.println("El número " + num + " es capicúa.");
			} else {
				System.out.println("El número " + num + " no es capicúa.");
			}

		} else {
			System.out.println("Error: Debes introducir un número mayor o igual que 0.");
		}

		sc.close();
	}
}