package com.coldrenatinho.lbd.config;

import com.coldrenatinho.lbd.model.VehicleBrand;
import com.coldrenatinho.lbd.repository.VehicleBrandRepository;
import com.coldrenatinho.lbd.repository.VehicleRepossitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class VehicleBrandConfig {

    @Bean("VehicleBrandConnfig")
    CommandLineRunner commandLineRunner_VehicleBrandConfig(VehicleBrandRepository vehicleBrandRepository) {
        return args -> {
            VehicleBrand Tesla = new VehicleBrand(
                    1L,
                    "Tesla"
            );
            VehicleBrand Ford = new VehicleBrand(
                    1L,
                    "Ford"
            );
            VehicleBrand Mercedes = new VehicleBrand(
                    1L,
                    "Mercedes"
            );
            VehicleBrand Audi = new VehicleBrand(
                    1L,
                    "Audi"
            );
            VehicleBrand volkswagen = new VehicleBrand(
                    1L,
                    "volkswagen"
            );
            VehicleBrand AstomMartim = new VehicleBrand(
                    1L,
                    "Astom Martim"
            );
            VehicleBrand Ferrari = new VehicleBrand(
                    1L,
                    "Ferrari"
            );
            VehicleBrand Pegou = new VehicleBrand(
                    1L,
                    "Pegou"
            );

            vehicleBrandRepository.saveAll(
                    List.of(Tesla, Audi, Ferrari, AstomMartim, Ford, Pegou, Mercedes, volkswagen)
            );


        };
    }
}
