package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Person;

public class PersonDao {

	public void savePerson(Person person) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

	}

	public void updatePerson(Person person) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();

	}

	public void deletePerson(Person person) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();

	}
	

}
