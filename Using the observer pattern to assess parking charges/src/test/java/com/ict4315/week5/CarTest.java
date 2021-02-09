/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ict4315.week5;

import com.ict4315.week5.Car;
import com.ict4315.week5.Customer;
import com.ict4315.week5.Address;
import com.ict4315.week5.CarType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author iyasu
 */
public class CarTest {
    

    @Test
    public void testConstructorNullLicensePlateFail() throws Exception{
        
        String expectedErrorMessage = "License plate number must be at least 6 characters long.";
        Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
        try {
        Car car = new Car(CarType.COMPACT, null, customer);
        fail("An exception should have been thrown --CarTestConstructorEmptyLicensePlateFail");
        }
        catch(Exception e) {
            assertEquals(expectedErrorMessage,e.getMessage());
        }
    }
    
        @Test
    public void testConstructorEmptyLicensePlateFail() throws Exception{
        
        String expectedErrorMessage = "License plate number must be at least 6 characters long.";
        Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
        try {
        Car car = new Car(CarType.COMPACT, "", customer);
        fail("An exception should have been thrown --CarTestConstructorEmptyLicensePlateFail");
        }
        catch(Exception e) {
            assertEquals(expectedErrorMessage,e.getMessage());
        }
    }
    
       @Test
    public void testConstructorNullOwnerFail() throws Exception{
        
        String expectedErrorMessage = "A car needs a valid owner.";
        try {
        Car car = new Car(CarType.COMPACT, "123-4456", null);
        fail("An exception should have been thrown --CarTestConstructorEmptyLicensePlateFail");
        }
        catch(Exception e) {
            assertEquals(expectedErrorMessage,e.getMessage());
        }
    }
    
}
