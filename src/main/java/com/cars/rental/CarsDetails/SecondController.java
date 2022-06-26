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
@Qualifier("secondService")
public class SecondController implements FetchBookService {

private static final Throwable Id = null;
@Autowired
FetchBookService fetchBookService;
@GetMapping(path = "book")
public List<BookCar> bookCars() {		
	
	return fetchBookService.findAll();
	
}
@GetMapping(path = "book/{bookId}")
public BookCar bookCarsById(@PathVariable int bookId) {		
	
	Optional<BookCar>bookcar = fetchBookService.findById(bookId);
	if(bookcar.isEmpty())
	{
		throw new RuntimeException("Car not found with Id" +bookId );
	}
	return bookcar.get();
	
}
@PostMapping("/book")
public void bookCar(@RequestBody BookCar bookcar)
{
	fetchBookService.save(bookcar);
}
@DeleteMapping(path = "book/{bookId}")
public void deletebooking(@PathVariable int bookId)
{
	fetchBookService.deleteById(bookId);
}
@Override
public List<BookCar> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<BookCar> findAllById(Iterable<Integer> ids) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <S extends BookCar> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void flush() {
	// TODO Auto-generated method stub
	
}
@Override
public <S extends BookCar> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <S extends BookCar> List<S> saveAllAndFlush(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void deleteAllInBatch(Iterable<BookCar> entities) {
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
public BookCar getOne(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public BookCar getById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public BookCar getReferenceById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <S extends BookCar> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <S extends BookCar> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Page<BookCar> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <S extends BookCar> S save(S entity) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Optional<BookCar> findById(Integer id) {
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
public void delete(BookCar entity) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteAllById(Iterable<? extends Integer> ids) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteAll(Iterable<? extends BookCar> entities) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}
@Override
public <S extends BookCar> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <S extends BookCar> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <S extends BookCar> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public <S extends BookCar> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public <S extends BookCar, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<BookCar> findAll() {
	// TODO Auto-generated method stub
	return null;
}
}
