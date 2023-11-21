package com.coldrenatinho.lbd.config;

import com.coldrenatinho.lbd.model.VehicleType;
import com.coldrenatinho.lbd.repository.VehicleTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

@Configuration
public class VehicleTypeConfig {

    @Bean("VehicleTypeConfig")
    @Order(1)
    CommandLineRunner commandLineRunner_VehicleTypeConfig
            (VehicleTypeRepository vehicleTypeRepository){
        return args -> {
            VehicleType Sedan = new VehicleType(
                    1L,
              "Sedan"
            );
            VehicleType SUV = new VehicleType(
                    2L,
                    "SUV"
            );
            VehicleType Sport = new VehicleType(
                    3L,
                    "Sport"
            );
            VehicleType Truck = new VehicleType(
                    4L,
                    "Truck"
            );
            VehicleType Pickup = new VehicleType(
                    5L,
                    "Pickup"
            );

            vehicleTypeRepository.saveAll(
                    List.of(Sedan, Pickup ,Sport ,SUV ,Truck)
            );
        };
    }



}
