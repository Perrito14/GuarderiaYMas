package interfaz;
import java.util.Scanner;
import dominio.Sistema;
import dominio.Usuario;

public class PruebaSistema {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa cuantas personas entran en el sistema");
		int tamanio = scanner.nextInt();
		
		Sistema sistema = new Sistema("Sistema de asistencias UNLAM", tamanio);
		Usuario[] usuarios = new Usuario[tamanio];
		String nombre = "";
		String contraseña = "";
		
		for(int i = 0; i < usuarios.length; i++) {
			
			System.out.println("Ingrese su nombre para registrarse");
			nombre = scanner.next();
			
			System.out.println("Ingrese su contrasenia para registrarse");
			contraseña = scanner.next();
			
			usuarios[i] = new Usuario(nombre, contraseña);
			
			sistema.registrar(usuarios[i]);
			
		}
		
		for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].toString());
        }
		
		
		System.out.println(sistema.loguearUsuario("Ronki", "Ronki123"));
		
		System.out.println(sistema.loguearUsuario("Papu", "Papu123"));
		
		System.out.println(sistema.loguearUsuario("Ronki", "Papu123"));
		
		System.out.println(sistema.loguearUsuario("Papu", "Ronki123"));
		
		System.out.println(sistema.loguearUsuario("Papu", "Ronasdki123"));
	}

}

//for(int i = 0; i < tamanio; i++) {
//System.out.println("Ingresa el nombre de usuario");
//String usuario = scanner.nextLine();
//System.out.println("Ingresa la contraseña del usuario");
//String contraseña = scanner.nextLine();
//
//}