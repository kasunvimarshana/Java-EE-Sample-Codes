package com.im.test;

import com.im.model.Brand;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Demo2 {

	public static void main(String[] args){
		
		Brand brand = new Brand();
		//brand.setId(1);
		brand.setName("name");
		
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(brand);
		session.getTransaction().commit();
		
	}
	
}
