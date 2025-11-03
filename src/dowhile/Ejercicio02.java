package dowhile;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Definimos la variable de número, con valor inicial 2
		int num = 2;
		/*
		 * Con el uso de un bucle doWhile mostraremos el número y le sumaremos dos
		 * constantemente hasta que la condición de que sea menor o igual que 200 se
		 * cumpla
		 */
		do {
			System.out.println(num);
			num += 2;
		} while (num <= 200);

	}

}
