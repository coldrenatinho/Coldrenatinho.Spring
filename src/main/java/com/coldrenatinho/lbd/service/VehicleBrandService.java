package com.coldrenatinho.lbd.service;

import com.coldrenatinho.lbd.model.Vehicle;
import com.coldrenatinho.lbd.model.VehicleBrand;
import com.coldrenatinho.lbd.repository.VehicleBrandRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleBrandService {

    private VehicleBrandRepository vehicleBrandRepository;

    @Autowired
    public VehicleBrandService(VehicleBrandRepository vehicleBrandRepository) {
        this.vehicleBrandRepository = vehicleBrandRepository;
    }

    public List<VehicleBrand> getVehicleBrand() {
        return vehicleBrandRepository.findAll();
    }

    public void registeNewBrand(VehicleBrand vehicleBrand) {
        vehicleBrandRepository.save(vehicleBrand);
    }

    public void deleteVehicleBrandById(Long id) {
        vehicleBrandRepository.deleteById(id);
    }

    @Transactional
    public void updateVehicleBrandByid(Long id, VehicleBrand vehicleBrand) {
        boolean exists = vehicleBrandRepository.existsById(id);
        if(exists){
            ResponseEntity<VehicleBrand> vehicleBrandResponseEntity = vehicleBrandRepository.findById(id).map(record ->{
                record.setDescription(vehicleBrand.getDescription());
                VehicleBrand update = vehicleBrandRepository.save(record);
                return ResponseEntity.status(200).body(update);
            }).orElse(ResponseEntity.notFound().build());
        }else{
            throw new IllegalStateException("Não foi possivel encontrar o id informado: id:" + id);
        }
    }
}
