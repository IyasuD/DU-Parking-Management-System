/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import com.ict4315.week4.Interfaces.ParkingChargeStrategy;

/**
 *
 * @author iyasu
 */
public class ParkingChargeStrategyFactory {
    private ParkingDetails parkingDetails;
    public ParkingChargeStrategy getInstance(String str){
        if(str.equalsIgnoreCase("dayOfWeek"))
            return new DiscountOnDayOfWeek(parkingDetails);
        else if(str.equalsIgnoreCase("specialDays"))
            return new DiscountOnSpecialDays(parkingDetails);
        else if(str.equalsIgnoreCase("timeOfDay"))
            return new DiscountOnTimeOfDay(parkingDetails);
        else
            return new DiscountOnVehicleType(parkingDetails);
    }
}
