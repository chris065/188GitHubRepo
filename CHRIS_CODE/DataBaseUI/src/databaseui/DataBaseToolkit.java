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
    
    private ArrayList<String> allJobs, allCustomers;
    private ArrayList<UserObject> allUsers;
    
    private final DataBaseConnection connection;
    
    public DataBaseToolkit()
    {
        this.connection = new DataBaseConnection();
        
        allJobs = new ArrayList();
        allUsers = new ArrayList();
        allCustomers = new ArrayList();
        
        
        
        
        try
        {
            /*
            if(!updateUser("Chris", "Bennett", "cb1", "password1", "admin"))
            {
                System.err.println("Error");
            }
            else
            {
                System.out.println("Success");
            }
            
            
            getAllUsers();
            for(int i = 0; i < allUsers.size(); i++)
            {
                System.out.println(allUsers.toString()+"\n");
            }
            */
            ArrayList<String> userDetails = getUserDetails("js2");
            System.out.println(userDetails.toString());
            
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    //START OF USER / LOGON ON SYSTEM FUNCTION
    public boolean deleteUser(String userName)
    {
        if(!checkUser(userName))
        {
            return false;
        }
        else
        {
            PreparedStatement sqlDelete = null;
            try
            {
                Connection conn = DriverManager.getConnection(connection.getURL());
                sqlDelete = conn.prepareStatement("DELETE FROM USERS WHERE U_UNAME = ?");
                sqlDelete.setString(1, userName);
                int rslt = sqlDelete.executeUpdate();
                
                if(rslt == 0)
                {
                    conn.close();
                    return false;
                }
                else
                {
                    conn.close();
                    return true;
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return false;
            }
        }
    }
    
    public boolean updateUser(String userID, String userFName, String userSName, String userUName, String userPWord, String role)
    {
        if(!checkUser(userUName))
        {
            return false;
        }
        
        PreparedStatement sqlUpdate = null;
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            sqlUpdate = conn.prepareStatement("UPDATE USERS SET U_FNAME = ?, U_SNAME = ?, U_UNAME = ?, U_PWORD = ?, U_ROLE = ? WHERE USER_ID = ?");
            
            sqlUpdate.setString(1, userFName);
            sqlUpdate.setString(2, userSName);
            sqlUpdate.setString(3, userUName);
            sqlUpdate.setString(4, userPWord);
            sqlUpdate.setString(5, role);
            //value to search on
            sqlUpdate.setString(6, userID);
            
            int rslt = sqlUpdate.executeUpdate();
            if(rslt == 0)
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
            e.printStackTrace();
            return false;
        }
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
                conn.close();
                return false;
            }
            else
            {
                conn.close();
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
                  conn.close();
                  return true;
              }
              //password was incorrect for that user
              conn.close();
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
    
    public ArrayList getUserDetails(String userName)
    {
        ArrayList<String> userDetails = new ArrayList();
        if(!checkUser(userName))
        {
            return null;
        }
        else
        {
            try
            {
                Connection conn = DriverManager.getConnection(connection.getURL());
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM USERS WHERE U_UNAME = '"+userName+"'";
                
                ResultSet rs = stmt.executeQuery(sql);
                if(!rs.next())
                {
                    return null;
                }
                ResultSetMetaData rsmd = rs.getMetaData();
                do
                {
                    for(int i = 1; i <= rsmd.getColumnCount(); i ++)
                    {
                        userDetails.add(rs.getString(i));
                    }
                }
                while(rs.next());
                return userDetails;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
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
            conn.close();
            return 0;
        }
        do
        {
            count++;
        }
        while(rs.next());
        
        conn.close();
        return count;
    }
    
    public boolean addNewUser(String techUName, String techFName, String techSName, String techPassword, String role)
    {   
        try
        {
            PreparedStatement sqlInsert = null;
            
            Connection conn = DriverManager.getConnection(connection.getURL());
            conn.setAutoCommit(false);
            sqlInsert = conn.prepareStatement("INSERT INTO USERS (U_FNAME, U_SNAME, U_UNAME, U_PWORD, U_ROLE) VALUES (?, ?, ?, ?, ?)");
            
            sqlInsert.setString(1, techFName);
            sqlInsert.setString(2, techSName);
            sqlInsert.setString(3, techUName);
            sqlInsert.setString(4, techPassword);
            sqlInsert.setString(5, role);
            
            int rslt = sqlInsert.executeUpdate();
            if(rslt == 0)
            {
                conn.rollback();
                conn.close();
                return false;
            }
            else
            {
                conn.commit();
                conn.close();
                return true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
     public ArrayList getAllUsers()
    {
        //All the users as in Techies
        //Loop through and add each user object to the list 
        
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT U_FNAME, U_SNAME, U_UNAME, U_ROLE FROM USERS";
            
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            if(!rs.next())
            {
                return null;
            }
            else
            {
                do
                {
                    for(int i = 1; i <= rsmd.getColumnCount(); i++)
                    {
                      System.out.println(rs.getString(i));
                      //allUsers.add(new UserObject("","","","")); 
                    }
                }
                while(rs.next());
            }
            conn.close();
            return allUsers;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    //END OF USER / LOGON SYSTEM FUNCTIONS
     
    //START OF JOB SYSTEM FUNCTIONS
    
    public int countJobs()
    {
        return 0;
    }
    
    public boolean addNewJob(int jobNumber, String jobMotorName, String jobDateCollected, String jobParts, String jobClient, String jobMan, String jobReturnDate, String jobDate, String jobCheck, String jobTaskID)
    {
        try
        {
            PreparedStatement sqlInsert = null;
            
            Connection conn = DriverManager.getConnection(connection.getURL());
            conn.setAutoCommit(false);
            
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        
    }
    
    //END OF JOB SYSTEM FUNCTIONS
    
    
    
    public int countCustomers()
    {
        return 0;
    }
    
    public ArrayList getAllJobs()
    {
        //loop through and add each job to the job list
        return allJobs;
    }

    
    public ArrayList getAllCustomers()
    {
        return allCustomers;
    }
    
    public String getCustomer(String custUName)
    {
        return "";
    }
    
    public void addNewCustomer(String custUName, String custFName, String custSName)
    {
    }
    
    public static void main(String[] args)
    {
        new DataBaseToolkit();
    }
    
}
