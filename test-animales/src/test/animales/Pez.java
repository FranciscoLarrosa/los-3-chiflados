
package test.animales;

import interfaces.Mascota;

public class Pez extends Animal implements Mascota {

    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
            
    
    public Pez() {

    }

    public void jugar() {
        System.out.println("jugando pez");
    }

    public Pez(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("come algas");
    }
    
    @Override
    public void emitirSonido(){
        System.out.println("Sonido pez");
    }

    @Override
    public int compareTo(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
