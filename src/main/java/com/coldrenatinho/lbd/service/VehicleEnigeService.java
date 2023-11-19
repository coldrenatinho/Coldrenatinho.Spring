package com.coldrenatinho.lbd.service;

import com.coldrenatinho.lbd.model.VehicleEnige;
import com.coldrenatinho.lbd.repository.VehicleEnigeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleEnigeService {

    private final VehicleEnigeRepository vehicleEnigeRepository;

    @Autowired
    public VehicleEnigeService(VehicleEnigeRepository vehicleEnigeRepository) {
        this.vehicleEnigeRepository = vehicleEnigeRepository;
    }

    public List<VehicleEnige> getVehicleEnige(){
        return vehicleEnigeRepository.findAll();
    };

    public void addNewVehicleEnige(VehicleEnige vehicleEnige) {
        vehicleEnigeRepository.save(vehicleEnige);
    System.out.println("Novo Tipo de Motor cadastrado: " + vehicleEnige);
    }


    public void deleteVehicleEnigeById(Long id) {
        vehicleEnigeRepository.deleteById(id);
    }


    @Transactional
    public void updateVehicleEnigeByID(Long id, VehicleEnige vehicleEnige) {
        boolean exists = vehicleEnigeRepository.existsById(id);
        if (exists) {
            ResponseEntity<VehicleEnige> VehicleEnige = vehicleEnigeRepository.findById(id).map(record -> {
                record.setDescripition(vehicleEnige.getDescripition());
                VehicleEnige update = vehicleEnigeRepository.save(record);
                return ResponseEntity.status(200).body(update);
            }).orElse(ResponseEntity.notFound().build());
            System.out.println("Update VehicleEnige: " + id + "set :" + vehicleEnige);
        } else {
            throw new IllegalStateException("Não foi possivel encontrar o id informado: id: " + id);
        }
    }
}
