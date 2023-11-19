package com.coldrenatinho.lbd.service;


import com.coldrenatinho.lbd.model.Vehicle;
import com.coldrenatinho.lbd.repository.VehicleRepossitory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class VehicleService {

    public final VehicleRepossitory vehicleRepossitory;

    @Autowired
    public VehicleService(VehicleRepossitory vehicleRepossitory) {
        this.vehicleRepossitory = vehicleRepossitory;
    }

    public List<Vehicle> getVehicles() {
        return vehicleRepossitory.findAll();
    }

    public void addNewVehicle(Vehicle vehicle) {
        vehicleRepossitory.save(vehicle);
        System.out.println("Novo carro Adicionado:" + vehicle );
    }

    public void deleteVehicle(Long id){
        boolean exits = vehicleRepossitory.existsById(id);
        if(!exits){
            throw new IllegalArgumentException(
                    "O Veículo selecionado não existe na base de dados: Veículo ID = " + id
            );
        } vehicleRepossitory.deleteById(id);
        System.out.println("Veículo Deletado com sucesso");
    }

    @Transactional
    public void updateVehicle(Long id, Vehicle vehicle){
        boolean exists = vehicleRepossitory.existsById(id);
        if (exists){
            ResponseEntity<Vehicle> Vehicle = vehicleRepossitory.findById(id).map(record -> {
                record.setName(vehicle.getName());
                record.setBrand_id(vehicle.getBrand_id());
                record.setEnige_type_id(vehicle.getEnige_type_id());
                record.setYear_lauch(vehicle.getYear_lauch());
                record.setSeach_name(vehicle.getSeach_name());
                record.setVeicle_type_id(vehicle.getVeicle_type_id());
                Vehicle update = vehicleRepossitory.save(record);
                return ResponseEntity.status(200).body(update);
            }).orElse(ResponseEntity.notFound().build());
            System.out.println("Update Vehicle: id: " + id + " " + "set" + vehicle);
        }else{
            throw new IllegalStateException("Não foi possivel encotrar um Veículo com o id inoformado: " + id + "From postMethod: " + vehicle );
        }
    }

}
