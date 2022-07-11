package com.rest.RestDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.RestDemo.entity.Car;

public interface CarRepo extends JpaRepository<Car,Integer>{

}
