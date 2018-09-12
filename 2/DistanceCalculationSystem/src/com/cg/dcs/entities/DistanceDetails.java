package com.cg.dcs.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "distance_calculator")
public class DistanceDetails implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		private int distanceid;
		private String Source;
		private String destination;
		private double distance_in_km;
		private double distance_in_miles;
		public int getDistanceid() {
			return distanceid;
		}
		public void setDistanceid(int distanceid) {
			this.distanceid = distanceid;
		}
		public String getSource() {
			return Source;
		}
		public void setSource(String source) {
			Source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public double getDistance_in_km() {
			return distance_in_km;
		}
		public void setDistance_in_km(double distance_in_km) {
			this.distance_in_km = distance_in_km;
		}
		public double getDistance_in_miles() {
			return distance_in_miles;
		}
		public void setDistance_in_miles(double distance_in_miles) {
			this.distance_in_miles = distance_in_miles;
		}
		@Override
		public String toString() {
			return "DistanceDetails [distanceid=" + distanceid + ", Source="
					+ Source + ", destination=" + destination
					+ ", distance_in_km=" + distance_in_km
					+ ", distance_in_miles=" + distance_in_miles + "]";
		}
		
		
		
	
}
