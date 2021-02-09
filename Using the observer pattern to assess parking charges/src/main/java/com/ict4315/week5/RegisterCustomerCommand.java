/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week5;

import com.ict4315.week5.Interfaces.Command;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iyasu
 * Based on Nisean Castillo implementation
 */
public class RegisterCustomerCommand implements Command {

    private  ParkingOffice office;

    private int customerCount = 0;

    public RegisterCustomerCommand(ParkingOffice parkingOffice) {
        office = parkingOffice;

    }

    @Override
    public String execute(HashMap<String, String> parameters) {

        Customer customerToAdd;

        if (checkParameter(parameters)) {
            try {

                customerToAdd = this.generateCustomer(parameters);

                this.office.register(customerToAdd);
                return String.valueOf(customerToAdd.getId());
            } catch (Exception ex) {
                Logger.getLogger(RegisterCustomerCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "0";

    }

    private boolean checkParameter(HashMap<String, String> parameters) {
        if (!parameters.containsKey("first_name")
                && !parameters.containsKey("last_name")
                && !parameters.containsKey("phone_number")
                && !parameters.containsKey("email_address")) {
            return false;
        }
        if (!parameters.containsKey("street_Address1")
                && !parameters.containsKey("street_Address2")
                && !parameters.containsKey("city")
                && !parameters.containsKey("state")
                && !parameters.containsKey("country")
                && !parameters.containsKey("zipcode")) {
            return false;
        }
        return true;

    }

    private Customer generateCustomer(HashMap<String, String> parameters) throws Exception {
        Address customerAddress = new Address(1, parameters.get("street_address1"),
                parameters.get("street_address2"), parameters.get("city"),
                parameters.get("state"), parameters.get("country"), parameters.get("zipcode")
        );
        return new Customer(++this.customerCount, parameters.get("first_name"), parameters.get("last_name"),
                parameters.get("phone_number"), parameters.get("email_address"), customerAddress);

    }
}
