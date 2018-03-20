
package test.animales;

import interfaces.*;

public class Gato extends AnimalesConPatas implements Mascota, EmisorSonido {

    String nombre;
            String sonido = "MIAU";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gato() {

    }

    public Gato(String nombre) {
        this.nombre = nombre;
        this.sonido = "Miau";
    }
    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    public void jugar() {
        System.out.println("jugando gato");
    }

    public void comer() {

        System.out.println("come ratas");
        //as
    }

    @Override
    public void emitirSonido() {
        System.out.println(this.sonido);
    }

    @Override
    public int compareTo(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
