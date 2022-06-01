package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entity.flightBooking;

public interface UsersRepo extends JpaRepository<flightBooking, Long> {

}
