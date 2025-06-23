package com.example.demo.model;

import java.util.UUID;

public class RideStatus 
{
	private String rideId = UUID.randomUUID().toString();
	private String status;
	public RideStatus(String rideId, String status) {
		super();
		this.rideId = rideId;
		this.status = status;
	}
	public RideStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRideId() {
		return rideId;
	}
	public void setRideId(String rideId) {
		this.rideId = rideId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
