/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3;

import com.ict4315.week3.ParkingPermit;
import com.ict4315.week3.CarType;
import com.ict4315.week3.Car;
import com.ict4315.week3.Address;
import com.ict4315.week3.PermitManager;
import com.ict4315.week3.Date;
import com.ict4315.week3.Customer;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 *
 * @author nisca
 */
public class PermitManagerTest {
    
    public PermitManagerTest() {
    }

    /**
     * Test of register method, of class PermitManager.
     */
    @Test
    public void testRegisterPass() throws Exception {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear() + 1, localDateTime.getHour(), localDateTime.getMinute());
        
        Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
        Car car = new Car(CarType.COMPACT, "123-44441", customer);

        ParkingPermit parkingPermit = new ParkingPermit(1,car,date);
        PermitManager permitManager = new PermitManager();
        assertEquals(parkingPermit, permitManager.register(car));
        
    }
    
    
        @Test
    public void testRegisterIncorrectCustomerFail() throws Exception {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = new Date(localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear() + 1, localDateTime.getHour(), localDateTime.getMinute());
        
        Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
        Address address2 = new Address(1, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
        Customer customer2 = new Customer(10,"John","Smith","333-333-4454","j@test.com",address2);
        Car car = new Car(CarType.COMPACT, "123-44441", customer);
        Car car2 = new Car(CarType.COMPACT, "123-44441", customer2);

        ParkingPermit parkingPermit = new ParkingPermit(1,car2,date);
        PermitManager permitManager = new PermitManager();
        assertNotEquals(parkingPermit, permitManager.register(car));
        
    }
    
          @Test
    public void testCarAlreadyRegisteredPass() throws Exception {
        

        String expectedErrorMessage = "Car already registered";
        Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");

        Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
        Car car = new Car(CarType.COMPACT, "123-44441", customer);
        PermitManager permitManager = new PermitManager();
        permitManager.register(car);
        try {
           permitManager.register(car);
           fail("An exception should have been thrown --testCarAlreadyRegisteredPass()");
        }
        catch (Exception e) {
            assertEquals(expectedErrorMessage, e.getMessage());
        }
        
        
    }
}
