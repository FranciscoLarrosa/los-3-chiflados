/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.animales;

import java.util.Scanner;

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
        Animal a = new Araña();
        Animal b = new Pez();
        Animal c = new Gato();
        muestraQueCome(a);
<<<<<<< Updated upstream
        muestraQueCome(b);
        muestraQueCome(c);
=======
         muestraQueCome(b);
         muestraQueCome(c);

>>>>>>> Stashed changes
    }
            
       String d =asd.next();
    
        public static void muestraQueCome(Animal d){
            
           d.comer();
            
        }
        
    }


