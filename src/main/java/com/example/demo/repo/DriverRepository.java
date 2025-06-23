package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.drientity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long>
{
	Optional<Driver> getDriverByLocation(String location);
}
