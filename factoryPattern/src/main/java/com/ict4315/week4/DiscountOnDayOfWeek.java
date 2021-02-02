/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

//import com.ict4315.week3.Interfaces.Discount;
import com.ict4315.week4.Interfaces.ParkingChargeStrategy;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author iyasu
 */
public class DiscountOnDayOfWeek implements ParkingChargeStrategy {

    static final double NO_DISCOUNT = 0.0;
    static final double DISCOUNT = 25.0;
    private ParkingDetails parkingDetails;

    public DiscountOnDayOfWeek(ParkingDetails parkingDetails) {

        this.parkingDetails = parkingDetails;

    }

    private DayOfWeek identifyTheDate(ParkingDetails parkingDetails) {
        DayOfWeek dayOfWeek = parkingDetails.getTimeTicketPurchased().getDayOfWeek();

        return dayOfWeek;

    }

    public double apply(ParkingDetails parkingDetails) {
        DayOfWeek day = identifyTheDate(parkingDetails);
        int dateInNumber = 1;
        switch (day) {
            case SATURDAY:
                dateInNumber = 6;
                break;
            case SUNDAY:
                dateInNumber = 7;
                ;
                break;

        }
        return dateInNumber == 6 || dateInNumber == 7 ? DISCOUNT : NO_DISCOUNT;
    }
}
