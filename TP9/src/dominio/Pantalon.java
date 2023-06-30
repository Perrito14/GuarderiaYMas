package dominio;

public class Pantalon {
	private String marca;
	private String talle;
	private String color;
	private double precio;
	
	
	public Pantalon(String marca, String talle, String color, double precio) {
		this.marca = marca;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
	}
	
	public double incrementarPrecio(double incremento) {
		this.precio += (this.precio * incremento / 100);
		return this.precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTalle() {
		return talle;
	}


	public void setTaller(String talle) {
		this.talle = talle;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Pantalon [marca=" + marca + ", talle=" + talle + ", color=" + color + ", precio=" + precio + "]";
	}
	
	
	
	
	
}


