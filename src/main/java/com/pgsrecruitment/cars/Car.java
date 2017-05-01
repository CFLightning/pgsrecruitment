package com.pgsrecruitment.cars;

public class Car {

	String make;
	String model; 
	int prodYear;
	
	public Car(String InitMake, String InitModel, int InitProdYear) {
		this.make = InitMake;
		this.model = InitModel;
		this.prodYear = InitProdYear;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getProdYear() {
		return prodYear;
	}
	public void setProdYear(int prodYear) {
		this.prodYear = prodYear;
	}
}
