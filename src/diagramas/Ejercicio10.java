package diagramas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int horas;
		int minutos;
		int segundos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las horas: ");
		horas = sc.nextInt();
		
		System.out.println("Introduce los minutos: ");
		minutos = sc.nextInt();
		
		System.out.println("Introduce los segundos: ");
		segundos = sc.nextInt();
		
		if (segundos<59) {
			segundos++;
		}	
			 else {
				segundos = 0;
						if (minutos<59) {
							minutos++;
						}
						else {
							minutos = 0;
							if (horas<23) {
								horas++;
								
							}
							else {
									horas = 0;
								}
						}
			 }
		System.out.println(horas + ":" + minutos + ":" + segundos);
		sc.close();
		
		}
		
	}
