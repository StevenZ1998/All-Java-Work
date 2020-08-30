package com.skillstorm.data;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.skillstorm.beans.Person;

public class PersonDAO {
	
	// Hibernate 3.6 is followed below.
	// Hibernate 4.0+ requires a ServiceRegistry + ServiceRegistryBuilder.
	
	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	// User FROM clause to load a complete persistent object into memory.
	public void insert(Person person) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
		session.close();
	}
	
	public Person findByName(String name) {
		String hql = "from Person where name  = :param";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		query.setString("param", name);
		return (Person)query.uniqueResult();
	}
	
	public void findAll() {
		/* Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Person");
		System.out.println(query.list());
		session.close(); */
		
		System.out.println(sessionFactory.openSession().createQuery("From Person").list());
	}
	
	public Person findById(long id) {
		Session session = sessionFactory.openSession();
		Person p = (Person)session.get(Person.class, id);
		session.close();
		return p;
	}
	
}
