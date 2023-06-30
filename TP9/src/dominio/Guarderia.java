package dominio;
import java.util.Arrays;

public class Guarderia {

	private String nombre;
	private Gato[] gatos;
	
public Guarderia(String nombreGuarderia, int cantidadMascotas) {
	this.nombre = nombreGuarderia;
	this.gatos = new Gato[cantidadMascotas];
}
	
public boolean ingresar(Gato mascota) {
	boolean ingresado = false;
	int indice = 0;
	
	while(indice < this.gatos.length && !ingresado) {
		if (this.gatos[indice] == null) {
			this.gatos[indice] = mascota;
			ingresado = true;
		}
		indice++;
	}
	return ingresado;
}


public Gato buscarPorNombre(String nombreMascota) {
	Gato gatoEncontrado = null;
	int indice = 0;
	
	while (indice < this.gatos.length && gatoEncontrado == null) {
		
		if (this.gatos[indice] != null && this.gatos[indice].getNombre().equals(nombreMascota)) {
			gatoEncontrado = this.gatos[indice];
		}
		indice++;
	}
	return gatoEncontrado;
}
public boolean devolver(String nombre) {
	boolean devuelto = false;
	int indice = 0;
	
	while (indice < this.gatos.length && devuelto == false) {
		
		if (this.gatos[indice] != null && this.gatos[indice].getNombre().equals(nombre)) {
			this.gatos[indice] = null;
			devuelto = true;
		}
		indice++;
	}
	return devuelto;
}

public void reorganizar() {
	Gato[] aux = new Gato[gatos.length];
	//En el primer for ponemos el -1 para que no trabaje de más al pedo
	for(int i = 0; i < (gatos.length -1); i++) {
		//En el segundo for ponemos el -1 para que no se pase
		for(int j = 0; j < (gatos.length -1); j++) {
			if(gatos[j] == null) {
				aux[j] = gatos[j];
				gatos[j] = gatos[j+1];
				gatos[j+1] = aux[j];
			}
		}
	}
}

public boolean alimentar(Gato mascota, int cantidadComida) {
	
	boolean alimentado = false;
	int indice = 0;
	
	while (indice < this.gatos.length && alimentado == false) {
		if (this.gatos[indice] != null && this.gatos[indice].getNombre().equals(mascota.getNombre())) {
			double nuevoPeso = this.gatos[indice].getPeso() + (cantidadComida /100);
			this.gatos[indice].setPeso(nuevoPeso);
			alimentado = true;
		}
		indice++;
	}
	return alimentado;
}

	public double obtenerPromedioDePesoDeGatosPorColor(ColoresGatos color) {
		double promedio = 0;
		double totalPeso = 0;
		int cantidadGatos = 0;
		
		for (int indice = 0; indice < this.gatos.length; indice++) {
			if (this.gatos[indice] != null && this.gatos[indice].getColor().equals(color)) {
				
				totalPeso += this.gatos[indice].getPeso();
				
				cantidadGatos++;
			}
		}
		promedio = totalPeso / cantidadGatos;
		
		return promedio;
		
	}
	
	public String buscarMayorPeso() {
		double mayorPeso = 0;
		Gato gatoDeMayorPeso = null;
		for(int i = 0; i < gatos.length; i++) {
			if(gatos[i] != null && gatos[i].getPeso() > mayorPeso) {
				mayorPeso = gatos[i].getPeso();
				gatoDeMayorPeso = gatos[i];
			}
		}
		return gatoDeMayorPeso.toString();
	}
	
	public String buscarMenorPeso() {
		double menorPeso = 0;
		Gato gatoDeMenorPeso = null;
		for(int i = 0; i < gatos.length; i++) {
			if(gatos[i] == null) {
				menorPeso = 100;
			}
			if(gatos[i] != null && gatos[i].getPeso() < menorPeso) {
				menorPeso = gatos[i].getPeso();
				gatoDeMenorPeso = gatos[i];
			}
		}
		return gatoDeMenorPeso.toString();
	}
	
	public int contadorGatos() {
		int contadorGatos = 0;
		
		for (int indice = 0; indice < this.gatos.length; indice++) {
			
			if (this.gatos[indice] != null) {
				contadorGatos++;
			}
		}
		return contadorGatos;
	}
	
	public double promedioPesoGatos() {
		
		double pesoAcumulado = 0;
		double promedio = 0;
		for (int i = 0; i < this.gatos.length; i++) {
			
			if (this.gatos[i] != null) {
				pesoAcumulado += this.gatos[i].getPeso();
			}
		}
		promedio = pesoAcumulado / this.contadorGatos();
		return promedio;
	}
	
	public Gato[] filtrarPorColor(ColoresGatos color) {
		int contadorDeGatosDeColor = 0;
		Gato[] gatosDelColorBuscado = new Gato[gatos.length];
		for(int i = 0; i < gatos.length; i++) {
			if(gatos[i] != null && gatos[i].getColor().equals(color)) {
				gatosDelColorBuscado[i] = gatos[i];
				contadorDeGatosDeColor++;
			}
		}
		return gatosDelColorBuscado;
	}
	
	public String mostrarGatosFiltrados(ColoresGatos color) {
		String gatosFiltrados = "";
		for(int i = 0; i < this.filtrarPorColor(color).length; i++) {
			if(this.filtrarPorColor(color)[i] != null) {
				gatosFiltrados += this.filtrarPorColor(color)[i].toString() + "\n";
			}
		}
		return gatosFiltrados;
	}
	
	public double mostrarPromedioPesoGatosFiltrados(ColoresGatos color) {
		Gato aux[] = this.filtrarPorColor(color);
		double suma = 0;
		int contador = 0;
		double promedio = 0;
		for(int i = 0; i < aux.length; i++) {
			if(aux[i] != null) {
				suma += aux[i].getPeso();
				contador++;
			}
		}
		promedio = suma / contador;
		return promedio;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Gato[] getGatos() {
		return gatos;
	}

	public void setGatos(Gato[] gatos) {
		this.gatos = gatos;
	}

	@Override
	public String toString() {
		return "Guarderias [nombre=" + nombre + ", gatos=" + Arrays.toString(gatos) + "]";
	}
}

