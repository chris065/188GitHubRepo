/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;

import java.time.LocalDateTime;

/**
 *
 * @author chrisbennett
 */
public class JobObject 
{
    private final int jobNumber, jobTaskId, jobExpectedTime ;
    private final String jobMotorName, jobDateCollected, jobParts, jobClient, jobManufactrer, jobReturnDate, jobCheckBy, jobDate;
    //private final LocalDateTime ;
    
    public JobObject(int jobNumber, String jobMotorName, String jobDateCollected, String jobParts, String jobClient, String jobManufactrer, String jobReturnDate, String jobDate, String jobCheckBy, int jobTaskId, int jobExpectedTime)
    {
        this.jobNumber = jobNumber;
        this.jobMotorName = jobMotorName;
        this.jobDateCollected = jobDateCollected;
        this.jobParts = jobParts;
        this.jobClient = jobClient;
        this.jobManufactrer = jobManufactrer;
        this.jobReturnDate = jobReturnDate;
        this.jobDate = jobDate;
        this.jobCheckBy = jobCheckBy;
        this.jobTaskId = jobTaskId;
        this.jobExpectedTime = jobExpectedTime;
        
    }

    public int getJobNumber() 
    {
        return jobNumber;
    }

    public int getJobTaskId() 
    {
        return jobTaskId;
    }

    public int getJobExpectedTime() 
    {
        return jobExpectedTime;
    }

    public String getJobMotorName() 
    {
        return jobMotorName;
    }

    public String getJobDateCollected() 
    {
        return jobDateCollected;
    }

    public String getJobParts() 
    {
        return jobParts;
    }

    public String getJobClient() 
    {
        return jobClient;
    }

    public String getJobManufactrer() 
    {
        return jobManufactrer;
    }

    public String getJobReturnDate() 
    {
        return jobReturnDate;
    }

    public String getJobCheckBy() 
    {
        return jobCheckBy;
    }

    public String getJobDate() 
    {
        return jobDate;
    }

    @Override
    public String toString() 
    {
        return "JobObject{" + "jobNumber=" + jobNumber + ", jobTaskId=" + jobTaskId + ", jobExpectedTime=" + jobExpectedTime + ", jobMotorName=" + jobMotorName + ", jobDateCollected=" + jobDateCollected + ", jobParts=" + jobParts + ", jobClient=" + jobClient + ", jobManufactrer=" + jobManufactrer + ", jobReturnDate=" + jobReturnDate + ", jobCheckBy=" + jobCheckBy + ", jobDate=" + jobDate + '}';
    }

    
    
    
}
