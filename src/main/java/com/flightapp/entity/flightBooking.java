package com.flightapp.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Entity
public class flightBooking {
	
	public flightBooking() {};
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private long phoneNo;
	@Column
	private String email;
	
	@Column
	private long flightId;
	

	@Column
	private Date arrivalTime;
	@Column
	private Date departureTime;
	@Column
	private Date date;
	@Column
	private String bookingStatus;
	@Column
	private String meal;
	@Column
	private String pnr;
	@Column
	private double price;
	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getFlightId() {
		return flightId;
	}


	public void setFlightId(long flightI) {
		this.flightId = flightI;
	}


	

	public flightBooking(int userId, String firstName, String lastName, long phoneNo, String email, int flightId,
			Date arrivalTime, Date departureTime, Date date, String bookingStatus, String meal, String pnr,
			double price) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.flightId = flightId;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.date = date;
		this.bookingStatus = bookingStatus;
		this.meal = meal;
		this.pnr = pnr;
		this.price = price;
	}


	@Override
	public String toString() {
		return "flightBooking [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + ", email=" + email + ", flightId=" + flightId + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + ", date=" + date + ", bookingStatus=" + bookingStatus + ", meal="
				+ meal + ", pnr=" + pnr + ", price=" + price +  "]";
	}


	public Date getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public Date getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String status) {
		this.bookingStatus = status;
	}


	public String getMeal() {
		return meal;
	}


	public void setMeal(String meal) {
		this.meal = meal;
	}


	public String getPNR() {
		return pnr;
	}


	public void setPNR(String pnr) {
		this.pnr = pnr;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passengerId", referencedColumnName="userId")
	private passengers passengers;*/
	
}
