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
        Vector vecto = null;
        Pila instance = new Pila();
        instance.setVec(vecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVec method, of class Pila.
     */
    @Test
    public void testGetVec() {
        System.out.println("getVec");
        Pila instance = new Pila();
        Vector expResult = [];
        Vector result = instance.getVec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String num = "";
        Pila instance = new Pila();
        instance.push(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Pila instance = new Pila();
        String expResult = "";
        String result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
