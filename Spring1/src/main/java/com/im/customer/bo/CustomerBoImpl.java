package com.im.customer.bo;

import java.util.List;

import com.im.customer.dao.CustomerDAO;
import com.im.customer.model.Customer;

public class CustomerBoImpl implements CustomerBo{
	
	CustomerDAO customerDAO;
	//DI via Spring
	public void setCustomerDAO(CustomerDAO customerDAO) {
		//In here you must implement business logics.
		this.customerDAO = customerDAO;
	}

	//call DAO to save customer
	public void addCustomer(Customer customer){ 
		//In here you must implement business logics.
		customerDAO.addCustomer(customer);
	}
	
	//call DAO to return customers
	public List<Customer> listCustomer(){
		//In here you must implement business logics.
		return customerDAO.listCustomer();
	}


}
