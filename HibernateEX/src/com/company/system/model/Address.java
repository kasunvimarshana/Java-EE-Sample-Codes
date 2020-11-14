/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.model;

import com.company.system.util.Commons;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author KASUN
 */
public class Address {
    private String postalCode;
    private String addressLine1;
    private String addressLine2;
    private String city;
    @ManyToOne
    @JoinColumn(name="id")
    private Country country;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    public String getAddress(){
        String address = "";
        String postalCode = this.getPostalCode();
        String addressLine1 = this.getAddressLine1();
        String addressLine2 = this.getAddressLine2();
        String city = this.getCity();
        String country = this.getCountry().getName();
        address += Commons.isset(addressLine1) ? addressLine1+", " : "";
        address += Commons.isset(addressLine2) ? addressLine2+", " : "";
        address += Commons.isset(city) ? city+", " : "";
        address += Commons.isset(postalCode) ? postalCode+", " : "";
        address += Commons.isset(country) ? country : "";
        return address;
    }
    
    @Override
    public String toString(){
        return this.getAddress();
    }
            
}
