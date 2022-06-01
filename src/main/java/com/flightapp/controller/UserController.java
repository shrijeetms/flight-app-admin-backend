package com.flightapp.controller;
import com.flightapp.service.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.entity.flightBooking;



@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	flightBookingService flightBookingService;
	
	@GetMapping("/getAllFlights")
	public ResponseEntity<Object> getAllFlights() {
		return new ResponseEntity<>("test", HttpStatus.OK); 
	} 
	
	@PostMapping("/flightBooking/{flightId}/{flag}")
	public ResponseEntity<Object> bookFlight(@PathVariable long flightId,@RequestBody flightBooking flightBooking,@PathVariable String flag) {
		flightBookingService.bookFlight(flightId,flightBooking,flag);
		return new ResponseEntity<>("Ticket Booked", HttpStatus.CREATED);
	}
	
	@PutMapping("/flightCancle/{userId}/{flag}")
	public ResponseEntity<Object> bookingCancle(@PathVariable int userId,@RequestBody flightBooking flightBooking,@PathVariable String flag) {
		flightBookingService.cancleFlight(userId,flightBooking,flag);
		return new ResponseEntity<>("Ticket Cancled", HttpStatus.OK);
	}
	
	@GetMapping("/flightBooking/history/{email}")
	public List<flightBooking> getFlightHistory(@PathVariable String email) {
		return flightBookingService.getFlightHistory(email);
	}
	
	@GetMapping("/ticket/{pnr}")
	public List<flightBooking> getTicket(@PathVariable long pnr) {
		return flightBookingService.getTicket(pnr);
	}
	

}
