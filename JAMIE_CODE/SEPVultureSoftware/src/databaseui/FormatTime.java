/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;
import java.util.*;
import java.time.LocalDateTime;
/**
 *
 * @author Chris Bennett
 */
public class FormatTime 
{
    public String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public String dayOfWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public FormatTime()
    {
    }
    
    public String formatTime(LocalDateTime ldt)
    {   
        String time = "";
    
        int hour = ldt.getHour();
        int min = ldt.getMinute();
        int second = ldt.getSecond();
        if(min < 10)
        {
            time = hour + ":" + "0"+min + ":" + second;
        }
        if(second < 10)
        {
            time = hour + ":" + min + ":" + "0"+second;
        }
        else
        {
            time = hour + ":" + min + ":" + second;
        }
        
        String monthName = months[ldt.getMonth().getValue()-1];
        int monthValue = ldt.getDayOfMonth();
        String dofW = dayOfWeek[ldt.getDayOfWeek().getValue()-1];
        int year = ldt.getYear();
        
        String date = dofW + ", " + monthName + " " + suffix(monthValue) +", "+ year;
        
        return date + " \t " + time ;
    }
    
    public String suffix(int month)
    {
        
        if(month == 1 || month == 21 || month == 31)
        {
            return month + "st";
        }
        if(month == 2 || month == 22)
        {
            return month + "nd";
        }
        if(month == 23)
        {
            return month + "rd";
        }
        else
        {
            return month + "th";
        }
    }
}
