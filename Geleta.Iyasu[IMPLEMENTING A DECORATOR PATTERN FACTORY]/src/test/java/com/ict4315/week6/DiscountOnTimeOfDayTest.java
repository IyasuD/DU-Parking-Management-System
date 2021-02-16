package com.ict4315.week6;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ict4315.week5;
//
//import com.ict4315.week5.CarType;
//import com.ict4315.week5.DiscountOnTimeOfDayDecorator;
//import com.ict4315.week5.ParkingDetails;
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
//public class DiscountOnTimeOfDayTest {
//
//    public void testApply() {
//        LocalDateTime localDateTime = LocalDateTime.of(2021, 01, 23, 18, 30);
//        int hourSelection = 4;
//        System.out.println("apply");
//        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT, localDateTime, hourSelection, false);
//        DiscountOnTimeOfDayDecorator instance = new DiscountOnTimeOfDayDecorator(parkingDetails);
//        double expResult = 10.0;
//        double result = instance.apply(parkingDetails);
//        assertEquals(expResult, result);
//    }
//
//}
