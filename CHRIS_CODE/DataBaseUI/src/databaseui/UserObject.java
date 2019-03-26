/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

/**
 *
 * @author Chris Bennett
 */
public class UserObject 
{
    private String userFName, userSName, userUName, role;
    
    public UserObject(String userFName, String userSName, String userUName, String role)
    {
        this.userFName = userFName;
        this.userSName = userSName; 
        this.userUName = userUName;
        this.role = role;
    }
    
    public String toString()
    {
        return userFName + "\n" + userSName + "\n" + userUName + "\n" + role;
    }
}
