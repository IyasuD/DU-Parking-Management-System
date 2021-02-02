/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

//import com.ict4315.week3.Interfaces.Discount;
import com.ict4315.week4.Interfaces.ParkingChargeStrategy;

/**
 *
 * @author iyasu
 */
public class DiscountOnVehicleType implements ParkingChargeStrategy {

    static final double NO_DISCOUNT = 0.0;
    static final double DISCOUNT = 20.0;
    private ParkingDetails parkingDetails;

    public DiscountOnVehicleType(ParkingDetails parkingDetails) {

        this.parkingDetails = parkingDetails;

    }

    @Override
    public double apply(ParkingDetails parkingDetails) {
        CarType carType = parkingDetails.getCarType();
        int selectionInNumber = 1;
        switch (carType) {
            case SUV:
                selectionInNumber = 2;
                break;
            case COMPACT:
                selectionInNumber = 3;
                break;

        }
        return selectionInNumber == 3 ? DISCOUNT : NO_DISCOUNT;
    }

}
