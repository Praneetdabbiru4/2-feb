package com.vehiclebazar;

public class VehicleMain {
	
	public static void main(String[]arg) {
		
		Car nano = new Car("Tata",1234, "SUV");
		Bike vikrant = new Bike("Bajaj",2345,"Electric");
		
		nano.setInfo("car", "Tata", 25, 200000, 1234, "Suv", "White", "good");;
		//System.out.println("-----------------------------------");
		System.out.println("Vehicle type\t"+nano.getVehicleType() );
		
		//System.out.println("Company name\t"+nano.getCompany() );
		System.out.println("Milage\t"+nano.getMilage() );
		System.out.println("Price\t"+nano.getPrice()) ;
		//System.out.println("Vehicle Number\t"+nano.getvNumber() );
		//System.out.println("Model\t"+nano.getModel() );
		System.out.println("Vehicle color\t"+ nano.getColor());
		System.out.println("Customer Review\t"+ nano.getreview());
		nano.setEngineHorsepower(0);
		nano.setFueltype("D");
		nano.setinsurance(10000);
		System.out.println("Engine Power\t"+ nano.getEngineHorsepower());
		System.out.println("Fuel type\t"+ nano.getFueltype());
		
		vikrant.setInfo("Bike", "Honda", 13, 50000, 345, "Electric","Black", "Excellient");
        System.out.println("Vehicle type\t"+vikrant.getVehicleType() );
		
		//System.out.println("Company name\t"+vikrant.getCompany() );
		System.out.println("Milage\t"+vikrant.getMilage() );
		System.out.println("Price\t"+vikrant.getPrice()) ;
		//System.out.println("Vehicle Number\t"+vikrant.getvNumber() );
		//System.out.println("Model\t"+vikrant.getModel() );
		System.out.println("Vehicle color\t"+ vikrant.getColor());
		System.out.println("Customer Review\t"+ vikrant.getreview());
		vikrant.settopspeed(150);
		System.out.println("topspeed\t"+vikrant.gettopspeed());
		
		
		
		
		
		
		
		
		
	}
}
