package interfaz;
import java.util.Scanner;

public class Letras {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAMANIO = 26;
		int primerCaracter = 65;
		int numero = 0;
		char Letras[] = new char[TAMANIO];

		
		for(int i = 0; i < Letras.length; i++) {
//			System.out.println("Ingresa un numero");
//			numero = scanner.nextInt();
//			System.out.println("Posicion: " + i);
			Letras[i] = (char) primerCaracter++;
		}
		
		for(int i = 1; i < Letras.length; i++) {
			System.out.println("Ingrese un numero acorde a cada letra");
			numero = scanner.nextInt();
			System.out.println(Letras[numero]);
		}
	}

}
