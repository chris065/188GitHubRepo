/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import java.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamie
 */
public class FormatTimeTest {
    
    public FormatTimeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of formatTime method, of class FormatTime.
     */
    @Test
    public void testFormatTime() {
        System.out.println("formatTime");
        LocalDateTime ldt = null;
        FormatTime instance = new FormatTime();
        String expResult = "";
        String result = instance.formatTime(ldt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of suffix method, of class FormatTime.
     */
    @Test
    public void testSuffix() {
        System.out.println("suffix");
        int month = 0;
        FormatTime instance = new FormatTime();
        String expResult = "";
        String result = instance.suffix(month);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
