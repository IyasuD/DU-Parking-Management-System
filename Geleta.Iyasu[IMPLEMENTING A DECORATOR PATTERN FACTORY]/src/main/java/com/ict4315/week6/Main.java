package com.ict4315.week6;





public class Main {

	public static void main(String[] args) {
           AbstractDiscount[] records = {
                new FlatRate(6.00),
                new FlatRate(8.00),
                new FlatRate(16.00),
                new FlatRate(24.00),
                new FlatRate(18.00),
                new FlatRate(6.00),
                 new FlatRate(24.00),
        };
           
           //original parkingcharge without discount
           System.out.println("Original Price");	
       for (AbstractDiscount record : records)
            System.out.println(record.apply());
           
        // calculate 8 possible discounts.Withfour possible strategies one can create 
        // different possiblities 
        //using the ParkingChargeFactory
        ParkingChargeCalculatorFactory pcf = new ParkingChargeCalculatorFactory();
               records[0] = pcf.getInstance("dayOfWeek",records[0]);
		records[1] = pcf.getInstance("specialDays",records[1]);
		records[2] = pcf.getInstance("timeOfDay",records[2]);
		records[3] = pcf.getInstance("dayOfWeekandspecialDays",records[3]);
                records[4] = pcf.getInstance("dayOfWeekandtimeofDays",records[4]);
            
                
		System.out.println(" Price After Discount");
		for (AbstractDiscount record : records)
            System.out.println(record.apply());

    
       
        }
}
