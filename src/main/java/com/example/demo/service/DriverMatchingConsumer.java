package com.example.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.example.demo.drientity.Driver;
import com.example.demo.model.MatchedRide;
import com.example.demo.model.RideRequest;
import com.example.demo.repo.DriverRepository;

@Service
public class DriverMatchingConsumer 
{
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	@Autowired
	private DriverRepository driverRepo;
	
	@KafkaListener(topics = "ride-request", groupId = "driver-group")
	public void matchDriver(RideRequest request)
	{
		Optional<Driver> driverOpt = driverRepo.getDriverByLocation(request.getPickupLocation());
		
		if(driverOpt.isPresent())
		{
			Driver driver = driverOpt.get();
			driver.setAvailability(true);
			driverRepo.save(driver);
			
			MatchedRide matchedRide = new MatchedRide(
			driver.getDriverId(),
			request.getUserId(),
			request.getPickupLocation(),
			request.getDropLocation(),
			"Matched"
			);
			kafkaTemplate.send("driver-matching", matchedRide);
		}
		else
		{
			System.out.println("no available drivers near by :("+ request.getPickupLocation());
		}
	}
	
}
