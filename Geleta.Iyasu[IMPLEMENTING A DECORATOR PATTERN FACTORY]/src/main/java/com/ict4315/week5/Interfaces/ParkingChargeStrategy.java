/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5.Interfaces;

import com.ict4315.week6.ParkingDetails;

/**
 *
 * @author iyasu
 */
public interface ParkingChargeStrategy {
     double apply(ParkingDetails parkingDetails );
}
