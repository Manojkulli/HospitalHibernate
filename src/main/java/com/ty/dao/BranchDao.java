package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Branches;

public class BranchDao {

	public List<Branches> findBranch(){
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Branches s");
		
		return query.getResultList();
	}
}
