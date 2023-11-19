package com.coldrenatinho.lbd.controller;


import com.coldrenatinho.lbd.model.Vehicle;
import com.coldrenatinho.lbd.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<Vehicle> getVehicle(){return vehicleService.getVehicles();}

    @PostMapping
    public void registerNewVehicle(@RequestBody Vehicle vehicle){
        vehicleService.addNewVehicle(vehicle);
    }

    @DeleteMapping(path = "{id}")
    public void deleteVeicle(
            @PathVariable("id") Long id){
                vehicleService.deleteVehicle(id);
    }

    @PutMapping(path = "{id}")
    public void updateVehicle(@PathVariable("id") Long id, @RequestBody Vehicle vehicle){
        vehicleService.updateVehicle(id, vehicle);
    }

}
