package com.coldrenatinho.lbd.model;

import jakarta.persistence.*;


@Entity
@Table
public class VehicleEnige {
    @Id
    @SequenceGenerator(
            name = "vehicle_enige_sequence",
            sequenceName = "vehicle_enige_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "vehicle_enige_sequence"

    )
    private Long id;
    private String Descripition;


    public VehicleEnige() {
    }

    public VehicleEnige(Long id, String descripition) {
        this.id = id;
        Descripition = descripition;
    }

    public VehicleEnige(String descripition) {
        Descripition = descripition;
    }

    public VehicleEnige(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripition() {
        return Descripition;
    }

    public void setDescripition(String descripition) {
        Descripition = descripition;
    }

    @Override
    public String toString() {
        return "VehicleEnige{" +
                "id=" + id +
                ", Descripition='" + Descripition + '\'' +
                '}';
    }
}
