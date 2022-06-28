package com.cars.rental.CarsDetails;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@Qualifier("ThirdService")
public class ThirdController implements FetchAvailableService {

	private static final Throwable Id = null;
	@Autowired
	FetchAvailableService fetchAvailableService;
		
	@GetMapping(path = "avcars")
	public List<AvailableCar> fetchAvailableCars() {		
		
		return fetchAvailableService.findAll();
		
	}
	@GetMapping(path = "avcars/{av_Id}")
	public AvailableCar fetchAvailableCarsById(@PathVariable int av_Id) {		
		
		Optional<AvailableCar>availble = fetchAvailableService.findById(av_Id);
		if(availble.isEmpty())
		{
			throw new RuntimeException("Car not found with Id" +av_Id );
		}
		return availble.get();
		
	}
	@PostMapping("/avcars")
	public void addAvailableCar(@RequestBody AvailableCar availble)
	{
		fetchAvailableService.save(availble);
	}
	
	@DeleteMapping(path = "avcars/{av_Id}")
	public void deleteAvailableCar(@PathVariable int av_Id)
	{
		fetchAvailableService.deleteById(av_Id);
	}
	@Override
	public List<AvailableCar> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<AvailableCar> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends AvailableCar> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends AvailableCar> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends AvailableCar> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAllInBatch(Iterable<AvailableCar> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public AvailableCar getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AvailableCar getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AvailableCar getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends AvailableCar> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends AvailableCar> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<AvailableCar> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends AvailableCar> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<AvailableCar> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(AvailableCar entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends AvailableCar> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends AvailableCar> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends AvailableCar> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends AvailableCar> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends AvailableCar> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public <S extends AvailableCar, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<AvailableCar> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	
	
}
