/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author iyasu
 */
public class ParkingEvent extends Subject {

    private String lotNumber;
    private LocalTime inTime;
    private LocalTime outTime;
    private ParkingDetails parkingDetails;
    private LocalTime time = LocalTime.now();

    public String getLotNumber() {
        return lotNumber;
    }

    public ParkingEvent(ParkingDetails parkingDetails) {

        this.parkingDetails = parkingDetails;
        this.lotNumber = DULotGenerator.getInstance().generateID();
        setInTime(time);
    }

    public LocalTime getInTime() {
        return inTime;
    }

    public void setInTime(LocalTime time) {

        this.inTime = time;
        //notifyObservers();
    }

    public LocalTime getOutTime() {
        return outTime;
    }

    public void setOutTime(LocalTime outTime) {
        // this.outTime = inTime.plusHours(parkingDetails.getHourSelection()) ;
        this.outTime = outTime;
        notifyObservers();
    }

    public ParkingDetails getParkingDetails() {
        return parkingDetails;
    }
    public long duration(){
           Duration duration = Duration.between(getInTime(),getOutTime() );
        return duration.toHours();
    }

    public void setParkingDetails(ParkingDetails parkingDetails) {
        this.parkingDetails = parkingDetails;
    }

}
