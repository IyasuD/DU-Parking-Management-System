/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3.Interfaces;

import java.util.HashMap;

/**
 *
 * @author iyasu
 */
public interface Command {
    
//    String getCommandName();
//    String getDisplayName();
  

    public String execute(HashMap<String, String> parameters);
    
    
    
}
