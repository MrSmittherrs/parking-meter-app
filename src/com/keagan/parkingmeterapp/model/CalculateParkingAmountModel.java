/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keagan.parkingmeterapp.model;

import com.keagan.parkingmeterapp.util.FeeEnum;
import java.io.Serializable;

/**
 *
 * @author User
 */
public class CalculateParkingAmountModel implements Serializable{
    
    String entryDate;
    String exitDate;
    long totalHours;
    long totalMinutes;
    FeeEnum totalAmount;
    String paidAmount;
    String changeAmount;
    
    int tenCents;
    int twentyCents;
    int fiftyCents;
    int oneRands;
    int twoRands;
    int fiveRands;
    int tenRands;
    int twentyRands;
    int fiftyRands;
    int oneHundredRands;
    int twoHundredRands;

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    public long getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(long totalHours) {
        this.totalHours = totalHours;
    }

    public long getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(long totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public FeeEnum getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(FeeEnum totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    public int getTenCents() {
        return tenCents;
    }

    public void setTenCents(int tenCents) {
        this.tenCents = tenCents;
    }

    public int getTwentyCents() {
        return twentyCents;
    }

    public void setTwentyCents(int twentyCents) {
        this.twentyCents = twentyCents;
    }

    public int getFiftyCents() {
        return fiftyCents;
    }

    public void setFiftyCents(int fiftyCents) {
        this.fiftyCents = fiftyCents;
    }

    public int getOneRands() {
        return oneRands;
    }

    public void setOneRands(int oneRands) {
        this.oneRands = oneRands;
    }

    public int getTwoRands() {
        return twoRands;
    }

    public void setTwoRands(int twoRands) {
        this.twoRands = twoRands;
    }

    public int getFiveRands() {
        return fiveRands;
    }

    public void setFiveRands(int fiveRands) {
        this.fiveRands = fiveRands;
    }

    public int getTenRands() {
        return tenRands;
    }

    public void setTenRands(int tenRands) {
        this.tenRands = tenRands;
    }

    public int getTwentyRands() {
        return twentyRands;
    }

    public void setTwentyRands(int twentyRands) {
        this.twentyRands = twentyRands;
    }

    public int getFiftyRands() {
        return fiftyRands;
    }

    public void setFiftyRands(int fiftyRands) {
        this.fiftyRands = fiftyRands;
    }

    public int getOneHundredRands() {
        return oneHundredRands;
    }

    public void setOneHundredRands(int oneHundredRands) {
        this.oneHundredRands = oneHundredRands;
    }

    public int getTwoHundredRands() {
        return twoHundredRands;
    }

    public void setTwoHundredRands(int twoHundredRands) {
        this.twoHundredRands = twoHundredRands;
    }
    
}
