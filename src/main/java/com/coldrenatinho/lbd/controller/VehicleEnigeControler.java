package com.coldrenatinho.lbd.controller;

import com.coldrenatinho.lbd.model.VehicleEnige;
import com.coldrenatinho.lbd.service.VehicleEnigeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "api/v1/engige")
public class VehicleEnigeControler {

    private final VehicleEnigeService vehicleEnigeService;

    @Autowired
    public VehicleEnigeControler(VehicleEnigeService vehicleEnigeService) {
        this.vehicleEnigeService = vehicleEnigeService;
    }

    @GetMapping
    public List<VehicleEnige> getVehicleEnige(){ return vehicleEnigeService.getVehicleEnige();}

   @PostMapping
    public void registerNewVehicleEnige(@RequestBody VehicleEnige vehicleEnige){
        vehicleEnigeService.addNewVehicleEnige(vehicleEnige);
   }

   @DeleteMapping(path = "{id}")
    public void deleteVehicleEnige(@PathVariable("id") Long id){
        vehicleEnigeService.deleteVehicleEnigeById(id);
   }

   @PutMapping(path = "{id}")
    public void updateVehicleEnigeById(@PathVariable("id") Long id, @RequestBody VehicleEnige vehicleEnige){
        vehicleEnigeService.updateVehicleEnigeByID(id, vehicleEnige);
   }

}
