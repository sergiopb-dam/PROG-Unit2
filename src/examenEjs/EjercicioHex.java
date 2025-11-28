package examenEjs;

import java.util.Scanner;

public class EjercicioHex {

	public static void main(String[] args) {
		int lado;
		int espaciosPrincipio;
		int asteriscos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nº del lado: ");
		lado = sc.nextInt();
		
		for (int i = 0; i < lado; i++) {
			espaciosPrincipio = lado;
			asteriscos = lado + 2 * i;
			for (int espacioActual = 1; espacioActual <= espaciosPrincipio; espacioActual++) {
				System.out.print("  ");
			}
			
			for (int asteriscoActual = 1; asteriscoActual <= asteriscos; asteriscoActual++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int j = lado-2; j >= 0; j--) {
			int espaciosPrincipio2;
			espaciosPrincipio2 = lado - 1 - j;
			
			int asteriscos2;
			asteriscos2 = lado + 2 * j;
			
			for (int espacioActual2 = 0; espacioActual2 < espaciosPrincipio2; espacioActual2++) {
				System.out.print("  ");
			}
			for (int asteriscoActual2 = 1; asteriscoActual2 <= asteriscos2; asteriscoActual2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
