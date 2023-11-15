package com.coldrenatinho.lbd.model;

import java.time.LocalDate;

public class Vehicle {
    private long id; // Id do carro reistrado
    private long veicle_type_id; //Tipo de veículo: Moto, SUV, PickUp...
    private String Name; //Nome comercial do veículo
    private LocalDate year_lauch; //Ano do lançamanto do Veículo
    private long brand_id; // Marca do carro
    private long enige_type_id; // tipo de Motor Combustão, Hibrido, Elétrico
    private String seach_name; // concatenar Name + Brand

    public Vehicle() {
    }


    public Vehicle(long id, long veicle_type_id, String name, LocalDate year_lauch, long brand_id, long enige_type_id, String seach_name) {
        this.id = id;
        this.veicle_type_id = veicle_type_id;
        Name = name;
        this.year_lauch = year_lauch;
        this.brand_id = brand_id;
        this.enige_type_id = enige_type_id;
        this.seach_name = seach_name;
    }

    public Vehicle(long veicle_type_id, String name, LocalDate year_lauch, long brand_id, long enige_type_id, String seach_name) {
        this.veicle_type_id = veicle_type_id;
        Name = name;
        this.year_lauch = year_lauch;
        this.brand_id = brand_id;
        this.enige_type_id = enige_type_id;
        this.seach_name = seach_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVeicle_type_id() {
        return veicle_type_id;
    }

    public void setVeicle_type_id(long veicle_type_id) {
        this.veicle_type_id = veicle_type_id;
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

    public long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(long brand_id) {
        this.brand_id = brand_id;
    }

    public long getEnige_type_id() {
        return enige_type_id;
    }

    public void setEnige_type_id(long enige_type_id) {
        this.enige_type_id = enige_type_id;
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
                ", veicle_type_id=" + veicle_type_id +
                ", Name='" + Name + '\'' +
                ", year_lauch=" + year_lauch +
                ", brand_id=" + brand_id +
                ", enige_type_id=" + enige_type_id +
                ", seach_name='" + seach_name + '\'' +
                '}';
    }



}
