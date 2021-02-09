/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ict4315.week5;

import com.ict4315.week5.Interfaces.PersonInterface;

/**
 *
 * @author Iyasu
 */
public final class Customer implements PersonInterface{
  
  private final int id;
  private final String firstName;
  private final String lastName;
  private final String phoneNumber;
  private final String emailAddress;
  private final Address address;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Address getAddress() {
        return address;
    }
  

  public Customer(int id, String firstName, String lastName, String phoneNumber, 
         String emailAddress, Address address) throws Exception {
    
    if( id <= 0 )
    {
       throw new Exception("Customer Id field must be greater than 0");
    }

    if( firstName.trim().isEmpty() )
    {
       throw new Exception("No first name provided");
    }

    if( lastName.trim().isEmpty() )
    {
       throw new Exception("No last name provided");
    }

    if( address == null ) {
        throw new IllegalArgumentException("No address provided");
    }

    if(!emailAddress.contains("@")) {
         throw new Exception("Invalid email address format");
    }
   
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.address = address;
  }

  public String getCustomerName() {
   
    return String.format("%s %s",firstName, lastName); 
  }

  public String getCustomerAddress() {
 
    return address.getAddressInfo();  

  }
  
  public boolean equals(Object obj) {
      Customer comparedCustomer = (Customer)obj;
      
      return id == comparedCustomer.id &&
              firstName.equals(comparedCustomer.firstName) &&
              phoneNumber.equals(comparedCustomer.phoneNumber) &&
              address.equals(comparedCustomer.address);
  }
  
}
