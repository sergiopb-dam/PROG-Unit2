package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Solicita al usuario un número n y dibuja un triángulo de base y altura n. 
		// Por ejemplo para n=4 debe dibujar lo siguiente:
		 	//*
		   //* *
		  //* * *
		 //* * * *
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j <= num - i) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
