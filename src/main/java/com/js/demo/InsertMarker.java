package com.js.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertMarker {
	
   public static void main(String[] args) {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("suhas");
	  EntityManager em = emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
	 
	  Marker m = new Marker();
	  m.setId(5);
	  m.setBrand("doms");
	  m.setColor("black");
      m.setPrice(45.0);
      
	  et.begin();
	  em.persist(m);
	  et.commit();
	  
	  System.out.println("Done");
   }
}