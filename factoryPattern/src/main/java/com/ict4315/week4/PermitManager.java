/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import com.ict4315.week4.ParkingPermit;
import com.ict4315.week4.Interfaces.CarInterface;
import com.ict4315.week4.Car;
import com.ict4315.week4.Interfaces.PermitInterface;
import com.ict4315.week4.Interfaces.PermitManagerInterface;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author iyasu
 */
public class PermitManager implements PermitManagerInterface {
    
   List<ParkingPermit> parkingPermitList;
   
   public PermitManager() {
        parkingPermitList = new ArrayList<ParkingPermit>();
   }
   
   @Override
   public ParkingPermit register (CarInterface car) throws Exception {
       if(!carAlreadyRegistered(car)) {
            LocalDateTime localDate = LocalDateTime.now();
            Date expirationDate = new Date(localDate.getDayOfMonth(),localDate.getMonthValue(),localDate.getYear() + 1, localDate.getHour(), localDate.getMinute());
            parkingPermitList.add(new ParkingPermit(parkingPermitList.size() + 1,car, expirationDate ));
            return parkingPermitList.get(parkingPermitList.size() - 1);
      }
       else {
           throw new Exception ("Car already registered");
       }
       
   }

   @Override
    public List<ParkingPermit> getParkingPermitList() {
        return parkingPermitList;
    }
    
   @Override
    public boolean carAlreadyRegistered(CarInterface car) {
        for(ParkingPermit permit : parkingPermitList) {
          if(permit.getCar().equals(car)) {
              return true;
          }
      }
       return false;
    }
   
   
    
}
