
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ict4315.week3;

import com.ict4315.week3.Interfaces.AddressInterface;

/**
 *
 * @author Iyasu
 */
public final class Address implements AddressInterface{
  
  private final int id;
  private final String streetAddress1;
  private final String streetAddress2;
  private final String city;
  private final String state;
  private final String country;
  private final String zipcode;

    public int getId() {
        return id;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

  
 

  public Address(int id, String streetAddress1, String streetAddress2, String city,
                 String state, String country, String zipcode) throws Exception
  {
     if( id <= 0 )
     {
        throw new Exception("Address Id field must be greater than 0");
     }
     if( streetAddress1.trim().isEmpty() )
     {
       throw new Exception("No street address provided");
     }
     else if( country.trim().isEmpty() ) {
       throw new Exception("No country provided");
     }
     else if( city.trim().isEmpty() ) {
       throw new Exception("No city provided");
     }
     else {
     this.id = id;
     this.streetAddress1 = streetAddress1.trim();
     this.streetAddress2 = streetAddress2.trim();
     this.city = city.trim();
     this.state = state.trim();
     this.country = country.trim();
     this.zipcode = zipcode.trim();
    }
  }  

  public String getAddressInfo() {
    String streetAddress2Portion = String.format("%s,", streetAddress2);
    String statePortion = String.format(" %s, ", state);
    String countryPortion = String.format("%s,", country);
    String zipPortion = String.format(" %s", zipcode);

    if(streetAddress2 == "") {
      streetAddress2Portion = "";
    }
    if(state.isEmpty()) {
      statePortion = "";
    }
    if(zipcode.isEmpty()) {
      zipPortion = "";
    }

    return streetAddress1 + "," + streetAddress2Portion + city +
           statePortion + country + zipPortion;

  }
  
    public boolean equals(Object obj) {
      Address comparedAddress = (Address)obj;
      
      return id == comparedAddress.id &&
              getAddressInfo().equals(comparedAddress.getAddressInfo());
       
   }
  

}