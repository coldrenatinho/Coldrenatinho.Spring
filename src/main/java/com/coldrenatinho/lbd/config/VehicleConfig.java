package com.coldrenatinho.lbd.config;

import com.coldrenatinho.lbd.model.Vehicle;
import com.coldrenatinho.lbd.repository.VehicleRepossitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class VehicleConfig {

    @Bean
    CommandLineRunner commandLineRunner(VehicleRepossitory vehicleRepossitory){
        return args -> {
            Vehicle Golbola = new Vehicle(
                    1L,
                    "Golbolinha",
                    LocalDate.of(2000, Month.JANUARY, 3),
                    1,
                    1,
                    "Gol"
            );
            Vehicle RAM1000 = new Vehicle(
                    1L,
                    "RAM-1000",
                    LocalDate.of(2004, Month.JANUARY, 3),
                    1,
                    1,
                    "Dogger RAM, RAM, RAM-1000"
            );
            Vehicle GolQuadrado = new Vehicle(
                    1L,
                    "Gol",
                    LocalDate.of(1997, Month.JANUARY, 3),
                    1,
                    1,
                    "Gol quadrado, golzinho, barata"
            );
            Vehicle Model1 = new Vehicle(
                    1L,
                    "Tesla Model 1",
                    LocalDate.of(2020, Month.JANUARY, 3),
                    1,
                    3,
                    "Tesla Model 1"
            );
            Vehicle Model2 = new Vehicle(
                    1L,
                    "Tesla Model 2",
                    LocalDate.of(2000, Month.JANUARY, 3),
                    1,
                    3,
                    "Tesla Model 3"
            );

            vehicleRepossitory.saveAll(
                    List.of(Model1,Model2,Golbola,GolQuadrado,RAM1000)
            );

        };


    }

}
