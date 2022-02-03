package com.vehiclebazaar;
import java.util.ArrayList;
import java.util.List;

import com.vehiclebazaar.data.*;
import com.vehiclebazaar.ui.*;
public class VehicleBazaarMain {
	
	public static void main(String[]args) {
		
		
		Car car = new Car();
		Bike bike = new Bike();
		Display display = new Display();
		System.out.println("---------------------------Welcome to Vehiclebazaar.com----------------------");
		
		
		
		car.setBrand("Tata");
		car.setModel("Sumo");
		car.setColor("white");
		car.setFuelType("Diesel");
		car.setPrice(2000000);
		car.setMaximumSpeed(200);
		car.setReviews("good");
		car.setHorsePower(130);
		//Display.printVehicle( (List<VehicleInfo>)car);
		
		bike.setBrand("Bajaj");
		bike.setModel("Vikrant");
		bike.setColor("black");
		bike.setFuelType("Petrol");
		bike.setPrice(100000);
		bike.setMaximumSpeed(180);
		bike.setReviews("good");
		bike.setPower(80);
		//Display.printVehicle((List<VehicleInfo>) bike);
		VehicleInfo vehicles[] = new VehicleInfo[2];
		vehicles[0]= car;
		vehicles[1]= bike;
		List<VehicleInfo> list = new ArrayList<VehicleInfo>();
		list.add(car);
		list.add(bike);
		Display.printVehicle(list);
		
	}
	
	
}
