package com.flightapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.flightBooking;
import com.flightapp.repository.UsersRepo;


@Service
public class flightBookingService {

	
	@Autowired
	UsersRepo userRepo;
	
	public void bookFlight(long flightId, flightBooking flightBooking, String status) {
		flightBooking.setFlightId(flightId);
		flightBooking.setBookingStatus(status);
		userRepo.save(flightBooking);
	}

	public void cancleFlight(int userId, flightBooking flightBooking, String status) {
		flightBooking.setFlightId(userId);
		flightBooking.setBookingStatus(status);
		userRepo.save(flightBooking);
	}

	public List<flightBooking> getFlightHistory(String email) {
		return userRepo.findAllByEmail(email);
	}

	public List<flightBooking> getTicket(long pnr) {
		return userRepo.findByPnr(pnr);
	}
	
	
}
