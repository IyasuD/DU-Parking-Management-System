/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

/**
 *
 * @author iyasu
 */
public class ObserverMain {
    public static void main(String[] args) {
        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT);
        ParkingEvent parkingEvent = new ParkingEvent(parkingDetails);
        ParkingLot parkingLot = new ParkingLot(parkingEvent);
        TransactionManagerMain tmm = new TransactionManagerMain(parkingLot);
        parkingLot.addObserver(tmm);
        
        // the car left the parking after three hours
        //for the sake of simplicity I have set it to be manually entered
         parkingEvent.setOutTime(parkingEvent.getInTime().plusHours(3));
        parkingLot.setParkingEvent(parkingEvent);
        
       
    }
   
}
