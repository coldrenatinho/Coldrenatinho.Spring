package com.coldrenatinho.lbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.coldrenatinho.lbd.model.VehicleBrand;

public interface VehicleBrandRepository extends JpaRepository<VehicleBrand, Long>{
}
