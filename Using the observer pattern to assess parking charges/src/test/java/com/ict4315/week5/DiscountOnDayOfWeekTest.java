/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.ParkingDetails;
import com.ict4315.week5.DiscountOnDayOfWeek;
import com.ict4315.week5.CarType;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;
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
public class DiscountOnDayOfWeekTest {

    /**
     * Test of apply method, of class DiscountOnDayOfWeek.
     */
    @Test
    public void testApply() {
        System.out.println("apply");
        LocalDate date = LocalDate.of(2021, 01, 23);
        LocalDateTime localDateTime = LocalDateTime.of(2021, 01, 23, 8, 30);
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();

        int hourSelection = 4;
        ParkingDetails parkingDetail = new ParkingDetails(CarType.COMPACT, localDateTime, 4, false);

        DiscountOnDayOfWeek instance = new DiscountOnDayOfWeek(parkingDetail);
        double expResult = 25.0;
        double result = instance.apply(parkingDetail);
        assertEquals(expResult, result);

    }

}
