package com.flightapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entity.flightBooking;

public interface UsersRepo extends JpaRepository<flightBooking, Long> {
	
	public List<flightBooking> findAllByEmail(String email);

	public List<flightBooking> findByPnr(long pnr);


}
