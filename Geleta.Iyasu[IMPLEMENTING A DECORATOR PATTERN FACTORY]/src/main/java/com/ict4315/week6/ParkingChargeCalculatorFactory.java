/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

/**
 *
 * @author iyasu
 */
public class ParkingChargeCalculatorFactory {

  

    public AbstractDiscount getInstance(String str,AbstractDiscount record){
        if(str.equalsIgnoreCase("dayOfWeek"))
            return  new WeekDayDecorator(record);
        else if(str.equalsIgnoreCase("specialDays"))
            return new SpecialDayDecorator(record);
        else if(str.equalsIgnoreCase("timeOfDay"))
            return new PeakHourDecorator(record);
        else if(str.equalsIgnoreCase("dayOfWeekandspecialDays"))
            return new WeekDayDecorator(new SpecialDayDecorator(record));
         else if(str.equalsIgnoreCase("dayOfWeekandtimeofDays"))
            return new WeekDayDecorator(new PeakHourDecorator(record));
        else
            return new CarTypeDecorator(record);
    }
    
}
