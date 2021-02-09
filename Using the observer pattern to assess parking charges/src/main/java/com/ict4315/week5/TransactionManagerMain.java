/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.Interfaces.Discount;
import com.ict4315.week5.Interfaces.ParkingChargeStrategy;
import com.ict4315.week5.Interfaces.ParkingObserver;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iyasu
 */
public class TransactionManagerMain implements ParkingObserver {
    private ParkingLot parkingLot;
  private List<ParkingEvent> transactions;
     
    public TransactionManagerMain(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
    

    @Override
    public void update() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm a");
       System.out.println("A/An " + parkingLot.getParkingDetails().
               getParkingDetails().
               getCarType() + " car has entered the Parking lot at " +
               parkingLot.getParkingDetails().getInTime().format(dtf));
         System.out.println("The Car was Parked at slot#:  " + parkingLot.getParkingDetails().getLotNumber());
       System.out.println("The  " + parkingLot.getParkingDetails().
               getParkingDetails().
               getCarType() + " car left the spot at: " +
               parkingLot.getParkingDetails().getOutTime().format(dtf));
       System.out.println("register the  charged transaction by calling the park method");
        


    }
    

}
