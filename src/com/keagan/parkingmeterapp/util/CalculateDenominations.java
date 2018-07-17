/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keagan.parkingmeterapp.util;

import com.keagan.parkingmeterapp.model.CalculateParkingAmountModel;
import com.keagan.parkingmeterapp.model.CalculatePayModel;

/**
 *
 * @author User
 */
public class CalculateDenominations {
    
    CalculatePayModel calculatePayModel = new CalculatePayModel();
    
    public CalculatePayModel denominations(CalculateParkingAmountModel calculateParkingAmountModel){
        
        double changeAmount = 0.00d; 
        changeAmount = Double.parseDouble(calculateParkingAmountModel.getChangeAmount());
        
        if(changeAmount >= 200){
            int qtyAmount = (int) changeAmount/200;
            calculatePayModel.setTwoHundredRands(qtyAmount);         
            changeAmount = changeAmount - (200 * qtyAmount);
            
        }
        
        if(changeAmount >= 100){
            int qtyAmount = (int) (changeAmount/100);
            calculatePayModel.setOneHundredRands(qtyAmount);
            changeAmount = changeAmount - (100 * qtyAmount);
            
        }
        
        if(changeAmount >= 50){
            int qtyAmount = (int) (changeAmount/50);
            calculatePayModel.setFiftyRands(qtyAmount);
            changeAmount = changeAmount - (50 * qtyAmount);
            
        }
        
        if(changeAmount >= 20){
            int qtyAmount = (int) (changeAmount/20);
            calculatePayModel.setTwentyRands(qtyAmount);
            changeAmount = changeAmount - (20 * qtyAmount);
            
        }
        
        if(changeAmount >= 10){
            int qtyAmount = (int) (changeAmount/10);
            calculatePayModel.setTenRands(qtyAmount);
            changeAmount = changeAmount - (10 * qtyAmount);
            
        }
        
         if(changeAmount >= 5){
            int qtyAmount = (int) (changeAmount/5);
            calculatePayModel.setFiveRands(qtyAmount);
            changeAmount = changeAmount - (5 * qtyAmount);
            
        }
         
         if(changeAmount >= 2){
            int qtyAmount = (int) (changeAmount/2);
            calculatePayModel.setTwoRands(qtyAmount);
            changeAmount = changeAmount - (2 * qtyAmount);
            
        }
         
         if(changeAmount >= 1){
            int qtyAmount = (int) (changeAmount/1);
            calculatePayModel.setOneRands(qtyAmount);
            changeAmount = changeAmount - (1 * qtyAmount);
            
        }
         
         if(changeAmount >= 0.5){
            int qtyAmount = (int) (changeAmount/0.5);
            calculatePayModel.setFiftyCents(qtyAmount);
            changeAmount = changeAmount - (0.5 * qtyAmount);
            
        }
         
         if(changeAmount >= 0.2){
            int qtyAmount = (int) (changeAmount/0.2);
            calculatePayModel.setTwentyCents(qtyAmount);
            changeAmount = changeAmount - (0.2 * qtyAmount);
            
        }
         
        if(changeAmount >= 0.1){
            int qtyAmount = (int) (changeAmount/0.1);
            calculatePayModel.setTenCents(qtyAmount);
            changeAmount = changeAmount - (0.1 * qtyAmount);
            
        }
        return calculatePayModel;
    
    }
    
}
