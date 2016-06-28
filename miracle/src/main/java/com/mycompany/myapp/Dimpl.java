package com.mycompany.myapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Dimpl implements Dao<FormModel> {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");

	public List<FormModel> getAll() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("FROM FormModel");
		@SuppressWarnings("unchecked")
		List<FormModel> list = query.getResultList();
		manager.close();
		return list;
	}


	public void add(FormModel fm) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		manager.persist(fm);
		tran.commit();
		manager.close();
	}

}
