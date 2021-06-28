
package principal;

import ico.fes.herencia.Gato;
import ico.fes.herencia.Perro;


public class Principal {
    public static void main(String[] args) {
        Gato g1=new Gato("Persa", "Naranja", "Mediano", 4);
        Perro p1=new Perro("Pastor aleman", "Cafe", "Grande", 4);
        
        System.out.println("Raza: "+g1.getRaza()+" Color: "+g1.getColor()+" Tamaño: "+g1.getTamano()+" Numero de patas: "+g1.getNumeroPatas());
        System.out.println("Raza: "+p1.getRaza()+" Color: "+p1.getColor()+" Tamaño: "+p1.getTamano()+" Numero de patas: "+p1.getNumeroPatas());
    }
    
}
