/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import com.ict4315.week4.Interfaces.ParkingChargeStrategy;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iyasu
 */
public class TransactionManagerMain {

    public static void main(String[] args) {

        //Instantiating a Parking Permit
        LocalDateTime localDateTime = LocalDateTime.of(2021, 01, 23, 18, 30);
        int hourSelection = 4;
        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT, localDateTime, hourSelection, true);
        ParkingChargeStrategyFactory pcsf = new ParkingChargeStrategyFactory();

        //Passing which object to instantiate
        ParkingChargeStrategy obj1 = pcsf.getInstance("dayOfWeek");
        ParkingChargeStrategy obj2 = pcsf.getInstance("specialDays");
        ParkingChargeStrategy obj3 = pcsf.getInstance("timeOfDay");
        ParkingChargeStrategy obj4 = pcsf.getInstance("vehicleType");

        //caling the methods of the selected sub classes
        double expectedPercentage1 = obj1.apply(parkingDetails);
        double expectedPercentage2 = obj2.apply(parkingDetails);
        double expectedPercentage3 = obj3.apply(parkingDetails);
        double expectedPercentage4 = obj4.apply(parkingDetails);

        System.out.println("Discount Percentage when day of the Week is selected: " + expectedPercentage1);
        System.out.println("Discount Percentage when the is special date is set: " + expectedPercentage2);
        System.out.println("Discount Percentage when the time is not prime time: " + expectedPercentage3);
        System.out.println("Discount Percentage when COMPACT Car is selected: " + expectedPercentage4);
    }

}
