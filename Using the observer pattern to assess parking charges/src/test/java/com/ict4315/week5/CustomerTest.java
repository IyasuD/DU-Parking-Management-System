/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ict4315.week5;

import com.ict4315.week5.Customer;
import com.ict4315.week5.Address;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author iyasu
 */
public class CustomerTest {
  /*This test is testing weather the getCustomerName returns the correct
    customer name in the correct format;
 */
  @Test
  public void getCustomerNamePass() throws Exception {
   
   String expected = "John Smith";
   Address address = new Address(4, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
   Customer customer = new Customer(10,"John","Smith","333-333-4454","j@test.com",address);
   assertEquals(expected,customer.getCustomerName());
  
  } 
//Test to ensure that exception is thrown when a customer id is 0;
 @Test
 public void testCustomerConstructorIdZeroFail() throws Exception {
    String expected = "Customer Id field must be greater than 0";
   try {
     Address address = new Address(5, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
     Customer customer = new Customer(0,"John","Smith","333-333-4454","j@test.com",address);
   }
   catch (Exception e) {
    assertEquals(e.getMessage(), expected);
   } 
 }

 @Test
 public void testCustomerConstructorFirstNameMissingFail() throws Exception {
    String expected = "No first name provided";
   try {
     Address address = new Address(5, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
     Customer customer = new Customer(40,"","Smith","333-333-4454","j@test.com",
                              address);
   }
   catch (Exception e) {
    assertEquals(e.getMessage(), expected);
   } 
 }

 @Test
 public void testCustomerConstructorLastNameMissingFail() throws Exception {
    String expected = "No last name provided";
   try {
     Address address = new Address(5, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
     Customer customer = new Customer(40,"John","","333-333-4454","j@test.com",address);
   }
   catch (Exception e) {
    assertEquals(e.getMessage(), expected);
   } 
 }
/*Test to show that the customer name can be displayed even if no telephone number 
  is provided.
*/
 @Test
 public void testCustomerGetCustomerNamePassWithTelephoneNumberPass() throws Exception {
    String expected = "Jane Smith";

    Address address = new Address(5, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
    Customer customer = new Customer(40,"Jane","Smith","","j@test.com",address);
    assertEquals(expected, customer.getCustomerName());

 }

 @Test
 public void testCustomerConstructorNullAddressFail() throws Exception {
   String expected = "No address provided";
   try {
     Customer customer = new Customer(40,"John","Smith","333-333-4454","j@test.com",null);
   }
   catch (Exception e) {
    assertEquals(expected, e.getMessage());
   } 
 }
//Test to show that an exception is thrown when an invalid email address is provided
 @Test
 public void testCustomerConstructorInvalidEmailFail() throws Exception {
   String expected = "Invalid email address format";
   try {
     Address address = new Address(5, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
     Customer customer = new Customer(40,"John","Smith","333-333-4454","jtest.com",address);
   }
   catch (Exception e) {
    assertEquals(expected, e.getMessage());
   } 
 }


}
