/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4.Interfaces;

import com.ict4315.week4.CarType;
import com.ict4315.week4.Customer;

/**
 *
 * @author iyasu
 */
public interface CarInterface {
    public CarType getType();
    public String getLicensePlate();
    public Customer getOwner();
}
