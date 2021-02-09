/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.Interfaces.ParkingLotInterface;
import java.util.ArrayList;
import java.util.List;
import com.ict4315.week5.ParkingDetails;
/**
 *
 * @author iyasu
 */
public final class ParkingLot  extends Subject implements ParkingLotInterface{
    
    private  String id;
    private  String name;
    private  Address address;
    private  double standardDailyRate;
    private ParkingEvent parkingEvent;
    
    public ParkingLot(ParkingEvent parkingEvent){
       
        this.parkingEvent = parkingEvent;
    }
    
    public ParkingLot(String id, String name, Address address, double standardRate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.standardDailyRate  = standardRate;
    }

    public ParkingEvent getParkingDetails() {
        return parkingEvent;
    }

    public void setParkingEvent(ParkingEvent parkingEvent) {
        this.parkingEvent = parkingEvent;
        notifyObservers();
    }
    
    public Address getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public Money getDailyRate(CarType carType) {//movr this to discount basd on  car type

            return new Money( standardDailyRate,"USD");
            
    }

    public double getStandardDailyRate() {
        return standardDailyRate;
    }


}
