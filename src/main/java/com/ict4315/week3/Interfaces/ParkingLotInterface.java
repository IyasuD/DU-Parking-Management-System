/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3.Interfaces;

import com.ict4315.week3.Address;
import com.ict4315.week3.CarType;
import com.ict4315.week3.FinancialCalculator;
import com.ict4315.week3.Money;

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
