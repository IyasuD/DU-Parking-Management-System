/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.Interfaces.Discount;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Iyasu
 */
public class FinancialCalculator {

    private List<Discount> discounts;
    private double flatRate;
    private double totalPercentage;
    private ParkingDetails parkingDetails;
    private double amount;
    public FinancialCalculator(List<Discount> discounts, ParkingDetails parkingDetails) {
        this.discounts = discounts;
        this.parkingDetails = parkingDetails;
        this.flatRate = 2.0;
        this.totalPercentage = 0.0;
    }
  
    public double calculateFeeAfterDiscount(double onAmount) {
        double discountPercentage = calculateTotalPercentageDiscount();

        return onAmount - ((discountPercentage / 100) * onAmount);
    }

    private double calculateTotalPercentageDiscount() {
        for (Discount d : discounts) {
            this.totalPercentage += d.apply(this.parkingDetails);
        }
        return totalPercentage;
    }

}
