package com.coldrenatinho.lbd.controller;

import com.coldrenatinho.lbd.model.VehicleEnige;
import com.coldrenatinho.lbd.model.VehicleType;
import com.coldrenatinho.lbd.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/vehicle-type")
public class VehicleTypeController {

    private final VehicleTypeService vehicleTypeService;

    @Autowired
    public VehicleTypeController(VehicleTypeService vehicleTypeService) {
        this.vehicleTypeService = vehicleTypeService;
    }


    @GetMapping
    public List<VehicleType> getVehicleEnige(){
        return vehicleTypeService.getVehicleEnige();
    }

    @PostMapping
    public void registerNewVehicleEnige(@RequestBody VehicleType vehicleType){
        vehicleTypeService.addNewVehicleType(vehicleType);
    }

    @DeleteMapping(path = "{id}")
    public void deleteVehicleEnige(@PathVariable("id") Long id){
        vehicleTypeService.deleteVehicleTypeById(id);
    }

    @PutMapping(path = "{id}")
    public void updateVehicleTypeById(@PathVariable("id") Long id, @RequestBody VehicleType vehicleType){
        vehicleTypeService.updateVehicleTypeByID(id, vehicleType);
    }



}
