/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import com.ict4315.week5.Interfaces.ParkingChargeCalculator;

/**
 *
 * @author iyasu
 */
public class ParkingChargeFactory {


 private ParkingChargeCalculator calc;

 


 public ParkingChargeCalculator getParkingChargeCalculator(String strategy){


  if("CarTypeDiscountForStudents".equalsIgnoreCase(strategy)){


 return new VehicleTypeDiscount(new StudentParkingCharge());


 }else if("WeekDayDiscountForStudents".equalsIgnoreCase(strategy)){


 return new WeekDayDiscount(new StudentParkingCharge());


 }else if("BothDiscountForStudents".equalsIgnoreCase(strategy)){


 return new VehicleTypeDiscount(new WeekDayDiscount(new StudentParkingCharge()));

 }


 return new StudentParkingCharge();

 }

}

