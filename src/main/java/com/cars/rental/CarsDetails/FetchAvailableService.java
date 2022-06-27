package com.cars.rental.CarsDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchAvailableService extends JpaRepository<AvailableCar, Integer> {

	@Override
	List<AvailableCar> findAll();
	
	
	
	
}