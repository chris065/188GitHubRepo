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
    
    public int countJobs()
    {
        return 0;
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
