package com.vehiclebazar;

public  class VehicleInfo {
	
	VehicleInfo(String company, long vNumber, String model){
		System.out.println("-----------Welcome to VehicleBazar.com-----------");
		this.company = company;
		this.vNumber= vNumber;
		this.model= model;
	}
	
	
	// properties
	public String vehicleType;
	public String company;
	public int milage;
	public long price;
	public long vNumber;
	public String model;
	public String color;
	String customerReview;
	
	//methods
	public void setInfo(String vehicleType, String company, int milage, int price,int vNumber, String model, String color,String customerReview) {
		this.vehicleType = vehicleType;
		this.company = company;
		this.milage = milage;
		this.price= price;
		this.vNumber= vNumber;
		this.model = model;
		this.color = color;
		this.customerReview = customerReview;
				
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	//public String getCompany() {return company;}
	public int getMilage() {return milage;}
	public long getPrice() {return price;}
	//public long getvNumber() {return vNumber;}
	public String getColor() {return color;}
	//public String getModel() {return model;}
	public void setreview(String customerReview) {this.customerReview = customerReview;}
	public String getreview() {return customerReview;}
}

