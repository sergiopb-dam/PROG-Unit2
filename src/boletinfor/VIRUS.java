package boletinfor;

import java.util.Scanner;

public class VIRUS {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("W Speed?");
		System.out.println("1. YES");
		System.out.println("2. NO");
		System.out.println("Introduce tu opción: ");
		num = sc.nextInt();
		if (num == 2) {
			for (int i = num; i >= 0; i++) {
				System.out.println("Antonio una duda.");
			}
		} else if (num == 1) {
			System.out.println("JESUS TE AMO");
		} else {
			System.out.println("Opción incorrecta.");
		}
		
		sc.close();
	}

}
