package com.flightapp.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.exception.UserNotFoundException;
import com.flightapp.entity.flightBooking;
import com.flightapp.repository.UsersRepo;


@Service
public class flightBookingService {

	
	@Autowired
	UsersRepo userRepo;
	
	public String bookFlight(long flightId, flightBooking flightBooking, String status) {
		flightBooking.setFlightId(flightId);
		flightBooking.setBookingStatus(status);
		flightBooking.setPnr(getPNR());
		try {
		userRepo.save(flightBooking);
		return flightBooking.getPnr();}
		catch (Exception e) {throw new UserNotFoundException();}
		
	}

	public void cancleFlight(int userId, flightBooking flightBooking, String status) {
		flightBooking.setFlightId(userId);
		flightBooking.setBookingStatus(status);
		try {
			userRepo.save(flightBooking);}
		catch (Exception e) {throw new UserNotFoundException();}
	}

	public List<flightBooking> getFlightHistory(String email) {
		if(userRepo.findAllByEmail(email).isEmpty()) {
			throw new UserNotFoundException();
		}
		else {
		return userRepo.findAllByEmail(email);}
	}

	public List<flightBooking> getTicket(long pnr) {
		if(userRepo.findByPnr(pnr).isEmpty()) {
			throw new UserNotFoundException();
		}
		else {
		return userRepo.findByPnr(pnr);}
		
	}
	
	public String getPNR(){
		Random random = new Random();
		Date date = new Date();
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		Integer Yr = calender.get(Calendar.YEAR);
		Integer Mon = calender.get(Calendar.MONTH);
		Integer Dt = calender.get(Calendar.DATE);
		String PNR = "PNR"+""+Yr+""+Mon+""+Dt+""+ random.nextInt(10000);
		return PNR;
	}
}
