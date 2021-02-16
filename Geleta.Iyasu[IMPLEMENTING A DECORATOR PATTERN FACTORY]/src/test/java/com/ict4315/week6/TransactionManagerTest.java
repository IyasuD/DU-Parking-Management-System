package com.ict4315.week6;

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
//import static org.junit.jupiter.api.Assertions.fail;
//
///**
// *
// * @author iyasu
// */
//public class TransactionManagerTest {
//    
//   
//    /**
//     * Test of park method, of class TransactionManager.
//     */
//    @Test
//    public void testParkPass() throws Exception {
//        
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Date permitExpirationDate = new Date(30, localDateTime.getMonthValue(), 2021, localDateTime.getHour(), localDateTime.getMinute());
//        Date parkingDate = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute());
//        int expectedListSize = 1;
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        ParkingLot parkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",northSideParkingLotAddress);
//        Car car = new Car(CarType.COMPACT, "123-44441", customer);
//
//        ParkingPermit parkingPermit = new ParkingPermit(1,car,permitExpirationDate);
//        
//        ParkingTransaction parkingTransaction = new ParkingTransaction(parkingDate,parkingPermit,parkingLot);
//        TransactionManager transactionManager = new TransactionManager(new PermitManager());
//        transactionManager.registerCar(car);
//        transactionManager.park(parkingDate, parkingPermit, parkingLot);
//     
//        assertEquals(parkingTransaction, transactionManager.getTransactions().get(0));
//        assertEquals(expectedListSize, transactionManager.getTransactions().size());
//    }
//    
//        @Test
//    public void testParkExpiredPermitFail() throws Exception {
//        
//        String expectedErrorMessage = "Parking permit already expired.";
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Date permitExpirationDate = new Date(1, localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute());
//        Date parkingDate = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute());
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        ParkingLot parkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",northSideParkingLotAddress);
//        Car car = new Car(CarType.COMPACT, "123-44441", customer);
//
//        ParkingPermit parkingPermit = new ParkingPermit(1,car,permitExpirationDate);
//        
//        TransactionManager transactionManager = new TransactionManager(new PermitManager());
//        transactionManager.registerCar(car);
//        try {
//            transactionManager.park(parkingDate, parkingPermit, parkingLot);
//            fail("An exception should have been thrown --testParkExpiredPermitFail()");
//        }
//        catch (Exception e) {
//            assertEquals(expectedErrorMessage,e.getMessage());
//        }
//        
//    
//    }
//
//    /**
//     * Test of getParkingCharges method, of class TransactionManager.
//     */
//    @Test
//    public void testGetParkingCharges_PermitInterface() throws Exception {
//        
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Date permitExpirationDate = new Date(30, localDateTime.getMonthValue(), 2021, localDateTime.getHour(), localDateTime.getMinute());
//        Date parkingDate = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute());
//        Date parkingDate2 = new Date(5, 12, 2019, localDateTime.getHour(), localDateTime.getMinute());
//        Money expectedCharges = new Money(20, "USD");
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        ParkingLot parkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",northSideParkingLotAddress);
//        Car car = new Car(CarType.COMPACT, "123-44441", customer);
//
//        ParkingPermit parkingPermit = new ParkingPermit(1,car,permitExpirationDate);
//        
//        TransactionManager transactionManager = new TransactionManager(new PermitManager());
//        transactionManager.registerCar(car);
//        transactionManager.park(parkingDate, parkingPermit, parkingLot);
//        transactionManager.park(parkingDate2, parkingPermit, parkingLot);
//        assertEquals(expectedCharges, transactionManager.getParkingCharges(parkingPermit));
//        
//    }
//
//    /**
//     * Test of getParkingCharges method, of class TransactionManager.
//     */
//    @Test
//    public void testGetParkingCharges_PersonInterface() throws Exception {
//       
//        LocalDateTime localDateTime = LocalDateTime.now();
//        
//        Date permitExpirationDate = new Date(30, localDateTime.getMonthValue(), 2021, localDateTime.getHour(), localDateTime.getMinute());
//        Date parkingDate = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute());
//        Date parkingDate2 = new Date(5, 12, 2019, localDateTime.getHour(), localDateTime.getMinute());
//        Money expectedCharges = new Money(20, "USD");
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        ParkingLot parkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",northSideParkingLotAddress);
//        Car car = new Car(CarType.COMPACT, "123-44441", customer);
//
//        ParkingPermit parkingPermit = new ParkingPermit(1,car,permitExpirationDate);
//        
//        TransactionManager transactionManager = new TransactionManager(new PermitManager());
//        transactionManager.registerCar(car);
//        transactionManager.park(parkingDate, parkingPermit, parkingLot);
//        transactionManager.park(parkingDate2, parkingPermit, parkingLot);
//        assertEquals(expectedCharges, transactionManager.getParkingCharges(customer));
//    }
//    
//}
