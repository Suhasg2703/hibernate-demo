package com.js.compositekey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
  public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("suhas");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	UserData ud = new UserData();
	ud.setEmail("uday@gmail.com");
	ud.setPhone(996438537);
	
	User u = new User();
	u.setId(1);
	u.setAge(23);
	u.setName("uday");
	
	u.setUd(ud);
	
	et.begin();
	em.persist(u);
	et.commit();
}
}
