package com.vehiclebazar;

public class Car extends VehicleInfo{
	
	public Car(String company, long vNumber, String model) {
		super(company, vNumber, model);
		//System.out.println("---------------Car-------------------");
	}
	
	
	//properties
	int engineHorsepower;
	int seatingCapacity;
	String fuelType;
	int insurance;
	
	
	
	//methods
	public void setEngineHorsepower(int engineHorsepower) {
		this.engineHorsepower = engineHorsepower;
	}
	public int getEngineHorsepower() {return engineHorsepower;}
	public void setinsurance(int insurance) {this.insurance= insurance;}
	public int getinsurance() {return insurance;}
	public void setFueltype(String fuelType) {this.fuelType=fuelType;}
	public String getFueltype() {return fuelType;}
	
	
	
	
	
		
	
	
	
	
}
