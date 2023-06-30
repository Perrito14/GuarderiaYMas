package interfaz;
import java.util.Scanner;
import dominio.ColoresGatos;
import dominio.Gato;
import dominio.OpcionesGuarderia;
import dominio.Guarderia;

public class PruebaGuarderia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nombreGuarderia = "Guarderia Rey";
	    int limiteGuarderia = 10;
//	    OpcionesGuarderia opcion = OpcionesGuarderia.INGRESAR_GATO;
	    int ingreso = 0;
//	    
		Guarderia guarderia = new Guarderia(nombreGuarderia, limiteGuarderia);
//		
//		Gato gato1 = new Gato ("Pepe", 2.0, ColoresGatos.ATIGRADO);
//	    guarderia.ingresar(gato1);
//		
//		Gato gato2 = new Gato ("Pepita", 4.5, ColoresGatos.MARMOLADO);
//	    guarderia.ingresar(gato2);
//	    
//		Gato gato3 = new Gato ("Roma", 5.0, ColoresGatos.TRICOLOR);
//	    guarderia.ingresar(gato3);
//	
//	    System.err.println("Bienvenido a la guarderia " + guarderia.getNombre());
//	    
//	    while (opcion != OpcionesGuarderia.SALIR) {
//	    System.out.println("---------------------------------");
//	    do {
//	    	System.out.println("Que desea hacer? ");
//	    	for (int i = 0; i < OpcionesGuarderia.values().length; i++) {
//	    		System.out.println("Ingrese " + (i+1) + " para " + OpcionesGuarderia.values()[i]);
//	    	}
//	    	ingreso = teclado.nextInt();
//	    	if (ingreso > 0 && ingreso <= OpcionesGuarderia.values().length) {
//	    		opcion = OpcionesGuarderia.values()[ingreso-1];
//	    	}
//	    } while (ingreso <= 0 || ingreso > OpcionesGuarderia.values().length);
//	    
//	    
//	    switch (opcion) {
//	    
//	    case INGRESAR_GATO:
//	    	
//	    	Gato gatoRandom = null;
//	    	if (guarderia.ingresar(gatoRandom) == false) {
//		     System.out.println("\nLo sentimos... La guarderia esta llena, no pudimos ingresar a su gato...");
//	    	}
//	    	else {
//	    	
//	    	System.out.println("Ingrese el nombre de su gato");
//	    	String nombreGato = teclado.next();
//	    	System.out.println("Ingrese el peso de su gato");
//	    	double peso = teclado.nextDouble();
//	    	System.out.println("Ingrese el color de su gato");
//	    	
//	    	ColoresGatos colorGato = mostrarIngresoColores(teclado);
//	    	Gato gato = new Gato(nombreGato, peso, colorGato);
//	    	guarderia.ingresar(gato);
//	    	}
//	    	break;
//	    case BUSCAR_POR_NOMBRE:
//	    	System.out.println("Ingrese el nombre de su michi: ");
//	    	String nombreIngresado = teclado.next();
//	    if (guarderia.buscarPorNombre(nombreIngresado) == null) {
//	    	System.out.println("No se encontro al gato");
//	    } else {
//	    	System.out.println(guarderia.buscarPorNombre(nombreIngresado).toString());
//	    }
//	    break;
//	    
//	    case CANTIDAD_GATOS:
//	    	System.out.println("La cantidad de gatos es de: " + guarderia.contadorGatos());
//	    break;
//	    
//	    case FILTRAR_POR_COLOR:
//	    	System.out.println("Por que color desea filtrar?");
//	    	ColoresGatos colorFiltro = mostrarIngresoColores(teclado);
//	    System.out.println(guarderia.filtrarPorColor(colorFiltro));
//	    break;
//	    
//	    case OBTENER_MAYOR_PESO:
//	    	System.out.println("El michi de mayor peso es: " + guarderia.buscarMayorPeso());
//	    break;
//	    
//	    case OBTENER_MENOR_PESO:
//	    	System.out.println("El michi de menor peso es: " + guarderia.buscarMenorPeso());
//	    break;
//	    
//	    case PROMEDIO_PESO:
//	    	System.out.println("El promedio de peso de los gatos es: " + guarderia.promedioPesoGatos());
//	    break;
//	    case RETIRAR_GATO:
//	    	System.out.println("Ingrese el nombre del gato que quiere retirar");
//	    	String nombreIngresoGato = teclado.next();
//	    	
//	    	if (guarderia.buscarPorNombre(nombreIngresoGato) != null) {
//	    		guarderia.devolver(guarderia.buscarPorNombre(nombreIngresoGato));
//	    	} else {
//	    		System.out.println("El gato buscado no se encontro.");
//	    	}
//	    	break;
//	    case SALIR:
//	    	System.out.println("Gracias por su visita!");
//	   }
//	    System.out.println("\n");
//	    } 
	    
	    Gato[] gato = new Gato[3];
        
        for (int i = 0; i < gato.length; i++) {
            System.out.println("Ingrese el nombre de su gato");
            String nombreGato = teclado.next();

            System.out.println("Ingrese el peso de su gato");
            double peso = teclado.nextDouble();
            
            System.out.println("Ingrese el color de su gato");
            
            ColoresGatos colorGato = mostrarIngresoColores(teclado);
            
            gato[i] = new Gato(nombreGato, peso, colorGato);
            
            guarderia.ingresar(gato[i]);
            
            
      
        }
        System.out.println("PROMEDIO " + guarderia.promedioPesoGatos());
        System.out.println("Mayor peso " + guarderia.buscarMayorPeso());
//        System.out.println("Menor peso " + guarderia.buscarMenorPeso());
        System.out.println("Filtrar por color " + guarderia.filtrarPorColor(ColoresGatos.ATIGRADO));
        System.out.println("Mostrar gatos filtrados " + guarderia.mostrarGatosFiltrados(ColoresGatos.ATIGRADO));
        System.out.println("PROMEDIO GATOS FILTRADOS " + guarderia.mostrarPromedioPesoGatosFiltrados(ColoresGatos.ATIGRADO));
        System.out.println(guarderia.toString());
        guarderia.devolver("PEPE");
        guarderia.reorganizar();
        System.out.println("ARRAY SIN PEPE :( " + guarderia.toString());
//        for(int i = 0; i < gato.length; i++) {
//        	Gato[] gatosAtigrados = new Gato[gato.length];
//        	gatosAtigrados = guarderia.filtrarPorColor(ColoresGatos.ATIGRADO);
//        	System.out.println(gatosAtigrados[i].toString());
//        }
       
//        
//        for (int i = 0; i < guarderia.gatos.length; i++) {
//        if (guarderia.gatos[i] != null) {
//            System.out.println(guarderia.gatos[i].toString());
//        }
//        }
//        
//          System.out.println(gato[2].getNombre());
//          System.out.println(guarderia.gatos[4].getNombre());
	    
	    
	    
	teclado.close();
   }


	private static ColoresGatos mostrarIngresoColores(Scanner teclado) {
		int color = 0;
		ColoresGatos colorGato = ColoresGatos.BLANCO;
		do {
		for(int i = 0; i < ColoresGatos.values().length; i++) {
			System.out.println("Ingrese " + (i+1) + " para color: " + ColoresGatos.values()[i]);
		}
		color = teclado.nextInt();
		if (color >0 && color <= ColoresGatos.values().length){
			colorGato = ColoresGatos.values()[color-1];
			}
		} while (color <= 0 || color > ColoresGatos.values().length);
		return colorGato;
	}
}

