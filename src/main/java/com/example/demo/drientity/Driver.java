package com.example.demo.drientity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Driver 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long driverId;
	private String name;
	private String location;
	private boolean availability;
	
	public Driver() 
	{
		super();
	}
	
	public Driver(Long driverId, String name, String location, boolean availability) 
	{
		super();
		this.driverId = driverId;
		this.name = name;
		this.location = location;
		this.availability = availability;
	}
	
	public Long getDriverId() 
	{
		return driverId;
	}
	
	public void setDriverId(Long driverId) 
	{
		this.driverId = driverId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getLocation() 
	{
		return location;
	}
	
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public boolean isAvailability() 
	{
		return availability;
	}
	
	public void setAvailability(boolean availability) 
	{
		this.availability = availability;
	}
}
