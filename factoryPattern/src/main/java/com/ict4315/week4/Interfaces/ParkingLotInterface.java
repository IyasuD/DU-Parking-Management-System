/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4.Interfaces;

import com.ict4315.week4.Address;
import com.ict4315.week4.CarType;
import com.ict4315.week4.FinancialCalculator;
import com.ict4315.week4.Money;

/**
 *
 * @author iyasu
 */
public interface ParkingLotInterface <T> {
        public Address getAddress();

    public T getId();

    public String getName();
    public Money getDailyRate(CarType carType);

    public double getStandardDailyRate();
}
