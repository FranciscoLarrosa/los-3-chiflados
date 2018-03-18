
package test.animales;


public class ComparadorPeso {
    public void verificarPeso(Animal a,Animal b){
        if (a.comapareTo(b)== -1) {
            System.out.println("Elprimer animal es mas pesado q el segundo");
            
        }
        if (a.comapareTo(b)== 0) {
            System.out.println("Pesan lo mismo");
        }
        if (a.comapareTo(b)== 1) {
            System.out.println("el segundo es mas pesado");
        }
    }
    }


