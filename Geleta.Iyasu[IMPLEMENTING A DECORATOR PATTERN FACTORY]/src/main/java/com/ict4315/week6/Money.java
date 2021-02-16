/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import com.ict4315.week5.Interfaces.MoneyInterface;

/**
 *
 * @author Iyasu
 */
public final class Money  implements MoneyInterface {
    
    private final double amount;
    private final String currency;
    
    public Money (double amount, String currency) {

        this.amount = amount;
        this.currency = currency;
    }
    
    @Override
    public double getAmount() {
        return amount;
    }
    
    @Override
    public String getCurrency () {
        return currency;
    }
    
     public boolean equals(Object obj) {
      Money comparedMoney = (Money)obj;
      
      return amount == comparedMoney.getAmount() &&
             currency.equals(comparedMoney.getCurrency());
       
    }
}
