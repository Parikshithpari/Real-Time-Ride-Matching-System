package com.example.demo.model;

import java.util.UUID;

public class RideRequest 
{
	
	private String userId = UUID.randomUUID().toString();
	private String pickupLocation;
	private String dropLocation;
	public RideRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RideRequest(String userId, String pickupLocation, String dropLocation) {
		super();
		this.userId = userId;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	
	
}
