/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4;

import com.ict4315.week4.Address;
import com.ict4315.week4.Address;
import com.ict4315.week4.RegisterCarCommand;
import com.ict4315.week4.ParkingServices;
import com.ict4315.week4.TransactionManager;
import com.ict4315.week4.RegisterCustomerCommand;
import com.ict4315.week4.ParkingOffice;
import com.ict4315.week4.PermitManager;
import com.ict4315.week4.Customer;
import com.ict4315.week4.Customer;
import com.ict4315.week4.Interfaces.Command;
import com.ict4315.week4.ParkingOffice;
import com.ict4315.week4.ParkingServices;
import com.ict4315.week4.PermitManager;
import com.ict4315.week4.RegisterCarCommand;
import com.ict4315.week4.RegisterCustomerCommand;
import com.ict4315.week4.TransactionManager;
import java.util.HashMap;
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
public class ParkingServicesTest {
    
 

    /**
     * Test of performCommand method, of class ParkingServices.
     */
    @Test
    public void testPerformCommand() throws Exception {
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
        
        assertEquals(expectedCustomerId,actualCustomerId );
        assertEquals(expectedCustomer.getCustomerName(), parkingOffice.getListOfCustomers().get(0).getCustomerName());
         
         
            
      
    }
    
    
}
