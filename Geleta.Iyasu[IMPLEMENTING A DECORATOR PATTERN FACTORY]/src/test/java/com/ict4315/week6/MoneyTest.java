/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import com.ict4315.week6.Money;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author iyasu
 */
public class MoneyTest {
    
   
    /**
     * Test of getAmount method, of class Money.
     */
    @Test
    public void testConstructorPass() {
       Money money = new Money(12.5, "USD");
       assertEquals(12.5, money.getAmount());
       assertEquals("USD", money.getCurrency());
    }


    
}
