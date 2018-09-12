package com.cg.dcs.service;


import com.cg.dcs.dao.DistanceDaoImpl;
import com.cg.dcs.dao.distanceDao;
import com.cg.dcs.entities.DistanceDetails;

public class DistanceServiceImpl  implements DistanceService{

	private distanceDao dao;
	
	public DistanceServiceImpl() {
		dao = new DistanceDaoImpl();
	}

	
	@Override
	public void calculateDistance(DistanceDetails dt) {
		
		dao.beginTransaction();
		dao.calculateDistance(dt);
		dao.commitTransaction();
	}

}
