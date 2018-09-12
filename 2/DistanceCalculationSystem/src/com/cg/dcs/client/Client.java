package com.cg.dcs.client;

import java.util.Scanner;


import com.cg.dcs.entities.DistanceDetails;
import com.cg.dcs.service.DistanceService;
import com.cg.dcs.service.DistanceServiceImpl;

//This is the user class which accepts user from the input

public class Client {

	public static void main(String[] args) {
		
		int distance_id;
		String source;
		String destination;
		Float distance_in_km;
		double distance_in_miles;
		 
		DistanceService service = new DistanceServiceImpl();
		 
		DistanceDetails  dt = new DistanceDetails();
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter Distance_Id");
		 distance_id=scanner.nextInt();
		 dt.setDistanceid(distance_id);
		
		 System.out.println("Enter Source");
		 source=scanner.next();
		 dt.setSource(source);
		 

		 System.out.println("Enter destination");
		 destination=scanner.next();
		 dt.setDestination( destination);
		 
		 System.out.println("Enter Distance in km");
		 distance_in_km=scanner.nextFloat();
		 dt.setDistance_in_km(distance_in_km);
		 
		 distance_in_miles=0.6*(distance_in_km);
		 dt.setDistance_in_miles(distance_in_miles);
		 System.out.println("The distance in miles is:");
		 System.out.println( distance_in_miles);
		 
		 service.calculateDistance(dt);

	}
}
