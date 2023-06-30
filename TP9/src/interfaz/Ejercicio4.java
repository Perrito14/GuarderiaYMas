package interfaz;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAMANIO = 3;
		String arrayString[] = new String[TAMANIO];
		float arrayFloat[] = new float[TAMANIO];
		String resultado = "";
		
		for(int i = 0; i< TAMANIO; i++) {
			System.out.println("Ingresa el nombre del alumno");
			arrayString[i] = scanner.next();
			
			System.out.println("Ingrese la nota del alumno " + arrayString[i]);
			arrayFloat[i] = scanner.nextFloat();
		}
		
		for(int i = 0; i < arrayString.length; i++) {
			if(arrayFloat[i] >= 7) {
				resultado = "PROMOCIONADO";
			}else if(arrayFloat[i] >= 4 && arrayFloat[i] < 7) {
				resultado = "APROBADO";
			} else {
				resultado = "DESAPROBADO";
			}
			
			System.out.println("El alumno " + arrayString[i] + " ha " + resultado);
		}
		
	}

}
