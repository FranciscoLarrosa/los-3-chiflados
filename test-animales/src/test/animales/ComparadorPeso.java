
package test.animales;


public class ComparadorPeso {
    public void verificarPeso(Animal a,Animal b){
        if (a.comapareTo(b)== -1) {
            System.out.println("Elprimer animal es mas pesado q el segundo");
            
        }
        if (a.comapareTo(b)== 0) {
            System.out.println("Pesan lo mismo");
        }
        else{
            System.out.println("El segundo es mas pesado");
        }
    }
    }


