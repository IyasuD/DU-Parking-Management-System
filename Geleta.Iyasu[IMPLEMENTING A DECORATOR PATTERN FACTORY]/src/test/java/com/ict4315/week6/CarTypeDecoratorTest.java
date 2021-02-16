/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import com.ict4315.week6.FlatRate;
import com.ict4315.week6.AbstractDiscount;
import com.ict4315.week6.CarTypeDecorator;
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
public class CarTypeDecoratorTest {
    
    public CarTypeDecoratorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of apply method, of class CarTypeDecorator.
     */
    @Test
    public void testApply() {
        System.out.println("apply");
        AbstractDiscount ad = new FlatRate(8.0); 
        CarTypeDecorator instance = new CarTypeDecorator(ad);
        double expResult = 7.36;
        double result = instance.apply();
        assertEquals(expResult, result);
      
    }
    
}
