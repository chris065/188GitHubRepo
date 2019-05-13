/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamie
 */
public class DataBaseConnectionTest {
    
    public DataBaseConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of connect method, of class DataBaseConnection.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        DataBaseConnection instance = new DataBaseConnection();
        boolean expResult = false;
        boolean result = instance.connect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of testDisplayUserTable method, of class DataBaseConnection.
     */
    @Test
    public void testTestDisplayUserTable() throws Exception {
        System.out.println("testDisplayUserTable");
        DataBaseConnection instance = new DataBaseConnection();
        instance.testDisplayUserTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayRow method, of class DataBaseConnection.
     */
    @Test
    public void testDisplayRow() throws Exception {
        System.out.println("displayRow");
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        DataBaseConnection instance = new DataBaseConnection();
        instance.displayRow(rs, rsmd);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DataBaseConnection.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DataBaseConnection.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getURL method, of class DataBaseConnection.
     */
    @Test
    public void testGetURL() {
        System.out.println("getURL");
        DataBaseConnection instance = new DataBaseConnection();
        String expResult = "";
        String result = instance.getURL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
