/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import com.ict4315.week4.Interfaces.ParkingLotInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iyasu
 */
public final class ParkingLot <T> implements ParkingLotInterface {
    
    private final T id;
    private final String name;
    private final Address address;
    private final double standardDailyRate;
    
    public ParkingLot(T id, String name, Address address, double standardRate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.standardDailyRate  = standardRate;
    }

    public Address getAddress() {
        return address;
    }

    public T getId() {
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
