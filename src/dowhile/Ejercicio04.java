package dowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Definimos las variables a utilizar
		int num;
		int contador = 1;
		int resultado;
		
		// Abrimos un Scanner para recibir el número que usaremos del usuario
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca su maravilloso número
		System.out.println("Introduce el número del que quieras saber su tabla de multiplicar");
		
		// Leemos el numerito
		num = sc.nextInt();
		
		// Inicializamos la variable resultado para que no de problemas
		resultado = num;
		
		// Con un bucle do, crearemos la tabla de multiplicar del número
		do {
			// Imprimimos la tabla como tal
			System.out.println(num + "x" + contador + "=" + resultado);
			
			// añadimos uno al contador
			contador++;
			
			// Hacemos la multiplicación que corresponda
			resultado = num * contador;
		} while (contador <= 10); // El bucle terminará cuando sea mayor de 10
		
		// Cerramos el maravilloso Scanner
		sc.close();

	}

}