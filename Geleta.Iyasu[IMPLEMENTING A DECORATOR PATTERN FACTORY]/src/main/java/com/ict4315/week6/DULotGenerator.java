/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

/**
 *
 * @author iyasu
 */
public class DULotGenerator {
    
   
	
	private int id = 1;
	private static  DULotGenerator duLotGenerator = null;
	private DULotGenerator() {
		
	}
	public static DULotGenerator getInstance() {
		if(duLotGenerator == null)
			duLotGenerator = new DULotGenerator();
			return duLotGenerator; 
	}
	public String generateID() {
		return "DU" + id++;
	}
	


    
}
