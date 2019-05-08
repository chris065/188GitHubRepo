/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jamie
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({databaseui.DataBaseUITest.class, databaseui.DataBaseConnectionTest.class, databaseui.FormatTimeTest.class, databaseui.TaskObjectTest.class, databaseui.UserObjectTest.class, databaseui.DataBaseToolkitTest.class})
public class DatabaseuiSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
