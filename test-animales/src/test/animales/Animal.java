/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.animales;
import interfaces.EmisorSonido;

/**
 *
 * @author User
 */
public abstract class Animal implements EmisorSonido{
    
     public Animal(){
         
     }
     public Animal(int patas){
         
     }
     public abstract void comer();
     
     public abstract void emitirSonido();
     
    
    
    
}
