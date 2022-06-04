package com.flightapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

public class passengers {
	
	public passengers() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	
	@Column
	private int userId;
	
	@Column
	private String passengerName;
	
	@Column
	private int passengerAge;
	
	@Column
	private String seats;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "passengers [passengerId=" + passengerId + ", userId=" + userId + ", passengerName=" + passengerName
				+ ", passengerAge=" + passengerAge + ", seats=" + seats + "]";
	}

	public passengers(int passengerId, int userId, String passengerName, int passengerAge, String seats) {
		super();
		this.passengerId = passengerId;
		this.userId = userId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.seats = seats;
	}

}
