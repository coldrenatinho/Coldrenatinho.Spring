package com.coldrenatinho.lbd.config;

import com.coldrenatinho.lbd.model.VehicleType;
import com.coldrenatinho.lbd.repository.VehicleTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class VehicleTypeConfig {

    @Bean
    CommandLineRunner commandLineRunner_VehicleTypeConfig
            (VehicleTypeRepository vehicleTypeRepository){
        return args -> {
            VehicleType Sedan = new VehicleType(
              "Sedan"
            );
            VehicleType SUV = new VehicleType(
                    "SUV"
            );
            VehicleType Sport = new VehicleType(
                    "Sport"
            );
            VehicleType Truck = new VehicleType(
                    "Truck"
            );
            VehicleType Pickup = new VehicleType(
                    "Pickup"
            );

            vehicleTypeRepository.saveAll(
                    List.of(Sedan, Pickup ,Sport ,SUV ,Truck)
            );
        };
    }



}
