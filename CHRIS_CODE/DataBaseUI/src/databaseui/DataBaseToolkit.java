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
    
    public DataBaseToolkit()
    {
        this.connection = new DataBaseConnection();
        
        allJobs = new ArrayList<String>();
        allUsers = new ArrayList<String>();
    }
    
    public boolean checkUser(String userToCheck)
    {
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sqlQuery = "SELECT U_UNAME FROM USERS WHERE U_UNAME = '"+userToCheck+"'";
            
            ResultSet rs = stmt.executeQuery(sqlQuery);
            if(!rs.next())
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        catch(Exception e)
        {
            System.out.println("There was an error whilst processing your request");
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean checkPass(String passToCheck, String userName)
    {
        if(!checkUser(userName))
        {
            return false;
        }
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sqlQuery = "SELECT U_PWORD FROM USERS WHERE U_UNAME = '"+userName+"'";
            
            ResultSet rs = stmt.executeQuery(sqlQuery);
            if(!rs.next())
            {
                //couldn't get any data for that user
                return false;
            }
            else
            {
              //check the first set, since it is more likely to return only one set of data
              if(rs.getString(1).equals(passToCheck))
              {
                  //password was correct for that user
                  return true;
              }
              //password was incorrect for that user
              return false;   
            }
        }
        catch(Exception e)
        {
            System.err.println("There was an error whilst processing your request");
            e.printStackTrace();
            return false;
        }
    }
    
    public String getUserDetails(String userName)
    {
        if(!checkUser(userName))
        {
            return "NULL";
        }
        else
        {
            return "user details";
        }
    }
    
    public int countJobs()
    {
        return 0;
    }
    
    public int countUsers() throws SQLException
    {
        int count = 0;
        
        Connection conn = DriverManager.getConnection(connection.getURL());
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
            count++;
        }
        while(rs.next());
        
        conn.close();
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
    
    /*
    public static void main(String[] args)
    {
        new DataBaseToolkit();
    }
    */
}
