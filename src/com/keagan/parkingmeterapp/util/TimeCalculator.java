/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keagan.parkingmeterapp.util;

import com.keagan.parkingmeterapp.model.CalculateParkingAmountModel;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author User
 */
public class TimeCalculator {
    
    public CalculateParkingAmountModel calculateTime(CalculateParkingAmountModel calculateParkingAmountModel){
        
        Date date1 = new Date(calculateParkingAmountModel.getEntryDate());
        Date date2 = new Date(calculateParkingAmountModel.getExitDate());
        
        long diffInMinutes = date2.getTime() - date1.getTime(); //calculates total time in milliseconds
        long totalHours = TimeUnit.HOURS.convert(diffInMinutes,TimeUnit.MILLISECONDS);  //calculate total hours from milliseconds
        long minutes = TimeUnit.MINUTES.convert(diffInMinutes,TimeUnit.MILLISECONDS);  //convert milliseconds to minutes
        long totalMinutes = minutes%60;    //calculate minutes(remainder using modulus)

        calculateParkingAmountModel.setTotalHours(totalHours);  //set hours to model
        calculateParkingAmountModel.setTotalMinutes(totalMinutes);  //set minutes to model
        
        return calculateParkingAmountModel;
        
    }
    
}
