package boletinfor;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable para guardar el número introducido
		int num;
		// Variable para calcular el factorial (usamos long por si el resultado es
		// grande)
		long numFactorial = 1;
		// Creamos el objeto Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número
		System.out.println("Introduce");
		num = sc.nextInt();

		// Bucle que multiplica todos los números desde 1 hasta 'num'
		for (int contador = 1; contador <= num; contador++) {
			// Multiplicamos el valor actual por el contador
			numFactorial *= contador;
			// Mostramos el número actual
			System.out.print(contador);
			// Si no es el último número, mostramos una "x" para separar
			if (contador != num) {
				System.out.print("x");
			}
		}

		// Mostramos el resultado final del factorial
		System.out.println(" = " + numFactorial);

		// Cerramos el scanner
		sc.close();
	}

}
