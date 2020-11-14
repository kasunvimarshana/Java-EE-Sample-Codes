package com.im.test;

import org.hibernate.cfg.Configuration;

import com.im.model.Brand;
import com.im.model.Car;
import com.im.model.Member;

import org.hibernate.SessionFactory;

import java.util.Date;

import org.hibernate.Session;

public class Demo3 {

	public static void main(String[] args){
		
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Member member = (Member) session.get(Member.class, 1);
		Brand brand = (Brand) session.get(Brand.class, 1);
		
		Car car = new Car();
		
		car.setTitle("CRV 2012 for Sale in Colombo");
		car.setDescription("Bla b");
		car.setPrice(7400000);
		car.setDate(new Date());
		car.setYear(2017);
		car.setMember(member);
		car.setBrand(brand);
		
		session.save(car);
		session.getTransaction().commit();
		
	}
	
}
