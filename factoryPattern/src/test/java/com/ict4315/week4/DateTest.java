/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;


/**
 *
 * @author raymondmenasche
 */
public class DateTest {

    public DateTest() {
    }

    /**
     * Test of isLeapYear method, of class Date. Pass
     */
    @Test
    public void testIsLeapYearPassOne() {
        System.out.println("isLeapYear");
        int year = 1960;
        boolean expResult = true;
        boolean result = Date.isLeapYear(year);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsLeapYearPassTwo() {
        System.out.println("isLeapYear");
        int year = 2020;
        boolean expResult = true;
        boolean result = Date.isLeapYear(year);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLeapYear method, of class Date. Fail
     */
    @Test
    public void testIsLeapYearFailOne() {
        System.out.println("isLeapYear");
        int year = 1963;
        boolean expResult = false;
        boolean result = Date.isLeapYear(year);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsLeapYearFailTwo() {
        System.out.println("isLeapYear");
        int year = 2021;
        boolean expResult = false;
        boolean result = Date.isLeapYear(year);
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastDayOfMonth method, of class Date. Pass
     */
    @Test
    public void testGetLastDayOfMonthPassOne() {
        System.out.println("getLastDayOfMonth");
        int month = 2;
        int year = 2020;
        int expResult = 29;
        int result = Date.getLastDayOfMonth(month, year);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLastDayOfMonthPassTwo() {
        System.out.println("getLastDayOfMonth");
        int month = 4;
        int year = 1999;
        int expResult = 30;
        int result = Date.getLastDayOfMonth(month, year);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getLastDayOfMonth method, of class Date. Fail
     */
    @Test
    public void testGetLastDayOfMonthFailOne() {
        System.out.println("getLastDayOfMonth");
        int month = 2;
        int year = 2021;
        int expResult = 29;
        int result = Date.getLastDayOfMonth(month, year);
        assertNotEquals(expResult, result);
    }
    
    @Test
    public void testGetLastDayOfMonthFailTwo() {
        System.out.println("getLastDayOfMonth");
        int month = 4;
        int year = 1999;
        int expResult = 31;
        int result = Date.getLastDayOfMonth(month, year);
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of checkInputValues method, of class Date for thrown exception. Pass
     */
    @Test
    public void testThrownExceptionDay() {
        Throwable exception = assertThrows(Exception.class, new Executable() {
            
            @Override
            public void execute() throws Throwable {
                int day = 0;
                int month = 12;
                int year = 2000;
                Date date = new Date();
                date.checkInputValues(day, month, year);
            }
        });
        assertEquals("Invalid day", exception.getMessage());
    }
    
    /**
     * Test of checkInputValues method, of class Date for thrown exception.
     */
    @Test
    public void testThrownExceptionMonth() {
        Throwable exception = assertThrows(Exception.class, new Executable() {
            
            @Override
            public void execute() throws Throwable {
                int day = 1;
                int month = 15;
                int year = 1999;
                Date date = new Date();
                date.checkInputValues(day, month, year);
            }
        });
        assertEquals("Invalid month", exception.getMessage());
    }
    
    @Test
    public void testThrownExceptionYear() {
        Throwable exception = assertThrows(Exception.class, new Executable() {
            
            @Override
            public void execute() throws Throwable {
                int day = 1;
                int month = 11;
                int year = -234;
                Date date = new Date();
                date.checkInputValues(day, month, year);
            }
        });
        assertEquals("Invalid year", exception.getMessage());
    }
    
    /**
     * Test not exception thrown, valid data
     * @throws Exception 
     */
    @Test
    public void testThrownExceptionMonthFailOne() throws Exception { 
        int day = 1;
        int month = 12;
        int year = 2000;
        Date date = new Date();
        date.checkInputValues(day, month, year);
            
    }
    
    @Test
    public void testThrownExceptionMonthFailTwo() throws Exception { 
        int day = 29;
        int month = 2;
        int year = 2020;
        Date date = new Date();
        date.checkInputValues(day, month, year);
            
    }
    
    /**
     * Test of toJulianNumber method, of class JulianNumber.
     */
    @org.junit.jupiter.api.Test
    public void testToJulianNumberPassOne()  throws Exception {
        System.out.println("toJulianNumber");
        int day = 5;
        int month = 1;
        int year = 50;
        int expResult = 1739327;
        Date date = new Date(day,month,year);
        int result = date.getJulianNumber();
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testToJulianNumberPassTwo() throws Exception {
        System.out.println("toJulianNumber");
        int day = 1;
        int month = 2;
        int year = 1957;
        int expResult = 2435871;
        Date date = new Date(day,month,year);
        int result = date.getJulianNumber();
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testToJulianNumberFailOne() throws Exception {
        System.out.println("toJulianNumber");
        int day = 5;
        int month = 3;
        int year = 50;
        int expResult = 1739327;
        Date date = new Date(day,month,year);
        int result = date.getJulianNumber();
        assertNotEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testToJulianNumberFailTwo() throws Exception {
        System.out.println("toJulianNumber");
        int day = 1;
        int month = 2;
        int year = 1950;
        int expResult = 2435871;
        Date date = new Date(day,month,year);
        int result = date.getJulianNumber();
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of fromJulianNumber method, of class JulianNumber. Happy road.
     */
    @org.junit.jupiter.api.Test
    public void testFromJulianNumberPassOne() {
        System.out.println("fromJulianNumber");
        int day = 5;
        int month = 1;
        int year = 50;
        int julianNumber = 1739327;
        int[] expResult = {day,month,year};
        Date date = new Date();
        int[] result = date.getFromJulianNumber(julianNumber);
        assertArrayEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testFromJulianNumberPassTwo() {
        System.out.println("fromJulianNumber");
        int day = 1;
        int month = 2;
        int year = 1957;
        int julianNumber = 2435871;
        int[] expResult = {day,month,year};
        Date date = new Date();
        int[] result = date.getFromJulianNumber(julianNumber);
        assertArrayEquals(expResult, result);
    }
    
//    /**
//     * Test of fromJulianNumber method, of class JulianNumber. Fail test.
//     */
    @org.junit.jupiter.api.Test
    public void testFromJulianNumberFailOne() {
        System.out.println("fromJulianNumber");
        int day = 5;
        int month = 2;
        int year = 50;
        int julianNumber = 1739327;
        int[] expResult = {day,month,year};
        Date date = new Date();
        int[] result = date.getFromJulianNumber(julianNumber);
        assertFalse(Arrays.equals(expResult, result));
    }
//    
    @org.junit.jupiter.api.Test
    public void testFromJulianNumberFailTwo() {
        System.out.println("fromJulianNumber");
        int day = 1;
        int month = 1;
        int year = 1957;
        int julianNumber = 2435871;
        int[] expResult = {day,month,year};
        Date date = new Date();
        int[] result = date.getFromJulianNumber(julianNumber);
        assertFalse(Arrays.equals(expResult, result));
    }
}
