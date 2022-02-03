package com.vehiclebazar;

public class Bike extends VehicleInfo{
	
	public Bike(String company, long vNumber, String model) {
		super(company, vNumber, model);
		//System.out.println("---------------Car-------------------");
	}
	
	//properties
	boolean electric;
	int topspeed;
	
	
	//methods
	public void electricVehicle() {
		this.electric = true;
		
	}
	
	public boolean iselectric() {
		return electric;
	}
	
	public void settopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	
	public int gettopspeed() {
		return topspeed;
	}
	
}
