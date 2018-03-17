/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.animales;

/**
 *
 * @author Satoru
 */
public class TestComparadorPeso {
    //EJERCICIO PARTE 7:
    public static void main(String[] args) {
        Gato a = new Gato();
        Gato b = new Gato();
        a.setPeso(100);
        b.setPeso(90);
        ComparadorPeso d = new ComparadorPeso();
        d.verificarPeso(a, b);
    }
}
