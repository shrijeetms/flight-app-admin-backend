package com.flightapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.entity.flightBooking;



@RestController
@RequestMapping("/flight")
public class UserController {
	
	@GetMapping("/getAllFlights")
	public ResponseEntity<Object> getAllFlights() {
		return new ResponseEntity<>("test", HttpStatus.OK); 
	} 
	
	@PostMapping("/flightBooking")
	public ResponseEntity<Object> bookFlight(@RequestBody flightBooking flightBooking) {
	
		 return new ResponseEntity<>("Order updated", HttpStatus.OK);
	}

}
