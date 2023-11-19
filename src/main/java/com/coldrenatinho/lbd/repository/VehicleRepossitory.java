package com.coldrenatinho.lbd.repository;

import com.coldrenatinho.lbd.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface VehicleRepossitory extends  JpaRepository<Vehicle, Long>{
}
