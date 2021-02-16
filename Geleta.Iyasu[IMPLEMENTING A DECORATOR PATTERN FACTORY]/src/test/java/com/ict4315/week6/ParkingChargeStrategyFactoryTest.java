package com.ict4315.week6;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ict4315.week5;
//
////import com.ict4315.week5.ParkingChargeStrategyFactory;
//import com.ict4315.week5.ParkingDetails;
//import com.ict4315.week5.CarType;
//import com.ict4315.week5.Interfaces.ParkingChargeStrategy;
//import java.time.LocalDateTime;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// *
// * @author iyasu
// */
//public class ParkingChargeStrategyFactoryTest {
//
//  
//
//    /**
//     * Test of getInstance method, of class ParkingChargeStrategyFactory.
//     */
//    @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        String strDayofWeek = "dayOfWeek";
//        String strSpecialDays = "specialDays";
//        String strTimeOfDay = "timeOfDay";
//        String strVehicleType = "vehicleType";
//        
//         
//        
//         LocalDateTime localDateTime = LocalDateTime.of(2021, 01, 23, 18, 30);
//        int hourSelection = 4;
//        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT, localDateTime, hourSelection, true);
//        ParkingChargeStrategyFactory instance = new ParkingChargeStrategyFactory();
//        double expResultdow =  25.0;
//        double expResultsd =  5.0;
//        double expResulttod =  10.0;
//        double expResultvt =  20.0;
//        ParkingChargeStrategy tempResultdow = instance.getInstance(strDayofWeek);
//        ParkingChargeStrategy tempResultsd = instance.getInstance(strSpecialDays);
//        ParkingChargeStrategy tempResulttod = instance.getInstance(strTimeOfDay);
//        ParkingChargeStrategy tempResultvt = instance.getInstance(strVehicleType);
//        double resultdow = tempResultdow.apply(parkingDetails);
//        double resultsd = tempResultsd.apply(parkingDetails);
//        double resulttod = tempResulttod.apply(parkingDetails);
//        double resultvt = tempResultvt.apply(parkingDetails);
//        assertEquals(expResultdow, resultdow);
//        assertEquals(expResultsd, resultsd);
//        assertEquals(expResulttod, resulttod);
//        assertEquals(expResultvt, resultvt);
//       
//    }
//     
//  
//    
//}
