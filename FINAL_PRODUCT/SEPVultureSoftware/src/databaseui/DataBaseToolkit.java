package databaseui;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;
/**
 *
 * @author Chris Bennett
 * @version 3.0 (14/05/2019) 
 * 
 */
public class DataBaseToolkit 
{
    //ArrayLists to store all of the jobs, customers, technitions and tasks that are in the db
    private ArrayList<String> allCustomers, allTechs, allTasks;
    //ArrayList to store all of the users that are in the db (as a UserObject)
    private ArrayList<UserObject> allUsers;
    
    private ArrayList<JobObject> allJobs; 
    //DBConnection, create the object that establishes the  connection to the db
    private final DataBaseConnection connection;
    
    /**
     * DataBaseToolkit constructor
     * 
     * Creates the connection object(reference), which then connects to the db
     * Creates the arraylist objects
     */
    public DataBaseToolkit()
    {
        this.connection = new DataBaseConnection();
        
        allJobs = new ArrayList();
        allUsers = new ArrayList();
        allCustomers = new ArrayList();
        allTechs = new ArrayList();
        allTasks = new ArrayList();

        /*
        try
        {
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        */
        
        
        
    }
    //START OF USER / LOGON ON SYSTEM FUNCTION
    
    /**
     * This allows the admin pannel to delete a user by simply searching for the username
     * as the username is a unique identifier of the user (so is the ID which is used to update on)
     * 
     * @param userName
     * @return true / false depending if the query was successful or not 
     */
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
    
    /**
     * This allow the admin panel to update the users details. On the admin
     * 
     * @param userID
     * @param userFName
     * @param userSName
     * @param userUName
     * @param userPWord
     * @param role
     * @return 
     */
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
    
    /**
     * This method checks the user exists in the database, it will return true if it exists and false if
     * it does not
     * 
     * @param userToCheck
     * @return false if the user does not exists, and true if it does
     */
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
    
    /**
     * This method will both check the username and check that the password for that user name is correct.
     * it cannnot check the password if no username is supplied, and the username must return true
     * 
     * @param passToCheck
     * @param userName
     * @return flase is the password or username is incorrect, and true if everything checks out
     */
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
    
