/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import com.ict4315.week4.Interfaces.Command;
import java.util.HashMap;

/**
 *
 * @author iyasu
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String expectedCustomerId = "1";
        Address parkingOfficeAddress = new Address(10, "726 Pierce Avenue", "Drexel Hill", "Denver", "CO", "USA", "19026 ");
        Address customerAddress = new Address(10, "123 Colorado Blvd", "Aspen Hill", "Denver", "CO", "USA", "8565 ");
        Customer expectedCustomer = new Customer(1, "James", "Jones", "720-111-1111", "james.jones@jones.com", customerAddress);
        PermitManager permitManager = new PermitManager();
        ParkingOffice parkingOffice = new ParkingOffice("Main Office", parkingOfficeAddress, new TransactionManager(permitManager));
        HashMap commandList = new HashMap<String, Command>();
        HashMap parameterList = new HashMap<String, String>();
        commandList.put("CUSTOMER", new RegisterCustomerCommand(parkingOffice));
        commandList.put("CAR", new RegisterCarCommand(parkingOffice));
        ParkingServices parkingService = new ParkingServices(commandList, parkingOffice);
        parameterList.put("first_name", expectedCustomer.getFirstName());
        parameterList.put("last_name", expectedCustomer.getLastName());
        parameterList.put("phone_number", expectedCustomer.getPhoneNumber());
        parameterList.put("email_address", expectedCustomer.getEmailAddress());
        parameterList.put("street_address1", expectedCustomer.getAddress().getStreetAddress1());
        parameterList.put("street_address2", expectedCustomer.getAddress().getStreetAddress2());
        parameterList.put("city", expectedCustomer.getAddress().getCity());
        parameterList.put("state", expectedCustomer.getAddress().getState());
        parameterList.put("country", expectedCustomer.getAddress().getCountry());
        parameterList.put("zipcode", expectedCustomer.getAddress().getZipcode());
        System.out.println(parameterList.toString());
        
        String actualCustomerId = parkingService.performCommand("CUSTOMER", parameterList);
        
        System.out.println("actual customer: " + actualCustomerId);
        System.out.println(expectedCustomer.getCustomerName());
        System.out.println(parkingOffice.getListOfCustomers().size());
        System.out.println(parkingOffice.getListOfCustomers().get(0).getCustomerName());
        System.out.println(expectedCustomer.getCustomerName());
    }

}
