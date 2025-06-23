package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.example.demo.model.RideStatus;

@Service
public class RideStatusProducer 
{
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public void updateRideStatus(String rideId, String status) {
	        kafkaTemplate.send("ride-updates", new RideStatus(rideId, status));
	    }
	}