    /**
     * This method returns an arraylist of all the details for the single user that was requested by the paramenters
     * it is formated in a UserObject so it is easier for the client side to user/handle
     * @param userName
     * @return ArrayList with the user details or NULL if anything goes wrong or the user does not exist
     */
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
                System.out.println(userDetails.toString());
                return userDetails;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
    }
    
    /**
     * Used 
     * @param tableName
     * @return
     * @throws SQLException 
     */
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
                conn.close();
                return null;
            }
            else
            {
                do
                {
                    //System.out.printf("First Name: %s\nSurname: %s\nUsername: %s\nRole: %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                    allUsers.add(new UserObject(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
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
    
    //Need a function to get the specific job 
    
    public boolean deleteJob(int jobNumber)
    {
        PreparedStatement sqlDelete = null ;
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            sqlDelete = conn.prepareStatement("DELETE FROM JOBS WHERE JOB_NUMBER = ?");
            sqlDelete.setInt(1, jobNumber);
            
            int rslt = sqlDelete.executeUpdate();
            if(rslt == 0)
            {
                //conn.rollback();
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
    
    public boolean updateJob(int jobNumber, String jobMotorName, String jobDateCollected, String jobParts, String jobClient, String jobMan, String jobReturnDate, String jobCheck, String expectedTime)
    {
        PreparedStatement sqlUpdate = null;
        try
        {   
            Connection conn = DriverManager.getConnection(connection.getURL()); 
            sqlUpdate = conn.prepareStatement("UPDATE JOBS SET JOB_MOTORNAME = ?, JOB_DATECOLLECTED = ?, JOB_PARTS = ?, JOB_CLIENT = ?, JOB_MANUFACTURER = ?, JOB_RETURNDATE = ?, JOB_CHECKEDBY = ?, JOB_EXPECTED_TIME = ? WHERE JOB_NUMBER = ?");
            
            sqlUpdate.setString(1, jobMotorName);
            sqlUpdate.setString(2, jobDateCollected);
            sqlUpdate.setString(3, jobParts);
            sqlUpdate.setString(4, jobClient);
            sqlUpdate.setString(5, jobMan);
            sqlUpdate.setString(6, jobReturnDate);
            sqlUpdate.setString(7, jobCheck);
            sqlUpdate.setString(8, expectedTime);
            
            //value to update on
            sqlUpdate.setInt(9, jobNumber);
            int rslt = sqlUpdate.executeUpdate(); 
            if(rslt == 0)
            {
                conn.close();
                return false;
            }
            else
            {
                //conn.commit();
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
    
    public boolean addNewJob(String jobMotorName, String jobDateCollected, String jobParts, String jobClient, String jobMan, String jobReturnDate, String jobCheck, String expectedTime)
    {
        String jobDate = getDate();
        
        try
        {
            int jobId = countRows("JOBS")+1;
            PreparedStatement sqlInsert = null;
            
            Connection conn = DriverManager.getConnection(connection.getURL());
            conn.setAutoCommit(false);
            sqlInsert = conn.prepareStatement("INSERT INTO JOBS VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            
            sqlInsert.setInt(1, jobId);
            sqlInsert.setString(2, jobMotorName);
            sqlInsert.setString(3, jobDateCollected);
            sqlInsert.setString(4, jobParts);
            sqlInsert.setString(5, jobClient);
            sqlInsert.setString(6, jobMan);
            sqlInsert.setString(7, jobReturnDate);
            sqlInsert.setString(8, jobDate);
            sqlInsert.setString(9, jobCheck);
            sqlInsert.setString(10, expectedTime);
            sqlInsert.setBoolean(11, false);
            
            
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
    
    public boolean checkJobExsists(int jobNumber)
    {
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM JOBS WHERE JOB_NUMBER = "+jobNumber+"";
            
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
    
    public ArrayList getJob(int jobNumber)
    {
        if(!checkJobExsists(jobNumber))
        {
            return null;
        }
        else
        {
            ArrayList<JobObject> job = new ArrayList();
            try
            {
                Connection conn = DriverManager.getConnection(connection.getURL());
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM JOBS WHERE JOB_NUMBER = "+jobNumber+"";
                
                ResultSet rs = stmt.executeQuery(sql);
                if(!rs.next())
                {
                    conn.close();
                    return null;
                }
                else
                {
                    job.add(new JobObject(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getBoolean(11)));
                }
                conn.close();
                return job;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
    }
    
    public ArrayList getAllJobs()
    {
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM JOBS";
            
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.next())
            {
                conn.close();
                return null;
            }
            do
            {
                
                allJobs.add(new JobObject(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getBoolean(11)));
            }
            while(rs.next());
            
            conn.close();
            //System.out.println(allJobs.get(1).toString());
            return allJobs;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList getTasksForJob(int jobNumber)
    {
        ArrayList<TaskObject> tasksForJob = new ArrayList();
        int count = 0;
        
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT JOB_NUMBER, TASK_ID, TASK_DELAY, TASK_NAME, TASK_TYPE, TASK_ASSIGNED, TASK_EXPECTED_TIME, TASK_PREFERENCES, TASK_REQUIRED_TALENTS, TASK_PRIORITY, TASK_JOB FROM JOBS JOIN TASKS ON JOB_NUMBER = TASK_JOB WHERE JOB_NUMBER = "+jobNumber;
            
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.next())
            {
                conn.close();
                return null;
            }
            else
            {
                do
                {
                    tasksForJob.add(new TaskObject(rs.getInt(2), rs.getBoolean(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11)));
                    
                    //System.out.println(tasksForJob.get(count).toString());
                    //count++;
                    
                }
                while(rs.next());
                
                conn.close();
                return tasksForJob;
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    //END OF JOB SYSTEM FUNCTIONS
    
    //START OF TASK FUNCTIONS

    public ArrayList getTask(String taskName)
    {
        ArrayList<TaskObject> tasks = new ArrayList();
        if(!checkTask(taskName))
        {
            return null;
        }
        else
        {
            try
            {
                Connection conn = DriverManager.getConnection(connection.getURL());
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM TASKS WHERE TASK_NAME = '"+taskName+"'";
                
                ResultSet rs = stmt.executeQuery(sql);
                if(!rs.next())
                {
                    conn.close();
                    return null;
                }
                else
                {
                    //TaskObject Params: ID, DELAY, NAME, TYPE, ASSIENGED TO, EXPECTED TIME, PREFS, TALENTS, PRIORITY
                    tasks.add(new TaskObject(rs.getInt(1) ,rs.getBoolean(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10)));
                    //System.out.println(tasks.toString());
                    
                    conn.close();
                    return tasks;
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return null; 
            }
        }
    }
    
    public boolean addTask(boolean delayed, String name, String type, String assigned, String expectedTime, String prefrences, String talents, String priority, int taskJob) 
    {
        int taskID;
        try
        {
            PreparedStatement sqlInsert = null;
            
            taskID = countRows("Tasks") + 1;
            Connection conn = DriverManager.getConnection(connection.getURL());
            conn.setAutoCommit(false);
            sqlInsert = conn.prepareStatement("INSERT INTO TASKS VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            sqlInsert.setInt(1, taskID);
            sqlInsert.setBoolean(2, delayed);
            sqlInsert.setString(3, name);
            sqlInsert.setString(4, type);
            sqlInsert.setString(5, assigned);
            sqlInsert.setString(6, expectedTime);
            sqlInsert.setString(7, prefrences);
            sqlInsert.setString(8, talents);
            sqlInsert.setString(9, priority);
            sqlInsert.setInt(10, taskJob);
            
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
    
    
    public boolean updateTasks(int taskID, boolean delayed, String name, String type, String assigned, String expectedTime, String prefrences, String talents, String priority)
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
            sqlUpdate.setString(5, expectedTime);
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
            String sql = "SELECT TASK_NAME FROM TASKS";
            
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.next())
            {
                conn.close();
                return null;
            }
            do
            {
                //System.out.println(rs.getString(1) +" "+rs.getString(2));
                allTasks.add(rs.getString(1));
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
    
    public boolean checkTechExsistsForTask(String techName)
    {
        String techNameStr = techName;
        String[] splitStringName = techNameStr.split("\\s+");
        String firstName = splitStringName[0];
        String secondName = splitStringName[1];
        
        //System.out.println(firstName +" "+secondName);
        
        try
        {
            Connection conn = DriverManager.getConnection(connection.getURL());
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM USERS WHERE U_FNAME = '"+firstName+"' AND U_SNAME = '"+secondName+"' AND U_ROLE = 'tech'";
            
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
    
    public ArrayList getTasksForTech(String techName)
    {
        ArrayList<TaskObject> tasks = new ArrayList();
        
        if(!checkTechExsistsForTask(techName))
        {
            return null;
        }
        else
        {
            try
            {
                Connection conn = DriverManager.getConnection(connection.getURL());
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM TASKS WHERE TASK_ASSIGNED = '"+techName+"'";
            
                ResultSet rs = stmt.executeQuery(sql);
                if(!rs.next())
                {
                    conn.close();
                    return null;
                }
                else
                {
                    do
                    {
                        tasks.add(new TaskObject(rs.getInt(1) ,rs.getBoolean(2), rs.getString(3), rs.getString(4), rs.getString(5) ,rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10)));
                        
                    }
                    while(rs.next());
                    
                    conn.close();
                    return tasks;
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
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
    
    
    /*
    public static void main(String[] args)
    {
        new DataBaseToolkit();
    }
    */
    
    
    
    public String getDate()
    {
        String jobDate = "";
        LocalDateTime now = LocalDateTime.now();
        
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();
        
        return jobDate = day+"/"+month+"/"+year;
    }
    
    public void closeConnectionToDB()
    {
        connection.closeConnection();
    }
    
    /**
     * Final Inspection method
     */
    
    public boolean addNewFinalInspection(int jobNumber, String date, String checkBy)
    {
        PreparedStatement sqlAdd = null;
        try
        {
            int fiID = countRows("Final_Inspection") + 1;
            
            Connection conn = DriverManager.getConnection(connection.getURL());
            
            if(!setCompletedFlagOnJob(conn, jobNumber))
            {
                conn.close();
                return false;
            }
            else
            {
                conn.setAutoCommit(false);
                sqlAdd = conn.prepareStatement("INSERT INTO Final_Inspection (FI_ID, FI_DATE, FI_CHECKBY, FI_JOB) VALUES (?, ?, ?, ?)");
            
                sqlAdd.setInt(1, fiID); 
                sqlAdd.setString(2, date);
                sqlAdd.setString(3, checkBy);
                sqlAdd.setInt(4, jobNumber);
            
                int rslt = sqlAdd.executeUpdate();
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
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    private boolean setCompletedFlagOnJob(Connection conn, int jobNumber)
    {
        PreparedStatement sqlUpdate = null;
        
        try
        {
            conn.setAutoCommit(false);
            sqlUpdate = conn.prepareStatement("UPDATE JOBS SET JOB_COMPLETED = ? WHERE JOB_NUMBER = ?");
            
            sqlUpdate.setBoolean(1, true);
            sqlUpdate.setInt(2, jobNumber);
            
            int rslt = sqlUpdate.executeUpdate();
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
