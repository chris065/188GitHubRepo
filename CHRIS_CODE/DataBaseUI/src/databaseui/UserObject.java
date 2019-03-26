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
    
    public String getUserFName()
    {
        return userFName;
    }
    
    public String getUserSName()
    {
        return userSName;
    }
    
    public String getUserUName()
    {
        return userUName;
    }
    
    public String getRole()
    {
        return role;
    }
    
    @Override
    public String toString()
    {
        return getUserFName() + "\n" + getUserSName() + "\n" + getUserUName() + "\n" + getRole();
    }
}
