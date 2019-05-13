/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamie
 */
public class AllocateATaskUITest {
    
    public AllocateATaskUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class AllocateATaskUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AllocateATaskUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of populateList method, of class AllocateATaskUI.
     */
    @Test
    public void testPopulateList() {
        System.out.println("populateList");
        AllocateATaskUI instance = new AllocateATaskUI();
        instance.populateList();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of populateTechnicianList method, of class AllocateATaskUI.
     */
    @Test
    public void testPopulateTechnicianList() {
        System.out.println("populateTechnicianList");
        AllocateATaskUI instance = new AllocateATaskUI();
        instance.populateTechnicianList();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectedRadioValue method, of class AllocateATaskUI.
     */
    @Test
    public void testSelectedRadioValue() {
        System.out.println("selectedRadioValue");
        AllocateATaskUI instance = new AllocateATaskUI();
        String expResult = "";
        String result = instance.selectedRadioValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
