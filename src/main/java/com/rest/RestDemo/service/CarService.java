package com.rest.RestDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.rest.RestDemo.entity.Car;

@Service
public interface CarService {
	String addCar(Car c);
	List<Car> viewCars();
	Car viewCar(int regno);
	String updateCar(Car c);
	String deleteCar(int regno);
}
