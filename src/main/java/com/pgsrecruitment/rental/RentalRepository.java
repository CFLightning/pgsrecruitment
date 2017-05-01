package com.pgsrecruitment.rental;

import java.util.ArrayList;
import java.util.List;

public class RentalRepository {

	public static List<String> rentalsRepo = new ArrayList<String>();
	
	public static void AddRental(String rental) {
		RentalRepository.rentalsRepo.add(rental);
	}
	
	public static List<String> AllRentals() {
		return rentalsRepo;
	}
}
