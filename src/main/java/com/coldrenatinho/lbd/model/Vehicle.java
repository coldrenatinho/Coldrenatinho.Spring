package com.coldrenatinho.lbd.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Vehicle {
    @Id
    @SequenceGenerator(
            name = "vehicle_sequence",
            sequenceName = "vehicle_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "vehicle_sequence"
    )
    private long id; // Id do carro reistrado
    @ManyToOne
    @JoinColumn(name = "vehicle_type_id")
    private VehicleType vehicleType;
    private String Name; //Nome comercial do veículo
    private LocalDate year_lauch; //Ano do lançamanto do Veículo
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private VehicleBrand vehicleBrand;
/*
    private long brand_id; // Marca do carro
*/
    @ManyToOne
    @JoinColumn(name = "enige_type_id")
    private VehicleEnige vehicleEnige;
/*
    private long enige_type_id; // tipo de Motor Combustão, Hibrido, Elétrico
*/
    private String seach_name; // concatenar Name + Brand

    public Vehicle() {
    }


    public Vehicle(long id, VehicleType vehicleType, String name, LocalDate year_lauch, VehicleBrand vehicleBrand, VehicleEnige vehicleEnige, String seach_name) {
        this.id = id;
        this.vehicleType = vehicleType;
        Name = name;
        this.year_lauch = year_lauch;
        this.vehicleBrand = vehicleBrand;
        this.vehicleEnige = vehicleEnige;
        this.seach_name = seach_name;
    }

    public Vehicle(VehicleType vehicleType, String name, LocalDate year_lauch, VehicleBrand vehicleBrand,VehicleEnige vehicleEnige, String seach_name) {
        this.vehicleType = vehicleType;
        Name = name;
        this.year_lauch = year_lauch;
        this.vehicleBrand = vehicleBrand;
        this.vehicleEnige = vehicleEnige;
        this.seach_name = seach_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public VehicleType getVeicle_type_id() {
        return vehicleType;
    }

    public void setVeicle_type_id(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getYear_lauch() {
        return year_lauch;
    }

    public void setYear_lauch(LocalDate year_lauch) {
        this.year_lauch = year_lauch;
    }

    public VehicleBrand getBrand_id() {
        return vehicleBrand;
    }

    public void setBrand_id(VehicleBrand vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public VehicleEnige getEnige_type_id() {
        return vehicleEnige;
    }

    public void setEnige_type_id(VehicleEnige vehicleEnige) {
        this.vehicleEnige = vehicleEnige;
    }

    public String getSeach_name() {
        return seach_name;
    }

    public void setSeach_name(String seach_name) {
        this.seach_name = seach_name;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicleType=" + vehicleType +
                ", Name='" + Name + '\'' +
                ", year_lauch=" + year_lauch +
                ", brand_id=" + vehicleBrand +
                ", enige_type_id=" + vehicleEnige +
                ", seach_name='" + seach_name + '\'' +
                '}';
    }
}
