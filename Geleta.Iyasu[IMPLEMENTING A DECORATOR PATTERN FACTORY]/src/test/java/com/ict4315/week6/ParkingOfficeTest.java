/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 *
 * @author nisca
 */
public class ParkingOfficeTest {
    
//    public ParkingOfficeTest() {
//    }
//    
//    /**
//     * Test of register method, of class ParkingOffice.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testRegisterCustomerAlreadyRegisteredFail() throws Exception {
//        String expected = "Customer already registered";
//        try {
//                Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//                Address customerAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//                Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",customerAddress);
//                PermitManager permitManager = new PermitManager();
//                ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//                office.register(customer);
//                office.register(customer);
//                fail("An exception should have been caught --testRegisterCustomerAlreadyRegisteredFail");
//        }
//        catch (Exception e) {
//            assertEquals(e.getMessage(), expected);
//        }
//    }
//
//    @Test
//    public void testRegisterCustomerPass() throws Exception{
//        
//        Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        Address customerAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",customerAddress);
//        PermitManager permitManager = new PermitManager();
//        ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//        office.register(customer);
//        assertEquals(office.getListOfCustomers().get(0), customer);
//        assertEquals(office.getListOfCustomers().size(),1);
//    }
//    
//    
//    @Test
//    public void testAddParkingLotParkingLotExistsFail() throws Exception {
//        String expected = "Parking lot already added";
//        try {
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        ParkingLot northSideParkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        PermitManager permitManager = new PermitManager();
//        ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//        office.addParkingLot(northSideParkingLot);
//        office.addParkingLot(northSideParkingLot);
//        fail("An exception should have been caught -- testAddParkingLotParkingLotExistsFail");
//        }
//        catch (Exception e) {
//            assertEquals(e.getMessage(),expected);
//        }    
//    }
//    
//    /**
//     * Test of addParkingLot method, of class ParkingOffice.
//     */
//    @Test
//    public void testAddParkingLotPass() throws Exception {
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        ParkingLot northSideParkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        PermitManager permitManager = new PermitManager();
//        ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//        office.addParkingLot(northSideParkingLot);
//        assertEquals(office.getListOfParkingLots().get(0), northSideParkingLot);
//        assertEquals(office.getListOfParkingLots().size(),1);      
//    }
//
//    /**
//     * Test of displayParkingLots method, of class ParkingOffice.
//     */
//    @Test
//    public void testDisplayParkingLotsPass() throws Exception{
//        StringBuilder expected = new StringBuilder();
//        double dailyRateCompact;
//        double dailyRateSuv;
//        String compactRateCurrency;
//        String suvRateCurrency;
//        expected.append(String.format("%n"));
//        expected.append(String.format("Parking Lot Name,  SUV Rate,  Compact Car Rate%n"));
//        
//        
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        ParkingLot northSideParkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
// 
//        dailyRateCompact = northSideParkingLot.getDailyRate(CarType.COMPACT).getAmount();
//        compactRateCurrency = northSideParkingLot.getDailyRate(CarType.COMPACT).getCurrency();
//        dailyRateSuv = northSideParkingLot.getDailyRate(CarType.SUV).getAmount();
//        suvRateCurrency = northSideParkingLot.getDailyRate(CarType.SUV).getCurrency();
//        expected.append(String.format("%s: (%s) %s , (%s) %s%n",northSideParkingLot.getName(),dailyRateSuv, suvRateCurrency, dailyRateCompact, compactRateCurrency));
//        PermitManager permitManager = new PermitManager();
//        ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//        office.addParkingLot(northSideParkingLot);
//        assertEquals(office.displayParkingLots(),expected.toString());
//        
//    }
//     
//    @Test
//    public void testDisplayParkingLotsNoParkingLotsFail() throws Exception{
//        StringBuilder expected = new StringBuilder();
//        expected.append(String.format("%n"));
//        expected.append("No parking lots.");        
//            Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//            PermitManager permitManager = new PermitManager();
//            ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//            assertEquals(office.displayParkingLots(),expected.toString());
//    }
//    
//    @Test
//    public void testRegisterCarPass() throws Exception {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Date parkingDate = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute());
//        
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        ParkingLot parkingLot = new ParkingLot(1,"North Side Lot",northSideParkingLotAddress,12.5);
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",northSideParkingLotAddress);
//        Car car = new Car(CarType.COMPACT, "123-44441", customer);
//
//
//        ParkingPermit parkingPermit = new ParkingPermit(1,car,parkingDate);
//        
//        ParkingTransaction parkingTransaction = new ParkingTransaction(parkingDate,parkingPermit,parkingLot);
//        
//        Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        PermitManager permitManager = new PermitManager();
//        ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//        office.register(customer);
//        office.register(car);
//        assertEquals(parkingTransaction,office.park(parkingDate, parkingPermit, parkingLot));
//            
//    }
//        
//    @Test
//    public void testRegisterCarUnregisteredCustomerFail() throws Exception {
//        
//        String expectedErrorMessage = "Customer John Smith is not yet registered with parking office.";
//        
//        Address northSideParkingLotAddress = new Address(1, "5 Panda Street", "South H", "Queens", "NY", "USA", "");
//        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",northSideParkingLotAddress);
//        Car car = new Car(CarType.COMPACT, "123-44441", customer);
//        
//        Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        PermitManager permitManager = new PermitManager();
//        ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//        try {
//            office.register(car);
//            fail("An exception should have been caught --parkingPermit()");
//        }
//        catch (Exception e) {
//            assertEquals(expectedErrorMessage, e.getMessage());
//        }
//    }
//    
//    @Test
//    public void testgetParkingPermitChargesPass() throws Exception {
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
//        
//        Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        PermitManager permitManager = new PermitManager();
//        ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//        office.register(customer);
//        office.register(car);
//        office.park(parkingDate, parkingPermit, parkingLot).getChargedAmount();
//        assertEquals(parkingTransaction.getChargedAmount(),office.getParkingCharges(parkingPermit));
//    }
//    
//    @Test
//    public void testgetParkingCustomerChargesPass() throws Exception {
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
//        
//        Address parkingOfficeAddress = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
//        PermitManager permitManager = new PermitManager();
//        ParkingOffice office = new ParkingOffice("Main Office", parkingOfficeAddress,new TransactionManager(permitManager));
//        office.register(customer);
//        office.register(car);
//        office.park(parkingDate, parkingPermit, parkingLot).getChargedAmount();
//        assertEquals(parkingTransaction.getChargedAmount(),office.getParkingCharges(customer));
//    }
    
}
