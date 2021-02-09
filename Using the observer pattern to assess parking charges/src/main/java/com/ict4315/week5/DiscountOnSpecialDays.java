/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

//import com.ict4315.week3.Interfaces.Discount;
import com.ict4315.week5.Interfaces.ParkingChargeStrategy;

/**
 *
 * @author iyasu
 */
public class DiscountOnSpecialDays implements ParkingChargeStrategy {

    static final double NO_DISCOUNT = 0.0;
    static final double DISCOUNT = 5.0;
    private ParkingDetails parkingDetails;

    public DiscountOnSpecialDays(ParkingDetails parkingDetails) {

        this.parkingDetails = parkingDetails;

    }

    @Override
    public double apply(ParkingDetails parkingDetails) {
        return parkingDetails.isIsSpecialDay() ? DISCOUNT : NO_DISCOUNT;
    }
}
