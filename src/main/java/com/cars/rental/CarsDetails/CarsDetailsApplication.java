package com.cars.rental.CarsDetails;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cars.rental.until.CarType;
import com.cars.rental.until.EngineType;
import com.cars.rental.until.FuelType;



@SpringBootApplication
public class CarsDetailsApplication {

	
	public static void main(String[] args) {
		//SpringApplication.run(CarsDetailsApplication.class, args);
		char answer = 'n';
		  Scanner input = new Scanner(System.in);
		  CarsDetailsApplication car = new CarsDetailsApplication();
		  
		  //FuelType fuelType = main.getFuelType();
		  
		  do {
				car.carsDetails();
	        	
				if( getFuelType().equals("Wrong Input Please Enter the Correct Input"))
				{
					car.getFuelType();
				}
				if( getCarType().equals("Wrong Input Please Enter the Correct Input"))
				{
					car.getCarType();
				}
				if( getEngineType().equals("Wrong Input Please Enter the Correct Input"))
				{
					car.getEngineType();
				}
				
			
	        	System.out.println("\n Do you want to process another Car Record (y/n): ");
	        	answer = input.next().charAt(0);
	        	
	        	if (Character.toLowerCase(answer)  != 'y' && Character.toLowerCase(answer) !='n')
	        	{
	        		System.out.println("Enter only Y or N!");
	        		System.out.println("\n Do you want to process another Car Record (y/n): ");
	            	answer = input.next().charAt(0);
	        	}
	        	
	        } while (Character.toLowerCase(answer) != 'n'); 
		  {
			  System.out.println("\n Exist");
		}
		
	}
	
	public static CarModel carsDetails()
	{
		System.out.println("Add car details /n");
		Scanner scan = new Scanner(System.in);
		CarModel carModel = new CarModel();
		
		System.out.println("Enter the Make");
		String make  = scan.nextLine();
		carModel.setMake(make);
		//System.out.println("Car Make is:" + make);
		
		System.out.println("Enter the Model");
		String model  = scan.nextLine();
		carModel.setMake(model);
		//System.out.println("Car Model is:" + model);
		
		System.out.println("Enter the Year");
		String year  = scan.nextLine();
		carModel.setMake(year);
		//System.out.println("Car Make is:" + year);
		
		System.out.println("Enter the Car Color");
		String color = scan.nextLine();
		carModel.setColor(color);
		//System.out.println("Car Colour is:" + color);
		
		System.out.println("Enter the Rego number");
		String rego = scan.nextLine();
		carModel.setRego(rego);
		//System.out.println("Car Rego is:" + rego);
		
		System.out.println("Enter the Seat number");
		String seats = scan.nextLine();
		carModel.setRego(seats);
		//System.out.println("Car Seat is:" + seats);
	
		System.out.println(carModel);
		return carModel;
	}
	
	
		
	
	public static FuelType getFuelType() {
		 
		Scanner scan = new Scanner(System.in);  
			
			System.out.println("You can choose any vehicle based on below fuel types.. ");
			System.out.println("D - DiSEL");
			System.out.println("P - Petrol");
			System.out.println("PH - PHEV");
			System.out.println("EV - Fully Electical");
			System.out.print("Choose Fule Type : "); 
			String userFuelType = scan.nextLine();
			System.out.println(" You have Entered : " + userFuelType );
			
			FuelType fuelType = null;
			
		    switch(userFuelType.toUpperCase()) {
		      case "D":
		    	  fuelType = FuelType.DISEL;
		        System.out.println("User has choosen :" + fuelType);
		        break;
		      case "P":
		    	  fuelType = FuelType.PETROL;
		    	  System.out.println("User has choosen :"+ fuelType);
		        break;
		      case "PH":
		    	  fuelType = FuelType.PHEV;
		    	  System.out.println("User has choosen :" + fuelType);
		        break;
		      case "EV":
		    	  fuelType = FuelType.EV;
		    	  System.out.println("User has choosen : "+ fuelType);
		        break;
		        
		        default:
		        	System.out.println("Wrong Input Please Enter the Correct Input");
		        	
					
								    }			    
		    return fuelType;
	 }
	public static CarType getCarType() {
		 
		Scanner scan = new Scanner(System.in);  
		
			
			System.out.println("You can choose any Car types.. ");
			System.out.println("S - SEDAN");
			System.out.println("X - XUV");
			System.out.println("H - HATCHBACK");
			System.out.println("M - MINIVAN");
			System.out.print("Choose Car Type : "); 
			String userCarType = scan.nextLine();
			System.out.println(" You have Entered : " + userCarType );
			
			CarType carType = null;
			
		    switch(userCarType.toUpperCase()) {
		      case "S":
		    	  carType = CarType.SEDAN;
		        System.out.println("User has choosen :" + carType);
		        break;
		      case "X":
		    	  carType = CarType.XUV;
		    	  System.out.println("User has choosen :"+ carType);
		        break;
		      case "H":
		    	  carType = CarType.HATCHBACK;
		    	  System.out.println("User has choosen :" + carType);
		        break;
		      case "M":
		    	  carType = CarType.MINIVAN;
		    	  System.out.println("User has choosen : "+ carType);
		        break;
		        
		        default:
		        	System.out.println("Wrong Input Please Enter the Correct Input");
		        	
					
								    }			    
		    return carType;
	 }
	public static EngineType getEngineType() {
		 
		Scanner scan = new Scanner(System.in);  
		
			
			System.out.println("You can Choose Car Engine types.. ");
			System.out.println("A - AUTOMATIC");
			System.out.println("M - MANUAL");
			System.out.print("Choose Car Engine Type : "); 
			String userEngineType = scan.nextLine();
			System.out.println(" You have Entered : " + userEngineType );
			
			EngineType engineType = null;
			
		    switch(userEngineType.toUpperCase()) {
		      case "A":
		    	  engineType = EngineType.AUTOMATIC;
		        System.out.println("User has choosen :" + engineType);
		        break;
		      case "M":
		    	  engineType = EngineType.MANUAL;
		    	  System.out.println("User has choosen :"+ engineType);
		        break;
		        
		        default:
		        	System.out.println("Wrong Input Please Enter the Correct Input");
		        	
					
								    }			    
		    return engineType;
	 }
}


