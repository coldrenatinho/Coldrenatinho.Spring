package com.coldrenatinho.lbd.service;


import com.coldrenatinho.lbd.model.VehicleType;
import com.coldrenatinho.lbd.repository.VehicleTypeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleTypeService {

    private final VehicleTypeRepository vehicleTypeRepository;

    @Autowired
    public VehicleTypeService(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    public List<VehicleType> getVehicleEnige() {
        return vehicleTypeRepository.findAll();
    }

    public void addNewVehicleType(VehicleType vehicleType) {
        vehicleTypeRepository.save(vehicleType);
    }

    public void deleteVehicleTypeById(Long id) {
        vehicleTypeRepository.deleteById(id);
    }

    @Transactional
    public void updateVehicleTypeByID(Long id, VehicleType vehicleType) {
        boolean exists = vehicleTypeRepository.existsById(id);
        if (exists){
            ResponseEntity<VehicleType> vehicleTypeResponseEntity = vehicleTypeRepository.findById(id).map(record -> {
                record.setDescription(vehicleType.getDescription());
                VehicleType update = vehicleTypeRepository.save(record);
                return ResponseEntity.status(200).body(update);
            }).orElse(ResponseEntity.notFound().build());
            System.out.println("Update VehicleType: id: " + id + " " + "set" + vehicleType);
        }else{
            throw new IllegalStateException("Não foi possivel encotrar um Tipe De Veículo com o id inoformado: " + id + "From postMethod: " + vehicleType );
        }
    }
}
