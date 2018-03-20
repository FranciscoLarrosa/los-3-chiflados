
package test.animales;
import interfaces.*;



public abstract class AnimalesConPatas extends Animal implements EmisorSonido {
    
    int patas;

    public int getPatas() {
        return patas;
    }
    public abstract void comer();
    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    
}

