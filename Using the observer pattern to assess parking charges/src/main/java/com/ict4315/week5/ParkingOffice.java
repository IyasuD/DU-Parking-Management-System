/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;


import com.ict4315.week5.Interfaces.CarInterface;
import com.ict4315.week5.Interfaces.MoneyInterface;
import com.ict4315.week5.Interfaces.ParkingLotInterface;
import com.ict4315.week5.Interfaces.ParkingTransactionInterface;
import com.ict4315.week5.Interfaces.PermitInterface;
import com.ict4315.week5.Interfaces.PermitManagerInterface;
import java.util.ArrayList;
import java.util.List;

import com.ict4315.week5.Interfaces.TransactionManagerInterface;

/**
 *
 * @author nisca
 */
public class ParkingOffice {
    
    private String parkingOfficeName;
    private List<Customer> listOfCustomers = new ArrayList();
    private List<ParkingLot> listOfParkingLots = new ArrayList();
    private Address parkingOfficeAddress;
    private TransactionManagerInterface transactionManager;
    private PermitManagerInterface permitManager;

    public ParkingOffice(String parkingOfficeName, Address parkingOfficeAddress, TransactionManagerInterface transactionManager) {
        this.parkingOfficeName = parkingOfficeName;
        this.parkingOfficeAddress = parkingOfficeAddress;
        this.transactionManager = transactionManager;
        this.permitManager = permitManager;
    }

    public String getParkingOfficeName() {
        return parkingOfficeName;
    }

    public List<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public List<ParkingLot> getListOfParkingLots() {
        return listOfParkingLots;
    }

    public Address getParkingOfficeAddress() {
        return parkingOfficeAddress;
    }
   
   public PermitInterface register(CarInterface car) throws Exception {
      if(!listOfCustomers.contains(car.getOwner())) {
          throw new Exception(String.format("Customer %s is not yet registered with parking office.",car.getOwner().getCustomerName()));
      }
       
       return transactionManager.registerCar(car);
   } 
    
   public void register(Customer customer) throws Exception {
       
       if(!listOfCustomers.contains(customer)) {
           listOfCustomers.add(customer);
       }
       else {
           throw new Exception("Customer already registered");
       }
   }
   
   public void addParkingLot(ParkingLot parkingLot) throws Exception {
      if( !listOfParkingLots.contains(parkingLot) ){
          listOfParkingLots.add(parkingLot);
      }
      else {
          throw new Exception("Parking lot already added");
      }        
   }
   
   public String displayParkingLots() {
       
       StringBuilder result = new StringBuilder();
       double dailyRateCompact;
       double dailyRateSuv;
       String compactRateCurrency;
       String suvRateCurrency;
       
       result.append(String.format("%n"));
       if(listOfParkingLots.size() > 0) {
        result.append(String.format("Parking Lot Name,  SUV Rate,  Compact Car Rate%n"));
        for(ParkingLot parkingLot : listOfParkingLots) {
            dailyRateCompact = parkingLot.getDailyRate(CarType.COMPACT).getAmount();
            compactRateCurrency = parkingLot.getDailyRate(CarType.COMPACT).getCurrency();
            dailyRateSuv = parkingLot.getDailyRate(CarType.SUV).getAmount();
            suvRateCurrency = parkingLot.getDailyRate(CarType.SUV).getCurrency();
            result.append(String.format("%s: (%s) %s , (%s) %s%n",parkingLot.getName(),dailyRateSuv, suvRateCurrency, dailyRateCompact, compactRateCurrency)); 
        }
       }
       else {
           result.append("No parking lots.");
       }
       return result.toString();       
   }
   
   public ParkingTransactionInterface park(Date parkingDate, PermitInterface parkingPermit,ParkingLotInterface parkingLot) throws Exception {       
       return transactionManager.park(parkingDate, parkingPermit, parkingLot);
   }
   
   public MoneyInterface getParkingCharges(PermitInterface permit) {       
       return transactionManager.getParkingCharges(permit);    
   }
   
   public MoneyInterface getParkingCharges(Customer customer) {
       return transactionManager.getParkingCharges(customer);
   }
   
              
}
