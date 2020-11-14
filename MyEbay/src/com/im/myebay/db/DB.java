package com.im.myebay.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DB {

	public static SessionFactory sessionFactory = buildSessionFactory();
	
	public static SessionFactory buildSessionFactory(){
		return new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	//save
	public static void save(Object object){
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
	}
	
	//delete
	public static void delete(Object object){
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(object);
		session.getTransaction().commit();
	}
	
	//select
	public static List list(String className){
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		return session.createQuery("from "+className).list();
	}

	
}
