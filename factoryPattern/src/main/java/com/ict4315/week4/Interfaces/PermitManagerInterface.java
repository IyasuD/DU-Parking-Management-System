/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4.Interfaces;

import com.ict4315.week4.ParkingPermit;
import java.util.List;

/**
 *
 * @author iyasu
 */
public interface PermitManagerInterface  {
    PermitInterface register(CarInterface car) throws Exception;
     public List<ParkingPermit> getParkingPermitList();
     public boolean carAlreadyRegistered(CarInterface car);
}
