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
public abstract class Animal {
    private int patas;
     public Animal(){
         
     }
     public Animal(int patas){
         
     }
     public abstract void comer();
     
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}
