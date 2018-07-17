/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keagan.parkingmeterapp.util;

import com.keagan.parkingmeterapp.model.CalculateParkingAmountModel;

/**
 *
 * @author User
 */
public class FeeCalculator {
    
    public CalculateParkingAmountModel timeCalcultor(CalculateParkingAmountModel calculateParkingAmountModel){
        long hours = calculateParkingAmountModel.getTotalHours();
        
        if(hours > 0 && hours <= 1){
            calculateParkingAmountModel.setTotalAmount(FeeEnum.TIER1);
            
        } else if(hours >1 && hours <= 2){
            calculateParkingAmountModel.setTotalAmount(FeeEnum.TIER2);
            
        } else if(hours >2 && hours <= 4){
             calculateParkingAmountModel.setTotalAmount(FeeEnum.TIER3);
             
        }  else if(hours >4 && hours <= 6){
             calculateParkingAmountModel.setTotalAmount(FeeEnum.TIER4);
             
        } else if(hours >6 && hours <= 10){
             calculateParkingAmountModel.setTotalAmount(FeeEnum.TIER5);
             
        } else if(hours >10 && hours <= 20){
             calculateParkingAmountModel.setTotalAmount(FeeEnum.TIER6);
             
        }  else if(hours >20 && hours <= 24){
             calculateParkingAmountModel.setTotalAmount(FeeEnum.TIER7);
             
        } else if(hours > 24){
             calculateParkingAmountModel.setTotalAmount(FeeEnum.TIER8);
             
        }
        return calculateParkingAmountModel;
    }
}
