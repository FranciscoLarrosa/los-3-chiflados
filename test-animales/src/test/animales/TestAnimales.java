package test.animales;

import java.util.Scanner;
import interfaces.*;

public class TestAnimales {

    Scanner asd = new Scanner(System.in);

    public static void main(String[] args) {

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
        // EJERCICIO PARTE 5 :
        for (int i = 0; i < mascotas.length; i++) {

            miMascota(mascotas[i]);
        }
            // EJERCICIO PARTE 6:
            EmisorSonido[] sonidos = new EmisorSonido[5];
            sonidos[0] = new Perro();
            sonidos[1] = new Perro();
            sonidos[2] = new Gato();
            sonidos[3] = new Gato();
            sonidos[4] = new Gato();
            for (int j = 0; j < sonidos.length; j++) {
                queSonidoEmite(sonidos[j]);
                
            }
        
    }

    public static void muestraQueCome(Animal d) {

        d.comer();

    }

    public static void miMascota(Mascota a) {
        a.jugar();
    }

    public static void queSonidoEmite(EmisorSonido a) {
        a.emitirSonido();
    }

    //aaaaa
    //como rompe esto papaaaaa!!!!
    
}
