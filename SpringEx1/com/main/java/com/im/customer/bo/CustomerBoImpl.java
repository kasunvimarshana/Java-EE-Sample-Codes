package com.im.customer.bo;

import java.util.List;

import com.im.customer.dao.CustomerDAO;
import com.im.customer.model.Customer;

public class CustomerBoImpl implements CustomerBo {

	CustomerDAO customerDAO;

	// DI via Spring
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	// call DAO to save customer
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}

	// call DAO to return customers
	public List<Customer> listCustomer() {
		return customerDAO.listCustomer();
	}
}
