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
    
    private ArrayList<String> allJobs, allCustomers, allTechs, allTasks;
    private ArrayList<UserObject> allUsers;
    
    private final DataBaseConnection connection;
    
    public DataBaseToolkit()
    {
        this.connection = new DataBaseConnection();
        
        allJobs = new ArrayList();
        allUsers = new ArrayList();
        allCustomers = new ArrayList();
        allTechs = new ArrayList();
        allTasks = new ArrayList();

        
        try
        {
            if(getAllTasks() == null)
            {
                System.out.println("Error");
            }
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
    
    public int countRows(String tableName) throws SQLException
    {
        int count = 1;
        
        Connection conn = DriverManager.getConnection(connection.getURL());
        Statement stmt = conn.createStatement();
        String sqlQuery = "SELECT * FROM "+tableName;
        
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
    
    public boolean addNewUser(String techFName, String techSName, String techUName, String techPassword, String role)
    {   
        try
        {
            int userID = countRows("USERS")+1;
            PreparedStatement sqlInsert = null;
            
            Connection conn = DriverManager.getConnection(connection.getURL());
            conn.setAutoCommit(false);
            sqlInsert = conn.prepareStatement("INSERT INTO USERS (USER_ID, U_FNAME, U_SNAME, U_UNAME, U_PWORD, U_ROLE) VALUES (?, ?, ?, ?, ?, ?)");
            
            sqlInsert.setInt(1, userID);
            sqlInsert.setString(2, techFName);
            sqlInsert.setString(3, techSName);
            sqlInsert.setString(4, techUName);
            sqlInsert.setString(5, techPassword);
            sqlInsert.setString(6, role);
            
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
    
    public boolean addNewJob(int jobNumber, String jobMotorName, String jobDateCollected, String jobParts, String jobClient, String jobMan, String jobReturnDate, String jobDate, String jobCheck, int jobTaskID)
    {
        try
        {
            //int jobId = countRows("JOBS");
            PreparedStatement sqlInsert = null;
            
            Connection conn = DriverManager.getConnection(connection.getURL());
            conn.setAutoCommit(false);
            sqlInsert = conn.prepareStatement("INSERT INTO JOBS VALUES (?,?,?,?,?,?,?,?,?,?)");
            
            sqlInsert.setInt(1, jobNumber);
            sqlInsert.setString(2, jobMotorName);
            sqlInsert.setString(3, jobDateCollected);
            sqlInsert.setString(4, jobParts);
            sqlInsert.setString(5, jobClient);
            sqlInsert.setString(6, jobMan);
            sqlInsert.setString(7, jobReturnDate);
            sqlInsert.setString(8, jobDate);
            sqlInsert.setString(9, jobCheck);
            sqlInsert.setInt(10, jobTaskID);
            
            
            //System.out.printf("Number of jobs: %s", jobId);
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
    
    public ArrayList getAllJobs()
    {
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT JOB_NUMBER, JOB_DATE, JOB_CLIENT FROM JOBS";
            
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.next())
            {
                conn.close();
                return null;
            }
            do
            {
                //System.out.println(rs.getString(1) +" "+rs.getString(2));
                allJobs.add("Job Number: "+rs.getString(1)+"\n"+"Date: "+rs.getString(2)+"\n"+"Client: "+rs.getString(3)+"\n");
            }
            while(rs.next());
            
            conn.close();
            //System.out.println(allJobs.get(1));
            return allJobs;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    //END OF JOB SYSTEM FUNCTIONS
    
    //START OF TASK FUNCTIONS
    
    public boolean addTask(boolean delayed, String name, String type, String assigned, int expectedTime, String prefrences, String talents, String priority)
    {
        int taskID;
        try
        {
            PreparedStatement sqlInsert = null;
            
            taskID = countRows("Tasks") + 1;
            Connection conn = DriverManager.getConnection(connection.getURL());
            conn.setAutoCommit(false);
            sqlInsert = conn.prepareStatement("INSERT INTO TASKS VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            sqlInsert.setInt(1, taskID);
            sqlInsert.setBoolean(2, delayed);
            sqlInsert.setString(3, name);
            sqlInsert.setString(4, type);
            sqlInsert.setString(5, assigned);
            sqlInsert.setInt(6, expectedTime);
            sqlInsert.setString(7, prefrences);
            sqlInsert.setString(8, talents);
            sqlInsert.setString(9, priority);
            
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
    
    public ArrayList getAllTechs()
    {
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT U_FNAME, U_SNAME FROM USERS WHERE U_ROLE = "+"'tech'";
            
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.next())
            {
                conn.close();
                return null;
            }
            do
            {
                //System.out.println(rs.getString(1) +" "+rs.getString(2));
                allTechs.add(rs.getString(1)+" "+rs.getString(2));
            }
            while(rs.next());
            
            conn.close();
            //System.out.println(allTechs.toString);
            return allTechs;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    /*
    private boolean checkTask(String taskName)
    {
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT TASK_NAME FROM TASKS WHERE TASK_NAME = '"+taskName+"'";
            
            ResultSet rs = stmt.executeQuery(sql);
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
            e.printStackTrace();
            return false;
        }
    }
    */
    
    public boolean updateTasks(int taskID, boolean delayed, String name, String type, String assigned, int expectedTime, String prefrences, String talents, String priority)
    {
        try
        {
            PreparedStatement sqlUpdate = null;
            
            Connection conn = DriverManager.getConnection(connection.getURL());
            conn.setAutoCommit(false);
            sqlUpdate = conn.prepareStatement("UPDATE TASKS SET TASK_DELAY = ?, TASK_NAME = ?, TASK_TYPE = ?, TASK_ASSIGNED = ?, TASK_EXPECTED_TIME = ?, TASK_PREFERENCES = ?, TASK_REQUIRED_TALENTS = ?, TASK_PRIORITY = ? WHERE TASK_ID = ?");
            
            sqlUpdate.setBoolean(1, delayed);
            sqlUpdate.setString(2, name);
            sqlUpdate.setString(3, type);
            sqlUpdate.setString(4, assigned);
            sqlUpdate.setInt(5, expectedTime);
            sqlUpdate.setString(6, prefrences);
            sqlUpdate.setString(7, talents);
            sqlUpdate.setString(8, priority);
            //value to update on
            sqlUpdate.setInt(9, taskID);
            
            int rslt = sqlUpdate.executeUpdate();
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
    
    public ArrayList getAllTasks()
    {
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT TASK_ID, TASK_NAME, TASK_ASSIGNED FROM TASKS";
            
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.next())
            {
                conn.close();
                return null;
            }
            do
            {
                //System.out.println(rs.getString(1) +" "+rs.getString(2));
                allTasks.add("Task ID: "+rs.getString(1)+"\n"+"Name: "+rs.getString(2)+"\n"+"Assigned to: "+rs.getString(3)+"\n");
            }
            while(rs.next());
            
            conn.close();
            //System.out.println(allTasks.toString());
            return allTasks;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    //END OF TASK FUNCTIONS
    
    
    
    public int countCustomers()
    {
        return 0;
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
