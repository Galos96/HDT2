/**
* Clase Calculador
* @version 23.07.2016
* @author Ramón Samayoa, Diego Valdez
*/
public class Calculador {
    
    /**
     * Constructor de la clase Lector
     */
    public Calculador(){
  
    }
    
    /**
     *
     * @param sn1:String
     * @param sn2:String
     * @param sgn:String
     * @return res:String
     * Calcula el resultado de un operador
     */
    public String calculo(String sn1, String sn2, String sgn){
        String res = "";
        int n1, n2;
        n1 = Integer.parseInt(sn1);
        n2 = Integer.parseInt(sn2);
        switch (sgn) {
            case "*":
                res = ""+(n1*n2);
                break;
            case "/":
                res = ""+(n1/n2);
                break;
            case "+":
                res = ""+(n1+n2);
                break;
            case "-":
                res = ""+(n1-n2);
                break;
        }
        return res;
    }
}
