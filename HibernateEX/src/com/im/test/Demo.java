package com.im.test;

import com.im.model.Address;
import com.im.model.Member;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class Demo {

	public static void main(String[] args){
		
		/*Member member = new Member();
		Address address = new Address();
		address.setAddress("address line 1");
		address.setCity("city");
		address.setPostalcode(00000);
		address.setCountry("country");
		//member.setId(2);
		member.setName("name");
		member.setAddress(address);
		member.setTelephone("0000000000");*/
		
		//Configuration = org.hibernate.cfg.Configuration
		Configuration configuration = new Configuration();
		//SessionFactory = org.hibernate.SessionFactory
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		//Session = org.hibernate.Session
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		//session.save(member);
		session.getTransaction().commit();
		
		
	}
	
}
