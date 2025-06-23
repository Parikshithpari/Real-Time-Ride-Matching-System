package com.example.demo.model;

public class MatchedRide 
{
	private Long driverId;
	private String userId;
	private String pickupLocation;
	private String dropLocation;
	private String status;
	
	public MatchedRide(Long driverId, String userId, String pickupLocation, String dropLocation, String status) {
		super();
		this.driverId = driverId;
		this.userId = userId;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.status = status;
	}
	public MatchedRide() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
