/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import com.ict4315.week6.CarType;
import com.ict4315.week6.ParkingPermit;
import com.ict4315.week6.Date;
import com.ict4315.week6.Car;
import com.ict4315.week6.Customer;
import com.ict4315.week6.Address;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author iyasu
 */
public class ParkingPermitTest {
    
    
    
    
    /**
     * Test of Constructor method, of class ParkingPermit.
     */
    @Test
    public void testConstructorNullIdFail() throws Exception {
        String expectedErrorMessage = "Invalid permit id.";
        Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
        Car car = new Car(CarType.COMPACT, "123-44441", customer);
        Date date = new Date(30, 5, 2020, 8, 40);
        try {
          new ParkingPermit(null,car,date);
        }
        catch (Exception e) {
            assertEquals(expectedErrorMessage, e.getMessage());
        }  
    }
    
    
       /**
     * Test of Constructor method, of class ParkingPermit.
     */
    @Test
    public void testConstructorAlphaNumericIdFail() throws Exception {
        String expectedErrorMessage = "Invalid permit id.";
        Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
        Car car = new Car(CarType.COMPACT, "123-44441", customer);
        Date date = new Date(30, 5, 2020, 8, 40);
        try {
          new ParkingPermit("t42",car,date);
        }
        catch (Exception e) {
            assertEquals(expectedErrorMessage, e.getMessage());
        }  
    }
    
           /**
     * Test of Constructor method, of class ParkingPermit.
     */
    @Test
    public void testConstructorPass() throws Exception {
        Date date = new Date(30, 5, 2020, 8, 40);
        int expectedId = 5;
        
        Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
        Car car = new Car(CarType.COMPACT, "123-44441", customer);

        ParkingPermit parkingPermit = new ParkingPermit(5,car,date);
        assertEquals(expectedId, parkingPermit.getId());
        assertEquals(date, parkingPermit.getExpirationDate());
        assertEquals(car, parkingPermit.getCar());
    
    }

    
}
