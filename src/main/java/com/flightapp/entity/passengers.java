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
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class passengers {
	
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

}
