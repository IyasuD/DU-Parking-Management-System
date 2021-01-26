/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3;

import com.ict4315.week3.Address;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author nisca
 */
public class AddressTest {

    public AddressTest() {
    }

 @Test
public void testGetAddressInfoPass() throws Exception {

  String expected = "20 Joseph Street,Bronx NY, USA 11221";
  Address address = new Address(10, "20 Joseph Street", "", "Bronx", "NY", "USA", "11221");
  assertEquals(expected, address.getAddressInfo());
}
@Test
public void testGetAddressInfoNoZipCodePass() throws Exception {

  String expected = "20 Joseph Street,South Iris,Bronx NY, USA";
  Address address = new Address(10, "20 Joseph Street", "South Iris", "Bronx", "NY", "USA", "");
  assertEquals(expected, address.getAddressInfo());
}

/* This test is testing to ensure the constructor of the address class fails
  when no street address is provided
*/
@Test
public void testAddressConstructorFail() throws Exception {
 String expected = "No street address provided";
  try {
   
  Address address = new Address(5,"", "", "Bronx", "NY", "USA", "111");
  String addressInfo =  address.getAddressInfo();
}
catch (Exception e) {
  assertEquals(e.getMessage(), expected);
}
}


@Test
public void testAddressConstructorNoCityFail() throws Exception {
 String expected = "No city provided";
  try {
   
  Address address = new Address(10,"7855 Jack Street", "", "", "NY", "USA", "111");
  String addressInfo =  address.getAddressInfo();
}
catch (Exception e) {
  assertEquals(e.getMessage(), expected);
}
}

}