package boletinfor;

public class Ejercicio04 {
	public static void main(String[] args) {
		// Inicializamos la variable para acumular la suma
		int suma = 0;
		// Empezamos con el primer número impar
		int num = 1;

		// Bucle que se repite 10 veces
		for (int contador = 1; contador <= 10; contador++) {
			// Sumamos el número actual
			suma += num;
			// Pasamos al siguiente número impar
			num += 2;
		}

		// Mostramos el resultado final
		System.out.println("La suma final es: " + suma);
	}
}
