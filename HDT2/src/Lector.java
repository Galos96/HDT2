import java.io.BufferedReader;
import java.io.FileReader;

/**
* Clase Lector
* @version 23.07.2016
* @author Ramón Samayoa, Diego Valdez
*/

public class Lector {
    
    /**
    * atributos
    * texto
    */
    private String texto; 
    /**
     * Constructor de la clase Lector
     */
    public Lector(){
  
    }
    
    /**
    * @param texto : String
    * recibe el texto
    */
    public void setTexto(String texto){
            this.texto = texto;
    }

    /**
    * @return texto : String
    * Devuelve el texto
    */
    public String getTexto(){
            return texto;
    }
    
    /**
    * @param direc: String
    * @return String 
    * Retorna lo leido
    */
    public String leer(String direc){
        /**
         * Programa editado de Curso Java #28 por Nekszer López en https://www.youtube.com/watch?v=0ceHv2niNR4
         */
        try{
            BufferedReader ar = new BufferedReader(new FileReader(direc));
            String cadena;
            String ttex = "";
            while ((cadena=ar.readLine()) != null){
                ttex = ttex + cadena;
            }
            this.texto = ttex;
        }catch(Exception e){ System.out.println("Archivo no encontrado");}
        return this.texto; 
    }
    
    /**
    * @return String 
    * devuele la descripcion
    */
    @Override
    public String toString(){
            String texto = "lector de archivos .text";
            return texto;
    }
    
}