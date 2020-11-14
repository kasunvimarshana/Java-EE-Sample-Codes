/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author KASUN
 */
@Entity
public class EmployeePhone {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name="id")
    private Employee employee;
    private String phone;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString(){
        return this.getPhone();
    }
    
}
