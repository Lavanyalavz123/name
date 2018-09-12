package com.cg.dcs.dao;


import com.cg.dcs.entities.DistanceDetails;

public interface distanceDao {

	public abstract void calculateDistance(DistanceDetails  dt);
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
