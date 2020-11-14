package com.im.customer.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.im.customer.bo.CustomerBo;
import com.im.customer.model.Customer;

public class CustomerAction implements ModelDriven {
	Customer customer = new Customer();
	List<Customer> customerList = new ArrayList<Customer>();
	CustomerBo customerBo;

	// Getters & Setters Here
	public Object getModel() {
		return customer;
	}

	public String addCustomer() throws Exception {
		customer.setCreatedDate(new Date());
		customerBo.addCustomer(customer);
		customerList = customerBo.listCustomer();
		return "success";
	}

	public String listCustomer() throws Exception {
		customerList = customerBo.listCustomer();
		return "success";
	}

}
