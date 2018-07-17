/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keagan.parkingmeterapp.util;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author User
 */
public class DateSelector {
    
    public String dateSelector(){
        
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd" + "  " + "HH:mm");
        String date = formatter.format(today);
        return date;
        
    }
    
    public String incrementDate(Date currentDate){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, 1);
        Date date = calendar.getTime();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd" + "  " + "HH:mm");
        String formattedDate = formatter.format(date);
        
        return formattedDate;
    
    }
    
    public String decrementDate(Date previousDate){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(previousDate);
        int daysToDecrement = -1;
        calendar.add(Calendar.DATE, daysToDecrement);
        Date date = calendar.getTime();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd" + "  " + "HH:mm");
        String formattedDate = formatter.format(date);
        
        return formattedDate;
    }
    
    
    public String exitDateSelector(){
        
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd" + "  " + "HH:mm");
        String date = formatter.format(today);
        return date;
        
    }
    
    public String hoursIncrement(Date currentTime){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.HOUR, 1);
        currentTime = calendar.getTime();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd" + "  " + "HH:mm");
        String formattedDate = formatter.format(currentTime);
        
        return formattedDate;
        
    }
    
    public String hoursDecrement(Date currentTime){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.HOUR, -1);
        currentTime = calendar.getTime();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd" + "  " + "HH:mm");
        String formattedDate = formatter.format(currentTime);
        
        return formattedDate;
        
    }
    
     public String minutesIncrement(Date currentTime){
         
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.MINUTE, 1);
        currentTime = calendar.getTime();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd" + "  " + "HH:mm");
        String formattedDate = formatter.format(currentTime);
        
        return formattedDate;
        
    }
     
     public String minutesDecrement(Date currentTime){
         
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.MINUTE, -1);
        currentTime = calendar.getTime();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd" + "  " + "HH:mm");
        String formattedDate = formatter.format(currentTime);
        
        return formattedDate;
        
    }
    
}
