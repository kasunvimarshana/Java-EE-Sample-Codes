package org.idex.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.idex.model.Member;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Member member =  new Member();
		member.setId(1);
		member.setUserName("Nadun");
		member.setPassword("123");


		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();

	}

}
