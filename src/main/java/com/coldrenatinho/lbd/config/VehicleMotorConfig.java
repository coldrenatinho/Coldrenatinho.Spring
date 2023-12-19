package com.coldrenatinho.lbd.config;

import com.coldrenatinho.lbd.model.VehicleEnige;
import com.coldrenatinho.lbd.repository.VehicleEnigeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

@Configuration
public class VehicleMotorConfig {

    @Bean("VehicleEnigeConfig")
    @Order(3)
    CommandLineRunner commandLineRunner_VehicleEnige
            (VehicleEnigeRepository vehicleEnigeRepository){
        return args -> {
            VehicleEnige Eletrico = new VehicleEnige(
                    1L,
                    "Elétrico"
            ) ;
            VehicleEnige Diesel = new VehicleEnige(
                    2L,
                    "Diesel"
            ) ;
            VehicleEnige Flex = new VehicleEnige(
                    3L,
                    "Flex"
            ) ;
            VehicleEnige Gasolina = new VehicleEnige(
                    4L,
                    "Gasolina"
            ) ;
            VehicleEnige Hibrido = new VehicleEnige(
                    5L,
                    "Hibrido"
            ) ;

            vehicleEnigeRepository.saveAll(
                    List.of(Eletrico, Gasolina, Flex, Diesel, Hibrido)
            );
        };
    }

}
