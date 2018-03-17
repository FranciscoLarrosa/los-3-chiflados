/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.animales;

import interfaces.Mascota;

/**
 *
 * @author User
 */
public class Gato extends AnimalesConPatas implements Mascota {
    
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Gato (){
        
    }
    public Gato(String nombre){
        this.nombre = nombre;
    }
    
    public void jugar(){
        System.out.println("jugando gato");
    }
    
     
    public void comer(){
        
        System.out.println("come ratas");
        //as
    }
}
