package com.rest.RestDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.RestDemo.entity.Car;
import com.rest.RestDemo.service.CarService;

@RestController
public class CarController {
	@Autowired
	private CarService cservice;
	
	@PostMapping("addCar")
	public String addCar(@RequestBody Car c)
	{
		return cservice.addCar(c);
	}
	
	@GetMapping("viewCars")
	public List<Car> viewCars()
	{
		return cservice.viewCars();
	}
	
	@GetMapping("viewCar/{regno}")
	public Car viewCar(@PathVariable int regno)
	{
		return cservice.viewCar(regno);
	}
	
	@DeleteMapping("deleteCar/{regno}")
	public String deleteCar(@PathVariable int regno)
	{
		return cservice.deleteCar(regno);
	}
	
	@PutMapping("updateCar")
	public String updateCar(@RequestBody Car c)
	{
		return cservice.updateCar(c);
	}
}
