package com.coldrenatinho.lbd.repository;

import com.coldrenatinho.lbd.model.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VehicleTypeRepository extends  JpaRepository<VehicleType, Long>{
}
