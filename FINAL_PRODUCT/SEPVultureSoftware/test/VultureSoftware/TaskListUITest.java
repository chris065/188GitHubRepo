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
public class TaskListUITest {
    
    public TaskListUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class TaskListUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TaskListUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of populateList method, of class TaskListUI.
     */
    @Test
    public void testPopulateList() {
        System.out.println("populateList");
        TaskListUI instance = new TaskListUI();
        instance.populateList();
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of searchFilter method, of class TaskListUI.
     */
    @Test
    public void testSearchFilter() {
        System.out.println("searchFilter");
        String searchTerm = "";
        TaskListUI instance = new TaskListUI();
        instance.searchFilter(searchTerm);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }
    
}
