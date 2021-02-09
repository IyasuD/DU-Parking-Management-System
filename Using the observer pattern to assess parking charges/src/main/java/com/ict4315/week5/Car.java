/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.Interfaces.CarInterface;

/**
 *
 * @author Iyasu
 */
public final class Car implements CarInterface {
    
    private final CarType carType;
    private final String licensePlate;
    private final Customer owner;

    public Car(CarType carType, String licensePlate, Customer owner) throws Exception {
        if(licensePlate == null || licensePlate.isEmpty()) {
            throw new Exception("License plate number must be at least 6 characters long.");
        }           
        if(owner == null) {
            throw new Exception("A car needs a valid owner.");
        }
            this.carType = carType;
            this.licensePlate = licensePlate;
            this.owner = owner;
        
    }

    @Override
    public CarType getType() {
        return carType;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public Customer getOwner() {
        return owner;
    }
    
    
     
   public boolean equals(Object obj) {
      Car comparedCar = (Car)obj;
      
      return  getType().equals(comparedCar.getType())&&
              licensePlate.equals(comparedCar.licensePlate) &&
              owner.equals(comparedCar.owner);
    
   }
    
}
