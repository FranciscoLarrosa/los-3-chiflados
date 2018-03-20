/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.animales;

import java.util.Scanner;

/**
 *
 * @author Satoru
 */
public class TestComparadorPeso {

    //EJERCICIO PARTE 7:
    public static void main(String[] args) {

        Scanner asd = new Scanner(System.in);

        Gato a = new Gato();
        Gato b = new Gato();
        a.setPeso(asd.nextInt());
        b.setPeso(asd.nextInt());
        ComparadorPeso d = new ComparadorPeso();
        d.verificarPeso(a, b);
    }
}

