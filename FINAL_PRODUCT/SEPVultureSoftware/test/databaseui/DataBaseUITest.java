/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import java.awt.event.ActionEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamie
 */
public class DataBaseUITest {
    
    public DataBaseUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class DataBaseUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DataBaseUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeLabel method, of class DataBaseUI.
     */
    @Test
    public void testSetTimeLabel() {
        System.out.println("setTimeLabel");
        DataBaseUI instance = new DataBaseUI();
        instance.setTimeLabel();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class DataBaseUI.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        DataBaseUI instance = new DataBaseUI();
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStatusLabel method, of class DataBaseUI.
     */
    @Test
    public void testSetStatusLabel() {
        System.out.println("setStatusLabel");
        DataBaseUI instance = new DataBaseUI();
        instance.setStatusLabel();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUserLabel method, of class DataBaseUI.
     */
    @Test
    public void testSetUserLabel() {
        System.out.println("setUserLabel");
        DataBaseUI instance = new DataBaseUI();
        instance.setUserLabel();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJobsLabel method, of class DataBaseUI.
     */
    @Test
    public void testSetJobsLabel() {
        System.out.println("setJobsLabel");
        DataBaseUI instance = new DataBaseUI();
        instance.setJobsLabel();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
