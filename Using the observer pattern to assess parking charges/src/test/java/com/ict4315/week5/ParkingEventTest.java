/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.CarType;
import com.ict4315.week5.ParkingEvent;
import com.ict4315.week5.ParkingDetails;
import java.time.LocalTime;
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
public class ParkingEventTest {

    /**
     * Test of getLotNumber method, of class ParkingEvent.
     */
    @Test
    public void testGetLotNumber() {
        System.out.println("getLotNumber");
        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT);
        ParkingEvent instance = new ParkingEvent(parkingDetails);
        String expResult = "DU2";
        String result = instance.getLotNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getInTime method, of class ParkingEvent.
     */
    @Test
    public void testGetInTime() {
        System.out.println("getInTime");
        ParkingDetails parkingDetails = new ParkingDetails(CarType.COMPACT);
        ParkingEvent instance = new ParkingEvent(parkingDetails);
        LocalTime expResult = LocalTime.now();
        LocalTime result = instance.getInTime();
        assertEquals(expResult.getHour(), result.getHour());

    }

}
