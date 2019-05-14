/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamie
 */
public class DataBaseToolkitTest {
    
    public DataBaseToolkitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of deleteUser method, of class DataBaseToolkit.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        String userName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.deleteUser(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class DataBaseToolkit.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        String userID = "";
        String userFName = "";
        String userSName = "";
        String userUName = "";
        String userPWord = "";
        String role = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.updateUser(userID, userFName, userSName, userUName, userPWord, role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkUser method, of class DataBaseToolkit.
     */
    @Test
    public void testCheckUser() {
        System.out.println("checkUser");
        String userToCheck = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.checkUser(userToCheck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkPass method, of class DataBaseToolkit.
     */
    @Test
    public void testCheckPass() {
        System.out.println("checkPass");
        String passToCheck = "";
        String userName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.checkPass(passToCheck, userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDetails method, of class DataBaseToolkit.
     */
    @Test
    public void testGetUserDetails() {
        System.out.println("getUserDetails");
        String userName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        ArrayList expResult = null;
        ArrayList result = instance.getUserDetails(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of countRows method, of class DataBaseToolkit.
     */
    @Test
    public void testCountRows() throws Exception {
        System.out.println("countRows");
        String tableName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        int expResult = 0;
        int result = instance.countRows(tableName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addNewUser method, of class DataBaseToolkit.
     */
    @Test
    public void testAddNewUser() {
        System.out.println("addNewUser");
        String techFName = "";
        String techSName = "";
        String techUName = "";
        String techPassword = "";
        String role = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.addNewUser(techFName, techSName, techUName, techPassword, role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllUsers method, of class DataBaseToolkit.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        DataBaseToolkit instance = new DataBaseToolkit();
        ArrayList expResult = null;
        ArrayList result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of countJobs method, of class DataBaseToolkit.
     */
    @Test
    public void testCountJobs() {
        System.out.println("countJobs");
        DataBaseToolkit instance = new DataBaseToolkit();
        int expResult = 0;
        int result = instance.countJobs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteJob method, of class DataBaseToolkit.
     */
    @Test
    public void testDeleteJob() {
        System.out.println("deleteJob");
        int jobNumber = 0;
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.deleteJob(jobNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addNewJob method, of class DataBaseToolkit.
     */
    @Test
    public void testAddNewJob() {
        System.out.println("addNewJob");
        String jobMotorName = "";
        String jobDateCollected = "";
        String jobParts = "";
        String jobClient = "";
        String jobMan = "";
        String jobReturnDate = "";
        String jobDate = "";
        String jobCheck = "";
        int jobTaskID = 0;
        String expectedTime = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.addNewJob(jobMotorName, jobDateCollected, jobParts, jobClient, jobMan, jobReturnDate, jobCheck, jobTaskID, expectedTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllJobs method, of class DataBaseToolkit.
     */
    @Test
    public void testGetAllJobs() {
        System.out.println("getAllJobs");
        DataBaseToolkit instance = new DataBaseToolkit();
        ArrayList expResult = null;
        ArrayList result = instance.getAllJobs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTask method, of class DataBaseToolkit.
     */
    @Test
    public void testGetTask() {
        System.out.println("getTask");
        String taskName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        ArrayList expResult = null;
        ArrayList result = instance.getTask(taskName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class DataBaseToolkit.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        boolean delayed = false;
        String name = "";
        String type = "";
        String assigned = "";
        String expectedTime = "";
        String prefrences = "";
        String talents = "";
        String priority = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.addTask(delayed, name, type, assigned, expectedTime, prefrences, talents, priority);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTechs method, of class DataBaseToolkit.
     */
    @Test
    public void testGetAllTechs() {
        System.out.println("getAllTechs");
        DataBaseToolkit instance = new DataBaseToolkit();
        ArrayList expResult = null;
        ArrayList result = instance.getAllTechs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateTasks method, of class DataBaseToolkit.
     */
    @Test
    public void testUpdateTasks() {
        System.out.println("updateTasks");
        int taskID = 0;
        boolean delayed = false;
        String name = "";
        String type = "";
        String assigned = "";
        String expectedTime = "";
        String prefrences = "";
        String talents = "";
        String priority = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.updateTasks(taskID, delayed, name, type, assigned, expectedTime, prefrences, talents, priority);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTasks method, of class DataBaseToolkit.
     */
    @Test
    public void testGetAllTasks() {
        System.out.println("getAllTasks");
        DataBaseToolkit instance = new DataBaseToolkit();
        ArrayList expResult = null;
        ArrayList result = instance.getAllTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkTechExsistsForTask method, of class DataBaseToolkit.
     */
    @Test
    public void testCheckTechExsistsForTask() {
        System.out.println("checkTechExsistsForTask");
        String techName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        boolean expResult = false;
        boolean result = instance.checkTechExsistsForTask(techName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTasksForTech method, of class DataBaseToolkit.
     */
    @Test
    public void testGetTasksForTech() {
        System.out.println("getTasksForTech");
        String techName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        ArrayList expResult = null;
        ArrayList result = instance.getTasksForTech(techName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of countCustomers method, of class DataBaseToolkit.
     */
    @Test
    public void testCountCustomers() {
        System.out.println("countCustomers");
        DataBaseToolkit instance = new DataBaseToolkit();
        int expResult = 0;
        int result = instance.countCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomers method, of class DataBaseToolkit.
     */
    @Test
    public void testGetAllCustomers() {
        System.out.println("getAllCustomers");
        DataBaseToolkit instance = new DataBaseToolkit();
        ArrayList expResult = null;
        ArrayList result = instance.getAllCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class DataBaseToolkit.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        String custUName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        String expResult = "";
        String result = instance.getCustomer(custUName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addNewCustomer method, of class DataBaseToolkit.
     */
    @Test
    public void testAddNewCustomer() {
        System.out.println("addNewCustomer");
        String custUName = "";
        String custFName = "";
        String custSName = "";
        DataBaseToolkit instance = new DataBaseToolkit();
        instance.addNewCustomer(custUName, custFName, custSName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
