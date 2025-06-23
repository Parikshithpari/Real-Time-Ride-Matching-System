package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.example.demo.model.RideRequest;

@Service
public class RideRequestProducer 
{
	@Autowired
	private KafkaTemplate<String, RideRequest> KafkaTemplate;
	
	public void sendRideRequest(RideRequest request)
	{
		KafkaTemplate.send("ride-request", request);
	}
	
}
