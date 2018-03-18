package test.animales;

import interfaces.Comparable;
//NO SE COMO CARAJOS HACER ACA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! DIOOS MIO JAJAJA NO PUTA IDEA 
public abstract class Animal implements Comparable {

    int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Animal() {

    }

    public Animal(int patas) {

    }

    public abstract void comer();

    public abstract void emitirSonido();
    
  
    public int comapareTo(Animal a) {
        if (this.peso < a.peso) {
            return -1;
        }
        if (this.peso == a.peso) {
            return 0;
        }
        return 1;
    }

}
