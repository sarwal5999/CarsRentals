package com.cars.rental.CarsDetails;


import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.cars.rental.until.EngineType;
import com.cars.rental.until.FuelType;
import com.cars.rental.until.CarType;


@Entity
@Table(name = "Car_Details")
public class CarModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "car_id")
	Integer  carId;	
	
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

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
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
		return "CarModel [carId=" + carId + ", make=" + make + ", model=" + model + ", year=" + year + ", color="
				+ color + ", rego=" + rego + ", fuelType=" + fuelType + ", engineType=" + engineType + ", seats="
				+ seats + ", carType=" + carType + "]";
	}

	
		
	}

	
	

