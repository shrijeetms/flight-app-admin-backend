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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class flightBooking {
	
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
	private int flightId;
	@Column
	private Date fromDate;
	@Column
	private Date toDate;
	@Column
	private Boolean bookingStatus;
	@Column
	private String meal;
	@Column
	private String PRN;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passengerId", referencedColumnName="userId")
	private passengers passengers;
	
}
