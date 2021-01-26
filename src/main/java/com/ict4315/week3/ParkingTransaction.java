/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3;

import com.ict4315.week3.Date;
import com.ict4315.week3.Interfaces.MoneyInterface;
import com.ict4315.week3.Interfaces.ParkingLotInterface;
import com.ict4315.week3.Interfaces.ParkingTransactionInterface;
import com.ict4315.week3.Interfaces.PermitInterface;

/**
 *
 * @author iyasu
 */
public final class ParkingTransaction implements ParkingTransactionInterface {
    
    private final Date date;
    private final PermitInterface permit;
    private final ParkingLotInterface parkingLot;
    private final MoneyInterface chargedAmount;

    public ParkingTransaction(Date date, PermitInterface permit, ParkingLotInterface parkingLot) {
        this.date = date;
        this.permit = permit;
        this.parkingLot = parkingLot;
        this.chargedAmount = parkingLot.getDailyRate(permit.getCar().getType());
    }
    
    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public PermitInterface getPermit() {
        return permit;
    }

    @Override
    public ParkingLotInterface getParkingLot() {
        return parkingLot;
    }

    @Override
    public MoneyInterface getChargedAmount() {
        return chargedAmount;
    }
    
    @Override
      public boolean equals(Object obj) {
      ParkingTransaction comparedParkingTransaction = (ParkingTransaction)obj;
      
      return date.equals(comparedParkingTransaction.getDate()) &&
             permit.equals(comparedParkingTransaction.getPermit()) &&
             chargedAmount.equals(comparedParkingTransaction.getChargedAmount());
       
    }
}
