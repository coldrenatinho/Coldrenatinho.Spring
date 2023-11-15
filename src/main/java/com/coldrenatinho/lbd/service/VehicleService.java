package com.coldrenatinho.lbd.service;


import com.coldrenatinho.lbd.model.Vehicle;
import com.coldrenatinho.lbd.repository.VehicleRepossitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VehicleService {

    public final VehicleRepossitory vehicleRepossitory;

    @Autowired
    public VehicleService(VehicleRepossitory vehicleRepossitory) {
        this.vehicleRepossitory = vehicleRepossitory;
    }

    public List<Vehicle> getVehicles() { return vehicleRepossitory.findAll();

    }
}
