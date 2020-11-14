package org.idex.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.idex.entity.Category;

public class Demo {
	public static void main(String[] args) {
		Category cat = new Category();
		cat.setId(1);
		cat.setName("Food");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(cat);
		session.getTransaction().commit();
	}
}
