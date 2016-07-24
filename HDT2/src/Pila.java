/**
 * Clase Pila
 * @author Ramón Samayoa, Diego Valdez
 * @version 23.207.2016
 */
import java.util.Vector;

/**
 *
 * @author Diego Valdez
 */
public class Pila implements iPila{
    /**
     * atributos
     * vec, cant
     */
    private Vector vec;
    
    /**
     * Constructor de la clase pila, donde se le asignan valores iniciales
     */
    public Pila(){
        vec = new Vector(20,5);
    }
  
    /**
     * @param vecto : Vector
     * Recibe el vector tipo Vector
     */
    public void setVec(Vector vecto) {
        this.vec = vecto;
    }
    
    /**
     * 
     * @return vec : Vector
     * Devuelve el vector
     */
    public Vector getVec() {
        return vec;
    }

    @Override
    public void push(String num) {
        vec.addElement(num);
    }

    @Override
    public String pop() {
        int pos ;
        String num;
        pos = vec.size();
        num = (String) vec.elementAt(pos-1);
        vec.removeElementAt(pos-1);
        return num;
    }

    

    
}
