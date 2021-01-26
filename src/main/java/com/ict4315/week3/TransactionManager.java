/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3;

import com.ict4315.week3.Interfaces.CarInterface;
import com.ict4315.week3.Interfaces.MoneyInterface;
import com.ict4315.week3.Interfaces.ParkingLotInterface;
import com.ict4315.week3.Interfaces.ParkingTransactionInterface;
import com.ict4315.week3.Interfaces.PermitInterface;
import com.ict4315.week3.Interfaces.PermitManagerInterface;
import com.ict4315.week3.Interfaces.PersonInterface;
import com.ict4315.week3.Interfaces.TransactionManagerInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nisca
 */
public class TransactionManager implements TransactionManagerInterface {
    
   private List<ParkingTransaction> transactions;
   private PermitManagerInterface permitManager;
   
   public TransactionManager(PermitManagerInterface permitManager) {
       this.permitManager = permitManager;
       transactions = new ArrayList<ParkingTransaction>();
   }
   
   public ParkingTransactionInterface park(Date parkingDate, PermitInterface permit, ParkingLotInterface parkingLot) throws Exception {
            
    ParkingTransaction parkingTransaction = new ParkingTransaction(parkingDate, permit, parkingLot);
    if(parkingDate.isGreaterThan(permit.getExpirationDate())) {
        throw new Exception("Parking permit already expired.");
    }
    if(permitManager.carAlreadyRegistered(permit.getCar())) {
        
        if(!transactions.contains(parkingTransaction)) {
           transactions.add(parkingTransaction);
           return parkingTransaction;
        }
        else {
            throw new Exception("Duplicate transaction.");
        }
    }
    else {
        throw new Exception ("Car not registered");
    }

   }

    public List<ParkingTransaction> getTransactions() {
        return transactions;
    }

    public PermitManagerInterface getPermitManager() {
        return permitManager;
    }
    
    public PermitInterface registerCar(CarInterface car) throws Exception {
      
       if(!permitManager.carAlreadyRegistered(car)){
           return permitManager.register(car);
       }
       else {
           throw new Exception("Car already registered");
       }
    
   }
  
   
   public MoneyInterface getParkingCharges(PermitInterface permit) {
       double sumParkingCharges = 0;
       for(ParkingTransaction transaction : transactions) {
           if(transaction.getPermit().equals(permit)) {
               sumParkingCharges += transaction.getChargedAmount().getAmount();              
           }   
       }
       return new Money(sumParkingCharges, "USD");
   }
   
    public MoneyInterface getParkingCharges(PersonInterface customer) {
       double sumParkingCharges = 0;
       for(ParkingTransaction transaction : transactions) {
           if(transaction.getPermit().getCar().getOwner().equals(customer)) {
               sumParkingCharges += transaction.getChargedAmount().getAmount();              
           }   
       }
       return new Money(sumParkingCharges, "USD");
   }
   
}
