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

@Configuration("VehicleBrand Config")
public class VehicleBrandConfig {

    @Bean
    CommandLineRunner commandLineRunner_VehicleBrandConfig(VehicleBrandRepository vehicleBrandRepository) {
        return args -> {
            VehicleBrand Tesla = new VehicleBrand(
                    1L,
                    "Tesla"
            );
            VehicleBrand Ford = new VehicleBrand(
                    2L,
                    "Ford"
            );
            VehicleBrand Mercedes = new VehicleBrand(
                    3L,
                    "Mercedes"
            );
            VehicleBrand Audi = new VehicleBrand(
                    4L,
                    "Audi"
            );
            VehicleBrand volkswagen = new VehicleBrand(
                    5L,
                    "volkswagen"
            );
            VehicleBrand AstomMartim = new VehicleBrand(
                    6L,
                    "Astom Martim"
            );
            VehicleBrand Ferrari = new VehicleBrand(
                    7L,
                    "Ferrari"
            );
            VehicleBrand Pegou = new VehicleBrand(
                    8L,
                    "Pegou"
            );

            vehicleBrandRepository.saveAll(
                    List.of(Tesla, Audi, Ferrari, AstomMartim, Ford, Pegou, Mercedes, volkswagen)
            );


        };
    }
}
