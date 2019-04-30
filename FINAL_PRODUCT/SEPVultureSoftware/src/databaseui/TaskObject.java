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
public class TaskObject 
{
    private int id, expectedTime;
    private boolean delay;
    private String taskName, type, assigned, prefs, talents, priority;
    
    public TaskObject(int id, boolean delay, String taskName, String type, String assigned, int expectedTime, String prefs, String talents, String priority)
    {
        this.id = id;
        this.delay = delay;
        this.taskName = taskName;
        this.type = type;
        this.assigned = assigned;
        this.expectedTime = expectedTime;
        this.prefs = prefs;
        this.talents = talents;
        this.priority = priority;
    }
    
    public int getID()
    {
        return id;
    }
    
    public int getExpectedTime()
    {
        return expectedTime;
    }
    
    public boolean getDelay()
    {
        return delay;
    }
    
    public String getTaskName()
    {
        return taskName;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String getAssignedTo()
    {
        return assigned;
    }
    
    public String getPrefs()
    {
        return prefs;
    }
    
    public String getTalents()
    {
        return talents;
    }
    
    public String getPriority()
    {
        return priority;
    }
    
    @Override 
    public String toString()
    {
        return getID()+", "+getExpectedTime()+", "+getDelay()+", "+getTaskName()+", "+getType()+", "+getAssignedTo()+", "+getPrefs()+", "+getTalents()+", "+getPriority();
    }
}
