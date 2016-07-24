/**
* Clase Menu
* @author Ramón Samayoa, Diego Valdez
* @version 23.07.2016
*/
import java.util.Scanner;
public class Menu {
/**
*@param args 
*Menu principal.
*/
    public static void main(String[] args){
        String snum1, snum2;
        Pila stk = new Pila();
        Calculador calc = new Calculador();
        String text="";
        Scanner  Teclado=new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Bienvenido a la Hoja de Trabajo 2");
        int opcion=0;
        while (opcion != 2) {
            System.out.println("--------------------------------------");
            System.out.println("1. Entrar al programa");
            System.out.println("2. Salir");
            System.out.println("--------------------------------------");
            opcion =Integer.parseInt(Teclado.nextLine());
            while ((opcion != 2) && (opcion != 1)) {
                System.out.println("--------------------------------------");
                System.out.println("Porfavor elegir opcion con 1 o 2");
                System.out.println("1. Entrar al programa");
                System.out.println("2. Salir");
                System.out.println("--------------------------------------");
                opcion =Integer.parseInt(Teclado.nextLine());
            }
            if (opcion== 1) {
                String c;
                Lector lec = new Lector();
                // Recuerde cambiar la dirección de su archivo de texto con el siguiente formatocde ejemplo
                text= lec.leer("C:\\Users\\Diego Valdez\\Desktop\\datos.txt");
                for (int i=0; i <= text.length()-1; i++){
                    c = ""+ text.charAt(i); 
                    if ((!c.equals("*") )&& (!c.equals("/"))&& (!c.equals("+"))&& (!c.equals("-"))){
                        if (!c.equals(" ") ){
                            stk.push(c);
                        }
                    }else{
                        snum1 = stk.pop();
                        snum2 = stk.pop();
                        stk.push(calc.calculo(snum1, snum2, c));
                    }
                }
                System.out.println("El resultado es: " + stk.pop());
            }
        }
        System.out.println("Hasta Luego");
    }
}