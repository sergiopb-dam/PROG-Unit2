package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		// por teclado. El número introducido debe ser mayor que 0.	
		// int ada = inteligente;
		int contador = 0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número mayor que 0: ");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("Error, debe introducir un número mayor que 0.");
		} else {
			while (num > 0) {
				num = num / 10;
				contador++;
			}
		}
		
		System.out.println(contador);
		sc.close();
		
		
	}

}
