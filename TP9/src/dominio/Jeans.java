package dominio;

public class Jeans {
	private Pantalon[] jeans;
	
	public Jeans(int cantidadDeJeans) {
		this.jeans = new Pantalon[cantidadDeJeans];
	}
	
	public boolean añadirJean(Pantalon jean) {
		boolean existe = false;
		int i = 0;
		
		while(i < this.jeans.length && !existe) {
			if(this.jeans[i] == null) {
				this.jeans[i] = jean;
				existe = true;
			}
			i++;
		}
		
		return existe;
	}
	
	public boolean hayPantalones() {
	    for (int i = 0; i < jeans.length; i++) {
	        if (jeans[i] != null) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public void incrementarPrecio(Pantalon jean, double incremento) {
		for(int i = 0; i < jeans.length; i++) {
			jeans[i].incrementarPrecio(incremento);
		}
	}
	
}
