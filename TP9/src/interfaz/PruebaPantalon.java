package interfaz;
import java.util.Scanner;
import dominio.Pantalon;
import dominio.Jeans;

public class PruebaPantalon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String marca = "";
		String talle = "";
		String color = "";
		int precio = 0;
		
		Jeans ArrayDeJeans = new Jeans(4);
		
		Pantalon[] jeans = new Pantalon[3];
		
		for(int i = 0; i < jeans.length; i++) {
			
			System.out.println("Ingrese la marca del Jean");
			marca = scanner.next();
			
			System.out.println("Ingrese el talle del Jean");
			talle = scanner.next();
			
			System.out.println("Ingrese el color del Jean");
			color = scanner.next();
			
			System.out.println("Ingrese el precio del Jean");
			precio = scanner.nextInt();
			
			jeans[i] = new Pantalon(marca, talle, color, precio);
//			
			ArrayDeJeans.añadirJean(jeans[i]);
		}
		
		for(int i = 0; i < jeans.length; i++) {
			System.out.println(jeans[i].toString());
		}
		
		for(int i = 0; i < jeans.length; i++) {
			jeans[i].incrementarPrecio(20);
			System.out.println(jeans[i].toString());
		}
		
		scanner.close();
	}

}


//for(int i = 0; i < jeans.length; i++) {
//
//System.out.println("Ingresa la marca del pantalon");
//marca = scanner.next();
//
//System.out.println("Ingresa el local del pantalon");
//local = scanner.next();
//
//System.out.println("Ingresa el color del pantalon");
//color = scanner.next();
//
//System.out.println("Ingresa el precio del pantalon");
//precio = scanner.nextInt();
//
//jeans[i] = new Pantalon(marca, local, color, precio);
//}
//
//for(int i = 0; i < jeans.length; i++) {
//System.out.println(jeans[i].getMarca());
//}
//
//System.out.println(jeans[1].getColor());

//for(int i = 0; i < jeans.length)
//