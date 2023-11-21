package com.coldrenatinho.lbd.model;


import jakarta.persistence.*;

@Entity
@Table
public class VehicleType {
    @Id
    @SequenceGenerator(
            name = "vehicle-type_sequece",
            sequenceName = "vehicle-type_sequece",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "vehicle-type_sequece"
    )
    private Long id;
    private String Description;

    public VehicleType() {
    }

    public VehicleType(Long id, String description) {
        this.id = id;
        Description = description;
    }

    public VehicleType(String description) {
        Description = description;
    }

    public VehicleType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "VehicleType{" +
                "id=" + id +
                ", Description='" + Description + '\'' +
                '}';
    }
}
