/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.ParkingDetails;
import com.ict4315.week5.CarType;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
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
public class ParkingDetailsTest {
    
    

    @Test
    public void testObjectConstruction() throws Exception {
        CarType expectedCarType = CarType.COMPACT;
        LocalDateTime date =  LocalDateTime.of(2021, 01, 01,8,30);
      DayOfWeek dayOfWeek = date.getDayOfWeek();
      
    int hourSelection = 4;
    ParkingDetails parkingDetail = new ParkingDetails(CarType.COMPACT,date, 4, false);
    
        
       
    }
    
}
