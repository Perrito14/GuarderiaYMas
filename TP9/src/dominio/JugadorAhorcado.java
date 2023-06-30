package dominio;

public class JugadorAhorcado {
	private String nombre;
	private String palabra;
	private char palabraEnArray[] = palabra.toCharArray();
	private int vidas = 6;
	
	public JugadorAhorcado(String nombre, String palabra) {
		this.nombre = nombre;
		this.palabra = palabra;
	}
	
	public String mostrarAyuda() {
		String palabraAMostrar = "";
		char[] palabraEnArray = this.palabraEnArray;
		for(int i = 0; i < palabraEnArray.length; i++) {
			palabraEnArray[i] = '_';
			palabraAMostrar += " " + palabraEnArray[i];
		}
		return palabraAMostrar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public String getPalabra() {
		return palabra;
	}
	
	
	
	
}


