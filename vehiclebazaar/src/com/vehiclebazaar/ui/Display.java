package com.vehiclebazaar.ui;
import java.util.List;

import com.vehiclebazaar.data.*;
public class Display {
      /* public static void printVehicleCar(Car car) {
    	System.out.println("Company name\t" +car.getBrand());
    	System.out.println("Fuel type\t" +car.getFuelType());
    	System.out.println("Color\t"+car.getColor());
    	System.out.println("Price\t"+car.getPrice());
    	System.out.println("Maximum speed\t" +car.getMaximumSpeed());
    	System.out.println("Horse power\t"+car.getHorsePower());
    	System.out.println("Model\t"+car.getModel());
    	System.out.println("Customer Reviews\t"+car.getReviews());
       }*/
       
      /* public static void printVehicleBike(Bike bike) {
       	System.out.println("Company name\t" +bike.getBrand());
       	System.out.println("Fuel type\t" +bike.getFuelType());
       	System.out.println("Color\t"+bike.getColor());
       	System.out.println("Price\t"+bike.getPrice());
       	System.out.println("Maximum speed\t" +bike.getMaximumSpeed());
       	System.out.println("Horse power\t"+bike.getPower());
       	System.out.println("Model\t"+bike.getModel());
       	System.out.println("Customer Reviews\t"+bike.getReviews());
          } */
       
       public static void printVehicle(List<VehicleInfo> vehicle) {
    	   for (VehicleInfo vehicles : vehicle) {
    		   if(vehicles instanceof Car) {
    			   Car car = (Car) vehicles;
    			   System.out.println("Company name\t" +car.getBrand());
       	    	   System.out.println("Fuel type\t" +car.getFuelType());
       	    	   System.out.println("Color\t"+car.getColor());
       	    	   System.out.println("Price\t"+car.getPrice());
       	    	   System.out.println("Maximum speed\t" +car.getMaximumSpeed());
       	    	   System.out.println("Horse power\t"+car.getHorsePower());
       	    	   System.out.println("Model\t"+car.getModel());
       	    	   System.out.println("Customer Reviews\t"+car.getReviews());
    		   }else if(vehicles instanceof Bike) {
    			   Bike bike = (Bike)vehicles;
    			   System.out.println("Company name\t" +bike.getBrand());
    		       	System.out.println("Fuel type\t" +bike.getFuelType());
    		       	System.out.println("Color\t"+bike.getColor());
    		       	System.out.println("Price\t"+bike.getPrice());
    		       	System.out.println("Maximum speed\t" +bike.getMaximumSpeed());
    		       	System.out.println("Horse power\t"+bike.getPower());
    		       	System.out.println("Model\t"+bike.getModel());
    		       	System.out.println("Customer Reviews\t"+bike.getReviews());
    			   
    		   }
    	   }
       }       
       
       }
