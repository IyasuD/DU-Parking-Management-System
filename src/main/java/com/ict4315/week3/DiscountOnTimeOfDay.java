/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3;

import com.ict4315.week3.Interfaces.Discount;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author iyasu
 */
public class DiscountOnTimeOfDay implements Discount {

    static final double NO_DISCOUNT = 0.0;
    static final double DISCOUNT = 10.0;
    private ParkingDetails parkingDetails;

    public DiscountOnTimeOfDay(ParkingDetails parkingDetails) {

        this.parkingDetails = parkingDetails;

    }

    private boolean isPrimeTime(ParkingDetails parkingDetails) {
        LocalDateTime reference = LocalDateTime.of(0, Month.MARCH, 4, 17, 00);
        LocalDateTime expirationTime = parkingDetails.getTimeTicketPurchased().plusHours(parkingDetails.getHourSelection());
        return parkingDetails.getDateTicketPurchased().getHour()
                <= reference.getHour()
                && expirationTime.getHour()
                <= reference.getHour();

    }

    @Override
    public double apply(ParkingDetails parkingDetails) {
        return isPrimeTime(parkingDetails) ? NO_DISCOUNT : DISCOUNT;
    }

}
