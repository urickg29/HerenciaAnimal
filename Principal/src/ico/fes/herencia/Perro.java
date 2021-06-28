
package ico.fes.herencia;


public class Perro extends Animal{
  
    private String raza;
    private String color;
    private String tamano;

    public Perro() {
    }
    
    public void hablar(){
        System.out.println("Guau");
    }
    
    public Perro(String raza, String color, String tamano, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
        this.color = color;
        this.tamano = tamano;
    }

    public Perro(String raza, String color, String tamano) {
        this.raza = raza;
        this.color = color;
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
  
    
}
