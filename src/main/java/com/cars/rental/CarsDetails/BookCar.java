package com.cars.rental.CarsDetails;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_car")
public class BookCar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Integer  id;	
	
	@Column(name = "fromd")
	Date fromd;		
	
	@Column(name = "tod")
	Date tod;	
	
	@Column(name = "car_id")
	Integer car_id;		
	
	@Column(name = "name")
	String name;	
	
	@Column(name = "address")
	String address;
	
	@Column(name = "driving_licence")
	String driving_licence;	
	
	@Column(name = "phone")
	String phone;	
	
	@Column(name = "amount")
	float amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFromd() {
		return fromd;
	}

	public void setFromd(Date fromd) {
		this.fromd = fromd;
	}

	public Date getTod() {
		return tod;
	}

	public void setTod(Date tod) {
		this.tod = tod;
	}

	public Integer getCar_id() {
		return car_id;
	}

	public void setCar_id(Integer car_id) {
		this.car_id = car_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDriving_licence() {
		return driving_licence;
	}

	public void setDriving_licence(String driving_licence) {
		this.driving_licence = driving_licence;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BookCar [id=" + id + ", fromd=" + fromd + ", tod=" + tod + ", car_id=" + car_id + ", name=" + name
				+ ", address=" + address + ", driving_licence=" + driving_licence + ", phone=" + phone + ", amount="
				+ amount + "]";
	}		
	
}
