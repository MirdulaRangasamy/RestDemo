package com.rest.RestDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int regno;
	private String brand;
	private double cost;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int regno, String brand, double cost) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.cost = cost;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Car [regno=" + regno + ", brand=" + brand + ", cost=" + cost + "]";
	}
	
}
