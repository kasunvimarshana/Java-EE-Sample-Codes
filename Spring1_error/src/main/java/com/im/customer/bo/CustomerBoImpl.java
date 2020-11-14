package com.im.customer.bo;

import java.util.List;

import com.im.customer.dao.CustomerDAO;
import com.im.customer.model.Customer;

public class CustomerBoImpl implements CustomerBo {

	CustomerDAO customerDAO;

	// call DAO to save customer
	@Override
	public void addCustomer(Customer customer) {
		//In Here you must implement Business Logics
		customerDAO.addCustomer(customer);
	}

	// call DAO to return customers
	@Override
	public List<Customer> listCustomer() {
		//In Here you should validate Accessibility with Authentication
		return customerDAO.listCustomer();
	}

	// DI via Spring
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
}
