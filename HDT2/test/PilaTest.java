/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramon
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setVec method, of class Pila.
     */
    @Test
    public void testSetVec() {
        System.out.println("setVec");
        Vector vecto = new Vector(20,5); //Se crea un vector nuevo
        Pila instance = new Pila(); //Se inicia un objeto
        instance.setVec(vecto); //Se envia el vector al objeto
        Vector result = instance.getVec(); //Se extrae el valor real
        assertEquals(vecto, result); //Se comparan los valores
    }

    /**
     * Test of getVec method, of class Pila.
     */
    @Test
    public void testGetVec() {
        System.out.println("getVec");
        Pila instance = new Pila(); //Instancia el objeto
        Vector expResult = new Vector(20,5); //Pongo mi valor esperado
        Vector result = instance.getVec(); //Obtengo el valor real
        assertEquals(expResult, result); //Se comparan los valores
    }

    /**
     * Test of push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String num = "1"; //Se coloca el valor "1"
        Pila instance = new Pila(); //Instancia el objeto
        instance.push(num); //Se hace push al valor 
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Pila instance = new Pila(); //Instancia el objeto
        instance.push("1"); //Se hace push al valor "1"
        String expResult = "1"; //Se coloca el valor que se espera
        String result = instance.pop(); //Se obtiene el valor real
        assertEquals(expResult, result); //Se comparan los valores
    }
    
}
