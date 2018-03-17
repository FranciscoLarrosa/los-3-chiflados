/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.animales;

import java.util.Scanner;
import interfaces.Mascota;

/**
 *
 * @author User
 */
public class TestAnimales {

    
        Scanner asd = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Araña a = new Araña();
        Pez b = new Pez();
        Gato c = new Gato();
        muestraQueCome(a);
        muestraQueCome(b);
        muestraQueCome(c);
        
        a.setPatas(8);
        c.setPatas(4);
        b.jugar();
        c.jugar();
        
        System.out.println(a.getPatas()+"."+c.getPatas());
    }
            
       
        public static void miMascota(Mascota a ){
            Mascota b = null;
            b = (Gato)a; 
            b.jugar();
            
            
            
        }
                public static void muestraQueCome(Animal d){
            
           d.comer();
            
        }
        //aaaaa
    }


