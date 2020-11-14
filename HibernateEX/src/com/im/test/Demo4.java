package com.im.test;

import org.hibernate.cfg.Configuration;

import com.im.model.Car;

import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Session;

public class Demo4 {

	public static void main(String[] args){
		
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		List<Car> car = session.createCriteria(Car.class).list();
		
		for(Car c : car){
			System.out.println("Title = " + c.getTitle());
			System.out.println("Date = " + c.getDate());
			System.out.println("Price = " + c.getPrice());
		}
		
	}
	
}
