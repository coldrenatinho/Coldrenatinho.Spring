package com.coldrenatinho.lbd.model;


import jakarta.persistence.*;


@Entity
@Table
public class VehicleBrand {
    @Id
    @SequenceGenerator(
            name = "vehicle-brand_id",
            sequenceName = "vehicle-brand_id",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "vehicle-brand_id"
    )
    private Long id;
    private String Description;

    public VehicleBrand() {
    }

    public VehicleBrand(Long id, String description) {
        this.id = id;
        Description = description;
    }

    public VehicleBrand(String description) {
        Description = description;
    }

    public VehicleBrand(Long id) {
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
        return "VehicleBrand{" +
                "id=" + id +
                ", Description='" + Description + '\'' +
                '}';
    }
}
