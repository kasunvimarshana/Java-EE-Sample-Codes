package com.im.customer.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.im.customer.model.Customer;

public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO {

	// add the customer
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(customer);
	}

	// return all the customers in list
	@Override
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return  getHibernateTemplate().find("from Customer");
	}

}
