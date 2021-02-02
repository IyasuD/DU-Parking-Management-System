/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import java.time.LocalDate;
/**
 *
 * @author raymondmenasche
 */
public class Date {
    
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int mJulianNumber;
    
    public Date() {
        //default to January 1st, 1970
        this.day = LocalDate.now().getDayOfMonth();
        this.month = LocalDate.now().getMonthValue();
        this.year = LocalDate.now().getYear();
    }
    
    public Date(Date date) {
        this.day = date.getDay();
        this.month = date.getMonth();
        this.year = date.getYear();
        this.mJulianNumber = toJulianNumber(this.day,this.month,this.year);
    }
    
    public Date(int day, int month, int year) throws Exception {
        try {
          checkInputValues(day, month, year);
          this.day = day;
          this.month = month; 
          this.year = year;
          this.mJulianNumber = toJulianNumber(this.day,this.month,this.year);
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
        
    public Date(int day, int month, int year, int hour, int minute) throws Exception {
        try {
          checkInputValues(day, month, year, hour, minute);
          this.day = day;
          this.month = month; 
          this.year = year;
          this.hour = hour;
          this.minute = minute;
          this.mJulianNumber = toJulianNumber(this.day,this.month,this.year);
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public int getDay() {
        return this.day;
    }
    
    public int getMonth() {
        return this.month;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public int getHour() {
        return this.hour;
    }
    
    public int getMinute() {
        return this.minute;
    }
    
    public int getJulianNumber()  {
        return this.mJulianNumber;
    }
    
    public int[] getFromJulianNumber(int julianNumber) {
        return fromJulianNumber(julianNumber);
    }
    
    public static boolean isLeapYear(int year) {
        /**
         * Check to see if divisible by 4. Since int will round off decimals reverse
         * equation will not be equal to year.
         */
        int test = year / 4;
        int test2 = test * 4;
        if (year == test2) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int getLastDayOfMonth(int month, int year) {
        int lastDay = 0;
        //check if leap year and month of february
        if (isLeapYear(year) && month == 2) {
            lastDay = 29;
        } else if (!isLeapYear(year) && month == 2) { //not leap year and mo 2
            lastDay = 28;
        } else {
            int[] array31 = {1, 3, 5, 7, 8, 10, 12}; // all months that end in 31
            int[] array30 = {4, 6, 9, 11}; // all months that end in 30
            for (int m : array31) { //pass through array to test for match
                if (m == month) {
                    lastDay = 31;
                    break;
                }
            }
            for (int m : array30) { // pass again to test for match
                if (m == month) {
                    lastDay = 30;
                    break;
                }
            }
        }
        return lastDay;
    }
    
    public void checkInputValues(int day, int month, int year) throws Exception {
        if (month > 12 || month < 1) { // check for invalid month integer
           throw new Exception("Invalid month");
        }
        int lastDay = getLastDayOfMonth(month, year);
        if (day > lastDay || day < 1) { // check for invalid day integer
            throw new Exception("Invalid day");
        }
        if (year < 1) { // check for invalid year integer
            throw new Exception("Invalid year");
        }
    }
    
        public void checkInputValues(int day, int month, int year, int hour, int minute) throws Exception {
        if (month > 12 || month < 1) { // check for invalid month integer
           throw new Exception("Invalid month");
        }
        int lastDay = getLastDayOfMonth(month, year);
        if (day > lastDay || day < 1) { // check for invalid day integer
            throw new Exception("Invalid day");
        }
        if (year < 1) { // check for invalid year integer
            throw new Exception("Invalid year");
        }
        if(hour <0  || hour > 23 ) { //check for invalid hour
            throw new Exception("Invalid hour");
        }
        if(minute < 0 || minute > 60) {  //check for invalid minute
            throw new Exception ("Invalid minute");
        }
    }
    
    public static int toJulianNumber(int day, int month, int year) {
        int julianNumber = (1461 * (year + 4800 + (month - 14) / 12)) / 4
                + (367 * (month - 2 - 12 * ((month - 14) / 12))) / 12
                - (3 * ((year + 4900 + (month -14) / 12) / 100)) / 4 + day - 32075;
        return julianNumber;
    }
    
    public int[] fromJulianNumber(int mJulianNumber) {
        int l = mJulianNumber + 68569;
        int n = ( 4 * l ) / 146097;
        l = l - ( 146097 * n + 3 ) / 4;
        int i = ( 4000 * ( l + 1 ) ) / 1461001;
        l = l - ( 1461 * i ) / 4 + 31;
        int j = ( 80 * l ) / 2447;
        int day = l - ( 2447 * j ) / 80;
        l = j / 11;
        int month = j + 2 - ( 12 * l );
        int year = 100 * ( n - 49 ) + i + l;
        int[] date = {day, month, year};
        return date;
    }
    
    public boolean equals(Object obj) {
      Date comparedDate = (Date)obj;
      
      return day == comparedDate.getDay() &&
             month == comparedDate.getMonth() &&
             year == comparedDate.getYear() &&
             hour == comparedDate.getHour()&&
             minute == comparedDate.getMinute();
    }
   
   public boolean isGreaterThan(Date comparedDate) {
       String thisDateToString = String.format("%s%s%s%s%s", year,month,day,hour,minute);
       String comparedDateToString = String.format("%s%s%s%s%s", comparedDate.getYear(),comparedDate.getMonth(),comparedDate.getDay(),comparedDate.getHour(),comparedDate.getMinute());
       long thisDateToLong = Long.parseLong(thisDateToString);
       long thisComparedDateToLong = Long.parseLong(comparedDateToString);
       
       return thisDateToLong > thisComparedDateToLong;
   } 
}
