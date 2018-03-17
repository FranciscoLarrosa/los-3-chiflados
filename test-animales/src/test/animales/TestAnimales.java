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
        b.setNombre("kiki");
        c.setNombre("cucu");
        a.setPatas(8);
        c.setPatas(4);
        Mascota[] mascotas = new Mascota[4];
        mascotas[0] = new Pez();
        mascotas[1] = new Pez();
        mascotas[2] = new Gato();
        mascotas[3] = new Gato();

        System.out.println(a.getPatas() + "." + c.getPatas());

        for (int i = 0; i < mascotas.length; i++) {

            miMascota(mascotas[i]);

        }
    }

    public static void muestraQueCome(Animal d) {

        d.comer();

    }

    public static void miMascota(Mascota a) {
        a.jugar();
    }

    //aaaaa
}
