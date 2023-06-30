package dominio;

public class Concesionaria {
	String nombre;
	Coche[] coches;
	
	public Concesionaria(String nombre, int cantidadDeAutos) {
		this.nombre = nombre;
		this.coches = new Coche[cantidadDeAutos];
	}
	
	
	public boolean ingresarVehiculo(Coche coche) {
		boolean ingresado = false;
		int i = 0;
		while(i < this.coches.length && !ingresado) {
			
			if(this.coches[i] == null) {
				this.coches[i] = coche;
				ingresado = true;
			}
			
			i++;
		}
		
		return ingresado;
	}
	
	public String mostrarVehiculos() {
		String listadoVehiculos = "";
		if(this.coches.length > 0) {
			for(int i = 0; i < this.coches.length; i++) {
				listadoVehiculos += coches[i].getModelo() + " Codigo " + i + "\n";
			}
		} else {
			listadoVehiculos = "No hay vehiculos en la concesionaria";
		}
		
		return listadoVehiculos;
	}
	
	public String mostrarDetalles(int codigo) {
		String detalles = "";
		Coche cocheEncontrado = null;
		int i = 0;
		
		while(i < this.coches.length && cocheEncontrado == null) {
			if(this.coches[i] != null && i == codigo) {
				cocheEncontrado = this.coches[i];
				detalles = "Detalles del coche " + this.coches[i].toString();
			}else {
				detalles = "El coche que está intentando buscar no existe";
			}
			
			i++;
		}
		return detalles;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Coche[] getCoches() {
		return coches;
	}


	public void setCoches(Coche[] coches) {
		this.coches = coches;
	}
	
	
	
//	Mostrar detalle de un código particular. Se debe ingresar el código, y se
//	muestra por pantalla toda la información que se dispone del vehículo
	
	
	
}
