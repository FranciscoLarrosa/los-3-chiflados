
package test.animales;


public class Araña extends AnimalesConPatas {
    String sonido;
    public Araña() {

    }
            
            

    @Override
    public void comer() {
        
        System.out.println("come bichos");

    }
    @Override
    public String getSonido(){
        return sonido;
    }
    @Override
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
    @Override
    public void emitirSonido(){
        System.out.println("que  sonido hace una araña????");
    }

    @Override
    public int compareTo(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
