/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import com.ict4315.week4.Interfaces.Command;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iyasu
 * Based on Nisean Castillo implementation
 */
public class RegisterCarCommand implements Command {

     private  ParkingOffice office;
    private int customerCount = 0;

    public RegisterCarCommand(ParkingOffice parkingOffice) {
        office = parkingOffice;
       
    }


     @Override
     public String execute(HashMap<String, String> parameters) {

        Car carToAdd;
        if(checkParameter(parameters)){
            try {
                carToAdd = this.generateCar(parameters);
                this.office.register(carToAdd);
                return String.valueOf(carToAdd.getLicensePlate());
            } catch (Exception ex) {
                Logger.getLogger(RegisterCarCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "0";

        
    }

    private boolean checkParameter(HashMap<String, String> parameters){
        if( !parameters.containsKey(CarType.COMPACT)&&
              !parameters.containsKey("license_Plate")&&
                !parameters.containsKey("phone_number"))
            return false;
      if(!parameters.containsKey("first_name") &&
              !parameters.containsKey("last_name")&&
                !parameters.containsKey("phone_number")&&
                !parameters.containsKey("email_address"))
            return false;
     return true;
        
    }
    
    
    

    private Car generateCar(HashMap<String, String> parameters) throws Exception{
        Address customerAddress = new Address(1, parameters.get("street_Address1"),
                            parameters.get("street_Address2"),parameters.get("city"),
                parameters.get("state"), parameters.get("country"), parameters.get("zipcode")
           
                            );
        Customer owner = new Customer(++this.customerCount, parameters.get("first_name"), parameters.get("last_name"), 
                              parameters.get("phone_number"), parameters.get("email_address1"),customerAddress);
        return new Car(CarType.COMPACT, parameters.get("license_Plate"), owner);
        
    }
         }
