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
public class UserObjectTest {
    
    public UserObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUserFName method, of class UserObject.
     */
    @Test
    public void testGetUserFName() {
        System.out.println("getUserFName");
        UserObject instance = null;
        String expResult = "";
        String result = instance.getUserFName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserSName method, of class UserObject.
     */
    @Test
    public void testGetUserSName() {
        System.out.println("getUserSName");
        UserObject instance = null;
        String expResult = "";
        String result = instance.getUserSName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserUName method, of class UserObject.
     */
    @Test
    public void testGetUserUName() {
        System.out.println("getUserUName");
        UserObject instance = null;
        String expResult = "";
        String result = instance.getUserUName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class UserObject.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        UserObject instance = null;
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UserObject.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserObject instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
