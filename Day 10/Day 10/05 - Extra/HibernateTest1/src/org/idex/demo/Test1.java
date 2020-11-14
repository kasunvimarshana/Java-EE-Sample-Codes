package org.idex.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.idex.model.Profile;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Profile user1 = new Profile();
		user1.setId(1);
		user1.setUserName("Nadun");
		user1.setPassword("123");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user1);
		session.getTransaction().commit();

	}

}
