/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import com.ict4315.week5.Interfaces.Discount;
import com.ict4315.week5.Interfaces.ParkingChargeStrategy;
import com.ict4315.week5.Interfaces.ParkingObserver;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iyasu
 */
public class TransactionManagerMain implements ParkingObserver {
    private ParkingLot parkingLot;
    private static final  double FLAT_RATE = 2.0;
  private List<ParkingEvent> transactions;
  private FinancialCalculator financialCalculator;
     
    public TransactionManagerMain(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
    

    @Override
    public void update() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm a");
       System.out.println("A/An " + parkingLot.getParkingDetails().
               getParkingDetails().
               getCarType() + " car has entered the Parking lot at " +
               parkingLot.getParkingDetails().getInTime().format(dtf));
         System.out.println("The Car was Parked at slot#:  " + parkingLot.getParkingDetails().getLotNumber());
       System.out.println("The  " + parkingLot.getParkingDetails().
               getParkingDetails().
               getCarType() + " car left the spot at: " +
               parkingLot.getParkingDetails().getOutTime().format(dtf));
       // double total =  calculateFee();
       System.out.println("The car was parked for: " + parkingLot.getParkingDetails().duration() + "hours.");
       double totalAmount = calculateFee(parkingLot.getParkingDetails().duration(), FLAT_RATE);
       
        System.out.println("Your total Before discount: " + totalAmount);
//        DiscountOnDayOfWeekDecorator instance = new DiscountOnDayOfWeekDecorator(parkingLot.getParkingDetails());
//            new DiscountOnDayOfWeekDecorator(new FlatRate());
       LocalDateTime dt =  parkingLot.getParkingDetails().getParkingDetails().getDateTicketPurchased();
   //     System.out.println("Discount Rate: " + new DiscountOnDayOfWeekDecorator(parkingLot.getParkingEvent()).apply(parkingLot.getParkingEvent()));
//financialCalculator.calculateFeeAfterDiscount(tot)
        //calculate the total amount
        //apply the discounts


    }

    private double calculateFee(long duration, double flatRate) {
        return duration * flatRate;
    }
    

}
