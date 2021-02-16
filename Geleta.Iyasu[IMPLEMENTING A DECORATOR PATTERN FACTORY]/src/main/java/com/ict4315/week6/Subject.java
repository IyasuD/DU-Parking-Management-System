/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import com.ict4315.week5.Interfaces.ParkingObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iyasu
 */
public class Subject {
    private  List<ParkingObserver> observers = new ArrayList<>();
	public void addObserver(ParkingObserver parkingObserver) {
		observers.add(parkingObserver);
	}
    public void removeObserver(ParkingObserver parkingObserver) {
    	observers.remove(parkingObserver);
    }
    public void notifyObservers() {
    	for(ParkingObserver observer : observers) {
    		observer.update();
    	}
    }
    
}
