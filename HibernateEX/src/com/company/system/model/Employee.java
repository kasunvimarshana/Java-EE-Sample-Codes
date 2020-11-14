/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.model;

import java.util.Collection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author KASUN
 */
@Entity
public class Employee{
	//
	@Id
    @GeneratedValue
    private int id;
    private String name;
	@Embedded
    private Address address;
	//
    @OneToMany(mappedBy="employee")
    private Collection<EmployeePhone> employeePhone;
    @OneToMany(mappedBy="coordinator")
    private Collection<Customer> customer;

    //
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    //
    public Collection<EmployeePhone> getEmployeePhone() {
        return employeePhone;
    }
    public void setEmployeePhone(Collection<EmployeePhone> employeePhone) {
        this.employeePhone = employeePhone;
    }
    public Collection<Customer> getCustomer() {
        return customer;
    }
    public void setCustomer(Collection<Customer> customer) {
        this.customer = customer;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
    
}
