package com.coldrenatinho.lbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.coldrenatinho.lbd.model.Vehicle;


public interface VehicleRepossitory extends  JpaRepository<Vehicle, Long>{
}
