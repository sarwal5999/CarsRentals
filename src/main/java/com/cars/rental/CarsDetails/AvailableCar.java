package com.cars.rental.CarsDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "available_cars")
public class AvailableCar {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "av_id")
	Integer  av_Id;
	
	@Column(name = "car_id")
	Integer  car_Id;	
	
	@Column(name = "make")
	String make;		
	
	@Column(name = "model")
	String model;	
	
	@Column(name = "year")
	Integer year;		
	
	@Column(name = "color")
	String color;	
	
	@Column(name = "rego")
	String rego;		
	
	@Column(name = "fuel_type")
	//FuelType fuelType;
	String fuelType;
	
	@Column(name = "engine_type")
	//EngineType engineType;
	String engineType;
	
	@Column(name = "seats")
	Integer seats;
	
	@Column(name = "car_type")
	//CarType carType;
	String carType;

	public Integer getAv_Id() {
		return av_Id;
	}

	public void setAv_Id(Integer av_Id) {
		this.av_Id = av_Id;
	}

	public Integer getCar_Id() {
		return car_Id;
	}

	public void setCar_Id(Integer car_Id) {
		this.car_Id = car_Id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRego() {
		return rego;
	}

	public void setRego(String rego) {
		this.rego = rego;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "AvailableCar [av_Id=" + av_Id + ", car_Id=" + car_Id + ", make=" + make + ", model=" + model + ", year="
				+ year + ", color=" + color + ", rego=" + rego + ", fuelType=" + fuelType + ", engineType=" + engineType
				+ ", seats=" + seats + ", carType=" + carType + "]";
	}

	

	
}
