package dominio;

public class Gato {

    private String nombre;
    private double peso;
    private ColoresGatos color;


    public Gato(String nombre, double peso, ColoresGatos color) {
        
        this.nombre = nombre;
        this.peso = peso;
        this.color = color;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public double getPeso() {
        return peso;
    }
    
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    public ColoresGatos getColor() {
        return color;
    }
    
    
    public void setColor(ColoresGatos color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Gatos [nombre=" + nombre + ", peso=" + peso + ", color=" + color + "]";
    }
    

    
    
    
}
