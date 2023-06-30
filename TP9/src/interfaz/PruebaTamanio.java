package interfaz;
import java.util.Scanner;

public class PruebaTamanio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el tamaño de un array");
		final int TAMANIO = scanner.nextInt();
		int arrayDeEnteros[] = new int[TAMANIO];
		int suma = 0;
		int promedio = 0;
		
		for(int i = 0; i < TAMANIO; i++) {
			arrayDeEnteros[i] = (int)(Math.random() * 100) + 1;
			suma += arrayDeEnteros[i];
			promedio = suma / TAMANIO;
			System.out.println("Indice de " + i + " " + arrayDeEnteros[i] + " en la posicion: " + (i+1));
		}
		
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado del promedio es: " + promedio);
	}

}
