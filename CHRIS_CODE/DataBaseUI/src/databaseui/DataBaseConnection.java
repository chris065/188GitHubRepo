/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import java.sql.*;

/**
 *
 * @author Chris Bennett
 */
public class DataBaseConnection 
{
    private String url;
    private String driver;
    private String dbase;
    
    protected Connection conn = null;
    
    //Could Potentially make singleton to stop multiple connections
    public DataBaseConnection()
    {
        driver = "jdbc:sqlite:";
        dbase = "sepDataBase 3.sqlite3";
        url = driver  + dbase;
        
        connect();
        
        /*
        try
        {
            testDisplayUserTable();
        }
        catch(SQLException e)
        {
            System.out.println("Error: " + e.toString());
            e.printStackTrace();
        }
        */
        
    }
    
    public boolean connect()
    {
        try
        {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection Successful\n");
        }
        catch(SQLException sqlex)
        {
            System.err.println("Connection Unsecuessful: "+sqlex.toString());
            return false;
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
            return false;
        }
        return true;
    }
    
    public void testDisplayUserTable() throws SQLException
    {
        Statement stmt = conn.createStatement();
        String query = "SELECT U_FNAME, U_SNAME, U_UNAME FROM users";
        
        ResultSet rs = stmt.executeQuery(query);
        if(!rs.next())
        {
            System.out.println("Resultset contained no records");
            return;
        }
        //display the column headers
        ResultSetMetaData rsmd = rs.getMetaData();
        for(int i = 1; i <= rsmd.getColumnCount(); i++)
        {
            System.out.println(rsmd.getColumnName(i) + "\t");
        }
        System.out.println();
        //Display the rows of data
        do
        {
            displayRow(rs, rsmd);
            
        }
        while(rs.next());
    }
    
    //helper method
    public void displayRow(ResultSet rs, ResultSetMetaData rsmd) throws SQLException
    {
        for(int i = 1; i < rsmd.getColumnCount(); i++)
        {
            switch(rsmd.getColumnType(i))
            {
                case Types.VARCHAR:
                    System.out.println(rs.getString(i)+"\t");
                    break;
                case Types.INTEGER:
                    System.out.println(rs.getInt(i)+"\t");
                    break;
                default:
                    break;
            }
            System.out.println();
        }
    }
    
    /*
    public static void main(String[] args)
    {
        new DataBaseConnection();
    }
    */
    
    public String getURL()
    {
        return url;
    }
}
