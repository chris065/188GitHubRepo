/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamie
 */
public class TaskObjectTest {
    
    public TaskObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getID method, of class TaskObject.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        TaskObject instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExpectedTime method, of class TaskObject.
     */
    @Test
    public void testGetExpectedTime() {
        System.out.println("getExpectedTime");
        TaskObject instance = null;
        int expResult = 0;
        String result = instance.getExpectedTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDelay method, of class TaskObject.
     */
    @Test
    public void testGetDelay() {
        System.out.println("getDelay");
        TaskObject instance = null;
        boolean expResult = false;
        boolean result = instance.getDelay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskName method, of class TaskObject.
     */
    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        TaskObject instance = null;
        String expResult = "";
        String result = instance.getTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class TaskObject.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        TaskObject instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAssignedTo method, of class TaskObject.
     */
    @Test
    public void testGetAssignedTo() {
        System.out.println("getAssignedTo");
        TaskObject instance = null;
        String expResult = "";
        String result = instance.getAssignedTo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrefs method, of class TaskObject.
     */
    @Test
    public void testGetPrefs() {
        System.out.println("getPrefs");
        TaskObject instance = null;
        String expResult = "";
        String result = instance.getPrefs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTalents method, of class TaskObject.
     */
    @Test
    public void testGetTalents() {
        System.out.println("getTalents");
        TaskObject instance = null;
        String expResult = "";
        String result = instance.getTalents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPriority method, of class TaskObject.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        TaskObject instance = null;
        String expResult = "";
        String result = instance.getPriority();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TaskObject.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TaskObject instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
