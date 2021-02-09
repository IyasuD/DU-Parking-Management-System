package com.ict4315.week5;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ict4315.week4;
//
//import java.time.LocalDateTime;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
///**
// *
// * @author iyasu
// */
//public class ParkingTransactionTest {
//    
//    public ParkingTransactionTest() {
//    }
//
//    /**
//     * Test of getDate method, of class ParkingTransaction.
//     */
//    @Test
//    public void testConstructorPass() throws Exception{
//        
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Date parkingDate = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute());
//        
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        ParkingLot parkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",northSideParkingLotAddress);
//        Car car = new Car(CarType.COMPACT, "123-44441", customer);
//
//        ParkingPermit parkingPermit = new ParkingPermit(1,car,parkingDate);
//        
//        ParkingTransaction parkingTransaction = new ParkingTransaction(parkingDate,parkingPermit,parkingLot);
//        assertEquals(parkingPermit, parkingTransaction.getPermit());
//        assertEquals(parkingLot, parkingTransaction.getParkingLot());
//
//        
//    }
//
// @Test
//    public void testConstructorDifferntParkingLot() throws Exception{
//        
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Date parkingDate = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute());
//        
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        Address southSideParkingLotAddress = new Address(2, "5 South Panda Street", "South H", "Queens", "NY", "USA", "");
//        ParkingLot parkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        ParkingLot parkingLot2 = new ParkingLot(1,"North Side Lot",southSideParkingLotAddress,12.5);
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",northSideParkingLotAddress);
//        Car car = new Car(CarType.COMPACT, "123-44441", customer);
//
//        ParkingPermit parkingPermit = new ParkingPermit(1,car,parkingDate);
//        
//        ParkingTransaction parkingTransaction = new ParkingTransaction(parkingDate,parkingPermit,parkingLot);
//        assertNotEquals(parkingLot2, parkingTransaction.getParkingLot());
//        
//    }
//    
//}
