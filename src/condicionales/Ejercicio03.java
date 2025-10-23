package condicionales;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Definimos las variables
		int numero;
		int resto;
		char letra;

		// Abrimos el scanner para recibir el DNI por parte del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca el DNI sin letra
		System.out.print("Introduce tu número de DNI (sin letra): ");

		// Recibimos el DNI introducido por el usuario
		numero = sc.nextInt();

		// Calculamos el resto de dividir el número entre 23
		resto = numero % 23;

		// Según el valor de la división con un switch asignaremos la letra
		switch (resto) {
		case 0:
			letra = 'T';
			break;
		case 1:
			letra = 'R';
			break;
		case 2:
			letra = 'W';
			break;
		case 3:
			letra = 'A';
			break;
		case 4:
			letra = 'G';
			break;
		case 5:
			letra = 'M';
			break;
		case 6:
			letra = 'Y';
			break;
		case 7:
			letra = 'F';
			break;
		case 8:
			letra = 'P';
			break;
		case 9:
			letra = 'D';
			break;
		case 10:
			letra = 'X';
			break;
		case 11:
			letra = 'B';
			break;
		case 12:
			letra = 'N';
			break;
		case 13:
			letra = 'J';
			break;
		case 14:
			letra = 'Z';
			break;
		case 15:
			letra = 'S';
			break;
		case 16:
			letra = 'Q';
			break;
		case 17:
			letra = 'V';
			break;
		case 18:
			letra = 'H';
			break;
		case 19:
			letra = 'L';
			break;
		case 20:
			letra = 'C';
			break;
		case 21:
			letra = 'K';
			break;
		case 22:
			letra = 'E';
			break;
		default:
			letra = '?';
		}

		// Imprimimos el resultado final
		System.out.println("Tu DNI completo es: " + numero + letra);

		// Cerramos el scanner
		sc.close();
	}
}
