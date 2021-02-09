/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.ParkingLot;
import com.ict4315.week5.ParkingDetails;
import com.ict4315.week5.TransactionManagerMain;
import com.ict4315.week5.CarType;
import com.ict4315.week5.ParkingEvent;
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
public class TransactionManagerMainTest {
    
    public TransactionManagerMainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of update method, of class TransactionManagerMain.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
         ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT);
        ParkingEvent parkingEvent = new ParkingEvent(parkingDetails);
        ParkingLot parkingLot = new ParkingLot(parkingEvent);
        TransactionManagerMain instance = new TransactionManagerMain(parkingLot);
        
        instance.update();
        
    }
    
}
