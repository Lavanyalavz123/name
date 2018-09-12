package com.cg.dcs.dao;

import javax.persistence.EntityManager;


import com.cg.dcs.entities.DistanceDetails;

public class DistanceDaoImpl implements distanceDao { 
	
	private EntityManager entityManager;
	public DistanceDaoImpl() {
		entityManager =JPAUtil.getEntityManager();
	}

@Override
public void calculateDistance(DistanceDetails dt) {
	entityManager.persist(dt);
	
}

@Override
public void beginTransaction() {
	entityManager.getTransaction().begin();
	
}

@Override
public void commitTransaction() {
	entityManager.getTransaction().commit();
	
}
}
