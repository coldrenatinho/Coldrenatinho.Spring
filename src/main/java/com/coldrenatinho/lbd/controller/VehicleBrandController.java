package com.coldrenatinho.lbd.controller;

import com.coldrenatinho.lbd.model.VehicleBrand;
import com.coldrenatinho.lbd.service.VehicleBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Brand")
public class VehicleBrandController {

   private final VehicleBrandService vehicleBrandService;

   @Autowired
    public VehicleBrandController(VehicleBrandService vehicleBrandService) {
        this.vehicleBrandService = vehicleBrandService;
    }

    @GetMapping
    public List<VehicleBrand> getVehicleBrand(){
        return vehicleBrandService.getVehicleBrand();
    }

    @PostMapping
    public void registerNewVehicleBrand(@RequestBody VehicleBrand vehicleBrand){
        vehicleBrandService.registeNewBrand(vehicleBrand);
    }

    @DeleteMapping(path = "{id}")
    public void deleteVehicleBrand(@PathVariable("id") Long id){
       vehicleBrandService.deleteVehicleBrandById((id));
    }

    @PutMapping(path = "{id}")
    public void updateVehicleBrandById(@PathVariable("id") Long id, @RequestBody VehicleBrand vehicleBrand){
       vehicleBrandService.updateVehicleBrandByid(id, vehicleBrand);
    }

}
