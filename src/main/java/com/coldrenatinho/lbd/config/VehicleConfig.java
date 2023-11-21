package com.coldrenatinho.lbd.config;

import com.coldrenatinho.lbd.model.Vehicle;
import com.coldrenatinho.lbd.model.VehicleBrand;
import com.coldrenatinho.lbd.model.VehicleEnige;
import com.coldrenatinho.lbd.model.VehicleType;
import com.coldrenatinho.lbd.repository.VehicleRepossitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class VehicleConfig {

    @Bean("VehicleConfig")
    @Order(999)
    CommandLineRunner commandLineRunner_VehicleConfig
            (VehicleRepossitory vehicleRepossitory){
        return args -> {
            Vehicle Golbola = new Vehicle(
                    new VehicleType(1L,
                            "sedan"),
                    "Golbolinha",
                    LocalDate.of(2000, Month.JANUARY, 3),
                    new VehicleBrand(1L),
                    new VehicleEnige(1L),
                    "Gol"
            );
            Vehicle RAM1000 = new Vehicle(
                    new VehicleType(1L, "sedan"),
                    "Golbolinha",
                    LocalDate.of(2000, Month.JANUARY, 3),
                    new VehicleBrand(1L),
                    new VehicleEnige(1L),
                    "Gol"
            );
            Vehicle GolQuadrado = new Vehicle(
                    new VehicleType(1L, "sedan"),
                    "Golbolinha",
                    LocalDate.of(2000, Month.JANUARY, 3),
                    new VehicleBrand(1L),
                    new VehicleEnige(1L),
                    "Gol"
            );
            Vehicle Model1 = new Vehicle(
                    new VehicleType(1L, "sedan"),
                    "Golbolinha",
                    LocalDate.of(2000, Month.JANUARY, 3),
                    new VehicleBrand(1L),
                    new VehicleEnige(1L),
                    "Gol"
            );
            Vehicle Model2 = new Vehicle(
                    new VehicleType(1L, "sedan"),
                    "Golbolinha",
                    LocalDate.of(2000, Month.JANUARY, 3),
                    new VehicleBrand(1L),
                    new VehicleEnige(1L),
                    "Gol"
            );

            vehicleRepossitory.saveAll(
                    List.of(Model1,Model2,Golbola,GolQuadrado,RAM1000)
            );

        };


    }



}
