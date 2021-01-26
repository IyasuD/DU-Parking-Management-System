/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3;

import com.ict4315.week3.Interfaces.CarInterface;
import com.ict4315.week3.Interfaces.PermitInterface;
/**
 *
 * @author iyasu
 */
public final class ParkingPermit <T> implements PermitInterface{
    
    private final T id;
    private final CarInterface car;
    private final Date expiration;

    public ParkingPermit(T id, CarInterface car, Date expiration) throws Exception {
       try {
            if(id != null || Integer.parseInt(id.toString()) > 0 ) {
               this.id = id;
               this.car = car;
               this.expiration = expiration;
           }
           else {
               throw new Exception ("Invalid permit id.");
           }
       }
       catch (Exception e) {
           throw new Exception ("Invalid permit id.");
       }
        
    }

    public T getId() {
        return id;
    }

    public CarInterface getCar() {
        return car;
    }

    public Date getExpirationDate() {
        return expiration;
    }
    
  public boolean equals(Object obj) {
      ParkingPermit comparedPermit = (ParkingPermit)obj;
      
      return id == comparedPermit.getId() &&
              car.equals(comparedPermit.getCar()) &&
              expiration.equals(comparedPermit.getExpirationDate());
  }
    
    
}
