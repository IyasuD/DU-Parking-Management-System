package com.ict4315.week6;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ict4315.week5;
//
//import com.ict4315.week5.DiscountOnSpecialDaysDecorator;
//import com.ict4315.week5.DiscountOnVehicleTypeDecorator;
//import com.ict4315.week5.CarType;
//import com.ict4315.week5.DiscountOnTimeOfDayDecorator;
//import com.ict4315.week5.ParkingDetails;
//import com.ict4315.week5.DiscountOnDayOfWeekDecorator;
//import com.ict4315.week5.FinancialCalculator;
//import com.ict4315.week5.Interfaces.Discount;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//
///**
// *
// * @author iyasu
// */
//public class FinancialCalculatorTest {
//    private static FinancialCalculator financialCalculator;
//     private static List<Discount> discounts;
//    
//    
//    public FinancialCalculatorTest() {
//    }
//
//    @BeforeAll
//    public static void setUpClass() throws Exception {
////        LocalDateTime localDateTime = LocalDateTime.of(2021,01,23,18,30);
////        int hourSelection = 4;
////        System.out.println("apply");
////        discounts = new ArrayList<>();
////        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT, localDateTime, hourSelection, false);
////        DiscountOnTimeOfDayDecorator discotd = new DiscountOnTimeOfDayDecorator(parkingDetails) ;
////        discounts.add(discotd);
////        DiscountOnDayOfWeekDecorator discodw = new DiscountOnDayOfWeekDecorator(parkingDetails) ;
////        discounts.add(discodw);
////        DiscountOnSpecialDaysDecorator discosd = new DiscountOnSpecialDaysDecorator(parkingDetails) ;
////        discounts.add(discosd);
////        DiscountOnVehicleTypeDecorator discovt = new DiscountOnVehicleTypeDecorator(parkingDetails) ;
////        discounts.add(discovt);
////        
////        financialCalculator = new FinancialCalculator(discounts, parkingDetails);
////        
//    }
//
//    @AfterAll
//    public static void tearDownClass() throws Exception {
//    }
//
//    @BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @AfterEach
//    public void tearDown() throws Exception {
//    }
//    /**
//     * Test of calculateDiscount method, of class FinancialCalculator.
//     */
//    @Test
//    public void testCalculateDiscountPassWithAllDiscountsApplied() {
//        
//        LocalDateTime localDateTime = LocalDateTime.of(2021,01,23,18,30);
//        int hourSelection = 4;
//        System.out.println("apply");
//        List discounts = new ArrayList<>();
//        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT, localDateTime, hourSelection, true);
//        DiscountOnTimeOfDayDecorator discotd = new DiscountOnTimeOfDayDecorator(parkingDetails) ;
//        discounts.add(discotd);
//        DiscountOnDayOfWeekDecorator discodw = new DiscountOnDayOfWeekDecorator(parkingDetails) ;
//        discounts.add(discodw);
//        DiscountOnSpecialDaysDecorator discosd = new DiscountOnSpecialDaysDecorator(parkingDetails) ;
//        discounts.add(discosd);
//        DiscountOnVehicleTypeDecorator discovt = new DiscountOnVehicleTypeDecorator(parkingDetails) ;
//        discounts.add(discovt);
//        
//        financialCalculator = new FinancialCalculator(discounts, parkingDetails);
//        
//        double expected = 10;
//        
//        assertEquals(financialCalculator.calculateFeeAfterDiscount(25), expected);
//    }
//    
//    
//       @Test
//    public void testCalculateDiscountPassWithVehicleTypeDiscountsApplied() {
//        
//        LocalDateTime localDateTime = LocalDateTime.of(2021,01,21,8,30);
//        int hourSelection = 4;
//        System.out.println("apply");
//       List discounts = new ArrayList<>();
//        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT, localDateTime, hourSelection, false);
//        DiscountOnVehicleTypeDecorator discovt = new DiscountOnVehicleTypeDecorator(parkingDetails) ;
//        discounts.add(discovt);
//        
//        financialCalculator = new FinancialCalculator(discounts, parkingDetails);
//        
//        double expected = 20;
//        
//        assertEquals(financialCalculator.calculateFeeAfterDiscount(25), expected);
//    }
//    
//       @Test
//     public void testCalculateDiscountPassWithDayOfTheWeekDiscountsApplied() {
//        
//        LocalDateTime localDateTime = LocalDateTime.of(2021,01,23,8,30);
//        int hourSelection = 4;
//        System.out.println("apply");
//       List discounts = new ArrayList<>();
//        ParkingDetails parkingDetails = new ParkingDetails(CarType.SUV, localDateTime, hourSelection, false);
//        DiscountOnTimeOfDayDecorator discotd = new DiscountOnTimeOfDayDecorator(parkingDetails) ;
//        discounts.add(discotd);
//        DiscountOnDayOfWeekDecorator discodw = new DiscountOnDayOfWeekDecorator(parkingDetails) ;
//        discounts.add(discodw);
//        DiscountOnSpecialDaysDecorator discosd = new DiscountOnSpecialDaysDecorator(parkingDetails) ;
//        discounts.add(discosd);
//        DiscountOnVehicleTypeDecorator discovt = new DiscountOnVehicleTypeDecorator(parkingDetails) ;
//        discounts.add(discovt);
//        
//        financialCalculator = new FinancialCalculator(discounts, parkingDetails);
//        
//        double expected = 75;
//        
//        assertEquals(financialCalculator.calculateFeeAfterDiscount(100), expected);
//    }
// 
//    
//
//  
//}
