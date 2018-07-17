/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keagan.parkingmeterapp.util;

import com.keagan.parkingmeterapp.model.CalculateParkingAmountModel;
import com.keagan.parkingmeterapp.model.CalculatePayModel;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CreateTextFile {
    
   File fileTransactions = new File("C:\\dev\\projects\\netbeansprojects\\parking-meter-app\\src\\resources\\Files");
  
   public void createFile() {
       
        try {
            if(fileTransactions.createNewFile()) {
                System.out.println("Transactions file created successfully!");
           } else {
               System.out.println("Transactions file already exists!");
           }
        } catch (IOException ex) {
            System.out.println("Transactions file not created successfully!");
           Logger.getLogger(CreateTextFile.class.getName()).log(Level.SEVERE, null, ex);
           
        }
       
    }
   
    public void writeToTextFile(CalculateParkingAmountModel calculateParkingAmountModel,CalculatePayModel calculatePayModel) {
       
       Path path = Paths.get("C:\\dev\\projects\\netbeansprojects\\parking-meter-app\\src\\resources\\Files");
         
       byte[] startTimeHeading = ("Entry time: " + "\n").getBytes();
       byte[] startTime = (calculateParkingAmountModel.getEntryDate() + "\n" + " " + "\n").getBytes();
     
       byte[] endTimeHeading = ("Exit time: " + "\n").getBytes();
       byte[] endTime = (calculateParkingAmountModel.getExitDate() + "\n" + " " + "\n").getBytes();

       byte[] timeSpentInShopHeading = ("Total time spent in shop: " + "\n").getBytes();
       byte[] timeSpentInShop = (Long.toString(calculateParkingAmountModel.getTotalHours()) + "Hours" + " " + Long.toString(calculateParkingAmountModel.getTotalMinutes()) + "Minutes" + "\n" + " " + "\n").getBytes();
       
       byte[] feeheading = ("Fee paid:" + "\n").getBytes();
       byte[] fee = (calculateParkingAmountModel.getPaidAmount() + "\n" + " " + "\n").getBytes();
       
       byte[] changeHeading = ("Change: " + "\n").getBytes();
       byte[] change = (calculateParkingAmountModel.getChangeAmount() + "\n" + " " + "\n").getBytes();
       
       byte[] denominationsHeading = ("Amount Tendered: " + "\n").getBytes();
       byte[] twoHundredRandData = ("R200.00 X " + calculatePayModel.getTwoHundredRands() + "\n").getBytes();
       byte[] oneHundredRandData = ("R100.00 X " + calculatePayModel.getOneHundredRands() + "\n").getBytes();
       byte[] fiftyRandData = ("R50.00 X " + calculatePayModel.getFiftyRands() + "\n").getBytes();
       byte[] twentyRandData = ("R20.00 X " + calculatePayModel.getTwentyRands() + "\n").getBytes();
       byte[] tenRandData = ("R10.00 X " + calculatePayModel.getTenRands() + "\n").getBytes();
       byte[] fiveRandData = ("R5.00 X " + calculatePayModel.getFiveRands() + "\n").getBytes();
       byte[] twoRandData = ("R2.00 X " + calculatePayModel.getTwoRands() + "\n").getBytes();
       byte[] oneRandData = ("R1.00 X " + calculatePayModel.getOneRands() + "\n").getBytes();
       byte[] fiftyCentData = ("R0.50 X " + calculatePayModel.getFiftyCents() + "\n").getBytes();
       byte[] twentyCentData = ("R0.20 X " + calculatePayModel.getTwentyCents() + "\n").getBytes();
       byte[] tenCentData = ("R0.10 X " + calculatePayModel.getTenCents() + "\n").getBytes();
       
        try {
            
            Files.write(path, startTimeHeading, StandardOpenOption.APPEND);
            Files.write(path, startTime, StandardOpenOption.APPEND);
           
            Files.write(path, endTimeHeading, StandardOpenOption.APPEND);
            Files.write(path, endTime, StandardOpenOption.APPEND);
           
            Files.write(path, timeSpentInShopHeading, StandardOpenOption.APPEND);
            Files.write(path, timeSpentInShop, StandardOpenOption.APPEND);
            
            Files.write(path, feeheading, StandardOpenOption.APPEND);
            Files.write(path, fee, StandardOpenOption.APPEND);
            
            Files.write(path, changeHeading, StandardOpenOption.APPEND);
            Files.write(path, change, StandardOpenOption.APPEND);
            
            Files.write(path, denominationsHeading, StandardOpenOption.APPEND);
            
            if(calculatePayModel.getTwoHundredRands() > 0){
                Files.write(path, twoHundredRandData, StandardOpenOption.APPEND);
            }
             
            if(calculatePayModel.getOneHundredRands() > 0){
                Files.write(path, oneHundredRandData, StandardOpenOption.APPEND);
            }
            if(calculatePayModel.getFiftyRands() > 0){
                Files.write(path, fiftyRandData, StandardOpenOption.APPEND);
            }
            
            if(calculatePayModel.getTwentyRands() > 0){
                Files.write(path, twentyRandData, StandardOpenOption.APPEND);
            }
            
            if(calculatePayModel.getTenRands() > 0){
                  Files.write(path, tenRandData, StandardOpenOption.APPEND);
            
            }
            if(calculatePayModel.getFiveRands() > 0){
                Files.write(path, fiveRandData, StandardOpenOption.APPEND);
            }
            
            if(calculatePayModel.getTwoRands() > 0){
                Files.write(path, twoRandData, StandardOpenOption.APPEND);
            }
            
            if(calculatePayModel.getOneRands() > 0){
                Files.write(path, oneRandData, StandardOpenOption.APPEND);
            }
            
            if(calculatePayModel.getFiftyCents() > 0){
                 Files.write(path, fiftyCentData, StandardOpenOption.APPEND);
            }
            
            if(calculatePayModel.getTwentyCents() > 0){
                 Files.write(path, twentyCentData, StandardOpenOption.APPEND);
            
            }
            
            if(calculatePayModel.getTenCents() > 0){
                Files.write(path, tenCentData, StandardOpenOption.APPEND);
            }
             
            System.out.println("Data writen to transactions text file!");
            
        } catch (IOException ex) {
            Logger.getLogger(CreateTextFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void readFromTextFile() {
         
          String fileName = "C:\\dev\\projects\\netbeansprojects\\parking-meter-app\\src\\resources\\Files";
          String listItemEntryDate;
          String listItemExitDate;
         
            try {
            
            Scanner s = new Scanner(new File(fileName));
            ArrayList<String> list = new ArrayList<String>();
            
            while (s.hasNext()){
                    list.add(s.next());
            }
            
            s.close();
            
            listItemEntryDate = list.get(0);
            listItemExitDate = list.get(1);
            
            System.out.println(listItemEntryDate);
            System.out.println(listItemExitDate);
            
            
                    
        } catch (IOException ex) {
            Logger.getLogger(CreateTextFile.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }
     
     public void clearTextFile() {
        if(fileTransactions.exists()) {
            try {
                fileTransactions.delete();
                
                fileTransactions.createNewFile();
                
                if(fileTransactions.exists()){
                    System.out.println("file has been cleared");
                }
            } catch (IOException ex) {
                Logger.getLogger(CreateTextFile.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
     
} 
     
     
     
   

    

