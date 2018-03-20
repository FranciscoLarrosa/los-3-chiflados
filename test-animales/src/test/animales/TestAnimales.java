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
        Mascota n = null;
        
        Mascota[] mascotasssssss = new Mascota[5];
        
        mascotasssssss[0] = new Pez();
        mascotasssssss[1] = new Pez();
        mascotasssssss[2] = new Gato();
        mascotasssssss[3] = new Gato();
        mascotasssssss[4] = new Perro();
        

    
        // EJERCICIO PARTE 5 :
        for (Mascota mascotassssss : mascotasssssss) {
            miMascota(mascotassssss);
        }
        
        // EJERCICIO PARTE 6:
        EmisorSonido[] sonidos = new EmisorSonido[5];
        
        sonidos[0] = new Perro();
        sonidos[1] = new Perro();
        sonidos[2] = new Gato();
        sonidos[3] = new Gato();
        sonidos[4] = new Gato();
        for (EmisorSonido sonido : sonidos) {
            queSonidoEmite(sonido);
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
        System.out.println("lola");

    }

   
}
