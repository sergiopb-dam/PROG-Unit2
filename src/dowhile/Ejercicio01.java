package dowhile;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Definimos la variable de número, con valor inicial 1
		int num = 1;
		/*
		 * Con el uso de un bucle doWhile mostraremos el número y le sumaremos uno
		 * constantemente hasta que la condición de que sea menor o igual que 20 se
		 * cumpla
		 */
		do {
			System.out.println(num);
			num++;
		} while (num <= 20);

	}

}
