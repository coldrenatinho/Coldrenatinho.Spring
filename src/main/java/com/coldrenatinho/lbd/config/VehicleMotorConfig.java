package com.coldrenatinho.lbd.config;

import com.coldrenatinho.lbd.model.VehicleEnige;
import com.coldrenatinho.lbd.repository.VehicleEnigeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class VehicleMotorConfig {

    @Bean("VehicleEnigeConfig")
    CommandLineRunner commandLineRunner_VehicleEnige
            (VehicleEnigeRepository vehicleEnigeRepository){
        return args -> {
            VehicleEnige Eletrico = new VehicleEnige(
                    "Elétrico"
            ) ;
            VehicleEnige Diesel = new VehicleEnige(
                    "Diesel"
            ) ;
            VehicleEnige Flex = new VehicleEnige(
                    "Flex"
            ) ;
            VehicleEnige Gasolina = new VehicleEnige(
                    "Gasolina"
            ) ;
            VehicleEnige Hibrido = new VehicleEnige(
                    "Hibrido"
            ) ;

            vehicleEnigeRepository.saveAll(
                    List.of(Eletrico, Gasolina, Flex, Diesel, Hibrido)
            );
        };
    }

}
