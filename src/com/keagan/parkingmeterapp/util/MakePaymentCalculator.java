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
public class MakePaymentCalculator {

    double totalAmount = 0.00d;

    public CalculateParkingAmountModel paymentCalculator(CalculateParkingAmountModel calculateParkingAmountModel) {
        int tenCentQty = calculateParkingAmountModel.getTenCents();
        int twentyCentQty = calculateParkingAmountModel.getTwentyCents();
        int fiftyCentQty = calculateParkingAmountModel.getFiftyCents();
        int oneRandQty = calculateParkingAmountModel.getOneRands();
        int twoRandQty = calculateParkingAmountModel.getTwoRands();
        int fiveRandQty = calculateParkingAmountModel.getFiveRands();
        int tenRandQty = calculateParkingAmountModel.getTenRands();
        int twentyRandQty = calculateParkingAmountModel.getTwentyRands();
        int fiftyRandQty = calculateParkingAmountModel.getFiftyRands();
        int oneHundredRandQty = calculateParkingAmountModel.getOneHundredRands();
        int twoHundredRandQty = calculateParkingAmountModel.getTwoHundredRands();

        if (tenCentQty > 0) {
            totalAmount = totalAmount + (tenCentQty * 0.1);
        }

        if (twentyCentQty > 0) {
            totalAmount = totalAmount + (twentyCentQty * 0.2);
        }

        if (fiftyCentQty > 0) {
            totalAmount = totalAmount + (fiftyCentQty * 0.5);
        }

        if (oneRandQty > 0) {
            totalAmount = totalAmount + (oneRandQty * 1);
        }

        if (twoRandQty > 0) {
            totalAmount = totalAmount + (twoRandQty * 2);
        }

        if (fiveRandQty > 0) {
            totalAmount = totalAmount + (fiveRandQty * 5);
        }

        if (tenRandQty > 0) {
            totalAmount = totalAmount + (tenRandQty * 10);
        }

        if (twentyRandQty > 0) {
            totalAmount = totalAmount + (twentyRandQty * 20);
        }
        
        if (fiftyRandQty > 0) {
            totalAmount = totalAmount + (fiftyRandQty * 50);
        }
        
        if (oneHundredRandQty > 0) {
            totalAmount = totalAmount + (oneHundredRandQty * 100);
        }
        
        if (twoHundredRandQty > 0) {
            totalAmount = totalAmount + (twoHundredRandQty * 200);
        }
        calculateParkingAmountModel.setPaidAmount(String.valueOf(totalAmount));

        return calculateParkingAmountModel;
    }
    
    public CalculateParkingAmountModel calculateChange(CalculateParkingAmountModel calculateParkingAmountModel){
        
        double amountDue = Double.parseDouble(calculateParkingAmountModel.getTotalAmount().getFee());
        double amountPaid = Double.parseDouble(calculateParkingAmountModel.getPaidAmount());
        
        double changeAmount = amountPaid - amountDue;
        
        calculateParkingAmountModel.setChangeAmount(String.valueOf(changeAmount));
        
        return calculateParkingAmountModel;
    }
}
