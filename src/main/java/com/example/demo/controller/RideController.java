package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.drientity.Driver;
import com.example.demo.model.RideRequest;
import com.example.demo.repo.DriverRepository;
import com.example.demo.service.RideRequestProducer;

@RestController
public class RideController 
{
	@Autowired
	private RideRequestProducer producer;
	
	@Autowired
	private DriverRepository driverRepo;
	
	@PostMapping("driver")
	public Driver saveDriver(@RequestBody Driver driver)
	{
		return driverRepo.save(driver);
	}
	
	@PostMapping("/request")
	public ResponseEntity<String> requestRide(@RequestBody RideRequest request)
	{
		producer.sendRideRequest(request);
		return ResponseEntity.ok("Ride request sent");
	}
}
