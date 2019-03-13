/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import java.sql.*;
import java.util.*;
/**
 *
 * @author Chris Bennett
 */
public class DataBaseToolkit 
{
    
    private ArrayList allJobs, allUsers; 
    
    private final DataBaseConnection connection;
    
    public DataBaseToolkit(DataBaseConnection connection)
    {
        this.connection = connection;
        
        connection.connect();
        allJobs = new ArrayList<String>();
        allUsers = new ArrayList<String>();
    }
    
    public boolean checkUser(String userToCheck)
    {
        return false;
    }
    
    public boolean checkPass(String passToCheck)
    {
        return false;
    }
    
    public String getUserDetails(String userName)
    {
        if(!checkUser(userName))
        {
            return "user doesn't exsist";
        }
        return "user details";
    }
    
    public int countUsers()
    {
        return 0;
    }
    
    public int countJobs() throws SQLException
    {
        int count = 0;
        Connection conn = null;
        Statement stmt = conn.createStatement();
        
        String sqlQuery = "SELECT * FROM USERS";
        
        ResultSet rs = stmt.executeQuery(sqlQuery);
        if(!rs.next())
        {
            System.err.println("The result contained no records!");
            return -1;
        }
        
        do
        {
            connection.displayRows(rs);
        }
        while(rs.next());
        
        return count;
    }
    
    public ArrayList getAllJobs()
    {
        //loop through and add each job to the job list
        return allJobs;
    }
    
    public ArrayList getAllUsers()
    {
        //Loop through and add each user object to the list
        return allUsers;
    }
}
