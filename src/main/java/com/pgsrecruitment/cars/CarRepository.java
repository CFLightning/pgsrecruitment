package com.pgsrecruitment.cars;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

	public static List<Car> carsRepo = new ArrayList<Car>();

	public static void AddCar(Car car) {
		CarRepository.carsRepo.add(car);
	}

	public static List<String> AllCars() {
		List<String> carList = new ArrayList<>();
		for (Car car : carsRepo) {
			carList.add(car.getMake() + ", " + car.getModel() + ", " + car.getProdYear());
		}
		return carList;
	}
}
