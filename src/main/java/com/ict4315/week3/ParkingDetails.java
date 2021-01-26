/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author iyasu
 */
public class ParkingDetails {

   
    private CarType carType;
   
    private LocalDateTime timeTicketPurchased;
   
 
    private int hourSelection;
    private boolean isSpecialDay;
    
    public ParkingDetails(CarType carType,LocalDateTime timeTicketPurchased,int hourSelection, boolean isSpecialDay ){
     
        this.timeTicketPurchased = timeTicketPurchased;
        this.carType =carType;
       
        this.hourSelection = hourSelection;
        this.isSpecialDay = isSpecialDay;
        //this.cal.setTime(this.timeTicketPurchased.getTime());
    }

    public LocalDateTime getTimeTicketPurchased() {
        return timeTicketPurchased;
    }
     public CarType getCarType() {
        return carType;
    }

    public LocalDateTime getDateTicketPurchased() {
        return timeTicketPurchased;
    }

    public int getHourSelection() {
        return hourSelection;
    }

    public boolean isIsSpecialDay() {
        return isSpecialDay;
    }
      
}
