/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week6;

import com.ict4315.week5.Interfaces.Command;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author iyasu adopeted from Nisean Castillo 
 */
public class ParkingServices {

    private ParkingOffice parkingOffice;
    private Map<String, Command> commands = new HashMap<>();

    ParkingServices(HashMap commandList, ParkingOffice parkingOffice) {
        this.parkingOffice = parkingOffice;
        this.commands = commandList;
    }

    private String register(Command commandToRegister, HashMap<String, String> parameters) {
        return commandToRegister.execute(parameters);

    }

    public String performCommand(String commandKey, HashMap<String, String> parameters) {
        Command currentCommand = this.commands.get(commandKey);
        return currentCommand != null? this.register(currentCommand, parameters): "";
   

    }

}
