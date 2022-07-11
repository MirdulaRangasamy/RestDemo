package com.rest.RestDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.RestDemo.dao.CarRepo;
import com.rest.RestDemo.entity.Car;
@Service
public class CarServiceImplemetation implements CarService{
	@Autowired
	private CarRepo crepo;
	
	@Override
	public String addCar(Car c) {
		crepo.save(c);
		return "Car Added Successfully...";
	}

	@Override
	public List<Car> viewCars() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	@Override
	public Car viewCar(int regno) {
		Car c = crepo.findById(regno).orElse(new Car());
		return c;
	}

	@Override
	public String updateCar(Car c) {
		Car c1 = crepo.findById(c.getRegno()).orElse(null);
		if(c1!=null)
		{
			crepo.delete(c1);
		}
		crepo.save(c);
		return "Car Updated";
	}

	@Override
	public String deleteCar(int regno) {
		Car c1 = crepo.findById(regno).orElse(null);
		if(c1!=null)
		{
			crepo.delete(c1);
			return "Car deleted";
		}
		return "Car Not found..";
	}

}
