/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3;

import com.ict4315.week3.CarType;
import com.ict4315.week3.ParkingDetails;
import com.ict4315.week3.DiscountOnVehicleType;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author iyasu
 */
public class DiscountOnVehicleTypeTest {
    
  

    /**
     * Test of apply method, of class DiscountOnVehicleType.
     */
    @Test
    public void testApply() {
        System.out.println("apply");
          LocalDateTime localDateTime =LocalDateTime.of(2021,01,23,18,30);
        int hourSelection = 4;
        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT, localDateTime, hourSelection, false);
        DiscountOnVehicleType instance = new DiscountOnVehicleType(parkingDetails);
        double expResult = 20.0;
        double result = instance.apply(parkingDetails);
        assertEquals(expResult, result);
        
    }
    
}
