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
    private int id, taskJob;
    private boolean delay;
    private String taskName, type, assigned, prefs, talents, priority, expectedTime;
    
    public TaskObject(int id, boolean delay, String taskName, String type, String assigned, String expectedTime, String prefs, String talents, String priority, int taskJob)
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
        this.taskJob = taskJob;
    }

    public int getTaskJob() 
    {
        return taskJob;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getExpectedTime()
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
        return getID()+", "+getTaskJob()+", "+getExpectedTime()+", "+getDelay()+", "+getTaskName()+", "+getType()+", "+getAssignedTo()+", "+getPrefs()+", "+getTalents()+", "+getPriority();
    }
}
