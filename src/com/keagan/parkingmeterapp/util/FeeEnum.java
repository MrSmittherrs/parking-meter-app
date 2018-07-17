/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keagan.parkingmeterapp.util;

/**
 *
 * @author User
 */
public enum FeeEnum {
    
    TIER1("0.00"),
    TIER2("5.00"),
    TIER3("8.00"),
    TIER4("11.00"),
    TIER5("14.00"),
    TIER6("25.00"),
    TIER7("35.00"),
    TIER8("50.00");
    
    private String fee;
    
    public String getFee() {
       return this.fee;
   }
    
    FeeEnum(String fee) {
           this.fee = fee;
   }
    
}
