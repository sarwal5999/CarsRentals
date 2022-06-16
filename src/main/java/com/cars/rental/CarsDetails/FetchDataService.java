package com.cars.rental.CarsDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchDataService extends JpaRepository<CarModel, Integer> {

	@Override
	List<CarModel> findAll();
	
	
	
	
}
