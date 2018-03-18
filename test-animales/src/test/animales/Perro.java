package test.animales;

import interfaces.*;

public class Perro extends AnimalesConPatas implements Mascota, EmisorSonido {

    String nombre,sonido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Perro(){
        
    }
    public Perro(String nombre) {
        this.nombre = nombre;
        this.sonido = "GUAU GUAU";
    }
    @Override
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
    @Override
    public String getSonido(){
        return sonido;
    }
    @Override
    public void emitirSonido() {
        System.out.println(this.sonido);
    }
    @Override
    public void comer() {

        System.out.println("come carne");

    }
    @Override
    public void jugar(){
        System.out.println("Perro juega");
    }

    @Override
    public int compareTo(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   

}
