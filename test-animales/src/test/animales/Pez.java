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
public class Pez extends Animal implements Mascota {

    public Pez() {

    }

    @Override
    public void comer() {
        System.out.println("come algas");
    }
}
