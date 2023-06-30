package interfaz;
import java.util.Scanner;
import dominio.Concesionaria;
import dominio.Coche;

public class PruebaConcesionaria {
	public static void main(String[] args) {
		Concesionaria concesionaria = new Concesionaria("Ronki INC", 4);
		
		Coche coche1 = new Coche("Audi", "A4", 10000);
		Coche coche2 = new Coche("Audi", "A5", 20000);
		Coche coche3 = new Coche("Chevrollet", "Corsa", 40000);
		Coche coche4 = new Coche("Chevrollet", "Camaro", 100000);
		Coche coche5 = new Coche("Lamborghini", "Veneno", 250000);
	
		//Ingresar vehículo
		System.out.println(concesionaria.ingresarVehiculo(coche1));
		System.out.println(concesionaria.ingresarVehiculo(coche2));
		System.out.println(concesionaria.ingresarVehiculo(coche3));
		System.out.println(concesionaria.ingresarVehiculo(coche4));
		
		//No ingresa porque el tamaño de la concesionaria es para 4 autos
		System.out.println(concesionaria.ingresarVehiculo(coche5));
		
		System.out.println(concesionaria.mostrarVehiculos());
		
		System.out.println(concesionaria.mostrarDetalles(3));
	}
}
