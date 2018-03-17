/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.animales;

/**
 *
 * @author User
 */
public class Araña extends AnimalesConPatas {
    String sonido;
    public Araña() {

    }

    @Override
    public void comer() {
        
        System.out.println("come bichos");

    }
    @Override
    public String getSonido(){
        return sonido;
    }
    @Override
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
    @Override
    public void emitirSonido(){
        System.out.println("que  sonido hace una araña????");
    }

}
