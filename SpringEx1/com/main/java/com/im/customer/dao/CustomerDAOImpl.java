package com.im.customer.dao;

import java.util.List;

import com.im.customer.model.Customer;

public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO {

	// add the customer
	@Override
	public void addCustomer(Customer customer) {
		getHibernateTemplate().save(customer);
	}

	// return all the customers in list
	@Override
	public List<Customer> listCustomer() {
		return getHibernateTemplate().find("from Customer");
	}

}
